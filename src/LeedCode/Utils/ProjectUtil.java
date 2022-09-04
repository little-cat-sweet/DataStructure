package LeedCode.Utils;

import java.io.File;

/**
 * @Author HongYun on 2021/11/28
 */

public class ProjectUtil {

    private static void printSelect(String[] values, String tableName){

        System.out.print("select  ");
        for(int i = 0; i < values.length; i ++){
            if(i != values.length - 1) {
                System.out.print(values[i]+ "  as " + formatValue(values[i]) + ", ");
                if (i % 2 == 0) {
                    System.out.println();
                }
            }else {
                System.out.print(values[i] + "  as " + formatValue(values[i]));
                System.out.println();
            }
        }
        System.out.println("from " + tableName);
    }
    private static String formatValue(String value){

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < value.length(); i ++){
            if(value.charAt(i) == '_'){
                res.append((char) (value.charAt(i + 1) - 32));
                ++ i;
            }else {
                res.append(value.charAt(i));
            }
        }
        return String.valueOf(res);
    }

    private static void printSeletSum(String[] values, String tableName){

        System.out.print("select  ");
        for(int i = 0; i < values.length; i ++){
            if(i != values.length - 1) {
                System.out.print("sum(" + values[i] + ")" + "  as " + formatValue(values[i]) + ", ");
                if (i % 2 == 0) {
                    System.out.println();
                }
            }else {
                System.out.print("sum(" + values[i] + ")" + "  as " + formatValue(values[i]));
                System.out.println();
            }
        }
        System.out.println("from " + tableName);
    }

    public static boolean delFile(File file) {

        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if(null != files) {
                for (File f : files) {
                    delFile(f);
                }
            }
        }
        return file.delete();
    }

    public static void main(String[] args) {
        String[] left = {"topic_id","title","content","creator"};
        ProjectUtil.printSelect(left,"topic");
    }
}
