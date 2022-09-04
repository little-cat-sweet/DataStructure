package HongYun.Algorithm.AvariceAlgorithm.RadioSolution;

import java.util.*;

public class RadioSolution {
    public ArrayList<Map<String,ArrayList<String>>> result(){
        //Storing the result.
        ArrayList<Map<String,ArrayList<String>>> result=new ArrayList<>();
        String[] allAreasArr={"北京","上海","天津","广州","深圳","成都","杭州","大连"};
        //Storing the allAreas which the is need to be covered by radios of result.
        ArrayList<String> allAreas = new ArrayList<>(Arrays.asList(allAreasArr));
        String [] k1={"北京","上海","天津"};
        String [] k2={"广州","北京","深圳"};
        String [] k3={"成都","上海","杭州"};
        String [] k4={"上海","天津"};
        String [] k5={"杭州","大连"};
        ArrayList<String> k11=new ArrayList<>(Arrays.asList(k1));
        ArrayList<String> k22=new ArrayList<>(Arrays.asList(k2));
        ArrayList<String> k33=new ArrayList<>(Arrays.asList(k3));
        ArrayList<String> k44=new ArrayList<>(Arrays.asList(k4));
        ArrayList<String> k55=new ArrayList<>(Arrays.asList(k5));
        //Storing the all radios.
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        map.put("k1",k11);
        map.put("k2",k22);
        map.put("k3",k33);
        map.put("k4",k44);
        map.put("k5",k55);
        //It's for the circle which is below this line.
        String[] radio={"k1","k2","k3","k4","k5"};
        //Storing the result of every circle which is get the every radio's range.
        int [] value=new int[map.size()];
        while (!judge(allAreasArr,getStringArrByResultList(result))) {
            String[] arr=getStringArrByResultList(result);
            for (int i = 0; i < value.length; i++) {
                int radioValue = 0;
                for (int j = 0; j < map.get(radio[i]).size(); j++) {
                    //Storing the number of area in the radio's range.
                    String poke = String.valueOf(allAreas.indexOf(map.get(radio[i]).get(j)));
                    if (!poke.equals("-1")) {
                        if(isCity(poke)){
                            radioValue++;
                        }
                    }
                }
                value[i] = radioValue;
            }
            //Copy the value.
            int[] temp=new int[value.length];
            System.arraycopy(value, 0, temp, 0, temp.length);

                for(int j=0;j<temp.length-1;j++){
                    if(temp[j]>temp[j+1]){
                        temp[j+1]=temp[j];
                    }
                }

            //Storing the most biggest radio's range.
            int max=temp[temp.length-1];
            //Find the first radio which radio's value equals max.
            int location=0;
            for(int i=0;i<value.length;i++){
                if(value[i]==max){
                    location=i;
                    break;
                }
            }
            Map map1=new HashMap();
            map1.put(radio[location],map.get(radio[location]));
            result.add(map1);
            //The delete method is below this line, if you don't delete the value in allAreas, then you will make
            //a dead loop.
            ArrayList<String> listDelete= map.get(radio[location]);
            String[] str=new String[listDelete.size()];
            for(int i=0;i<str.length;i++){
                str[i]=listDelete.get(i);
            }
            for (String s : str) {
                allAreas.remove(s);
            }
            System.out.println(map1.get(radio[location]));
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("大");
            map.replace(radio[location], arrayList);


        }
        return result;
    }
    public static String getType(Object o){
        return o.getClass().toString();
    }
    //Judge the result whether equals allAreas.
    public static boolean judge(String[] allAreas,String[] result){
        ArrayList<String> allAreasList=new ArrayList<>();
        Collections.addAll(allAreasList, allAreas);
        ArrayList<String> resultList=result(result);
        if(allAreasList.size()>resultList.size()){
            return false;
        }else {
            for (String s : allAreasList) {
                if (!resultList.contains(s)) {
                    return false;
                }
            }
            return true;
        }
    }
    //Get the ArrayList of result which is only includes the only value in the result.
    public static ArrayList<String> result(String[] result){
        ArrayList<String> resultArrayList=new ArrayList<>();
        for (String s : result) {
            if (!resultArrayList.contains(s)) {
                resultArrayList.add(s);
            }
        }
        return resultArrayList;
    }

    //The idea has a structure.
    public String[] getStringArrByResultList(ArrayList<Map<String,ArrayList<String>>> resultList){
        //If the resultList is null, just return a wrong String[].
        if (resultList.size() == 0) {
            return new String[]{"jack"};
        } else {
            //Storing the number of how much radio int the resultList.
            int radioNumber = resultList.size();
            //Storing every city.
            ArrayList<String> result = new ArrayList<>();
            //It is used to confirm the radio.(确认是哪个radio)
            String[] radio = {"k1", "k2", "k3", "k4", "k5"};
            for (int i = 0; i < radioNumber; i++) {
                int cityNumber = 0;
                //It is used to get the confirmed radio.
                int poke = 0;
                //Find the radio in the resultList.
                for (int j = 0; j < radio.length; j++) {
                    if (resultList.get(i).get(radio[j]) != null) {
                        poke = j;
                        cityNumber = resultList.get(i).get(radio[j]).size();
                    }
                }
                //If found the radio, then just make every city which is in the radio into result.
                if (resultList.get(i).get(radio[poke]) != null) {
                    for (int t = 0; t < cityNumber; t++) {
                        result.add(resultList.get(i).get(radio[poke]).get(t));
                    }
                }

            }
            //Make the result's value into resultArr.
            String[] resultArr = new String[result.size()];
            for (int i = 0; i < resultArr.length; i++) {
                resultArr[i] = result.get(i);
            }
            return resultArr;
        }
    }
    public boolean isCity(String str) {
        String[] allAreasArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean flag = false;
        int i = 0;
        while (true) {
            if (allAreasArr[i].equals(str)) {
                flag = true;
                break;
            } else if (i == allAreasArr.length - 1) {
                break;
            } else {
                i = i + 1;
            }
        }
        return flag;
    }
}
