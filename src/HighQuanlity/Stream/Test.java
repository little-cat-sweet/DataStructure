package HighQuanlity.Stream;

import java.util.stream.Stream;

/**
 * @Author HongYun on 2022/5/26
 */

public class Test {

    public static void showCreateStream(){

//        String[] test = {"Jack", "Mary", "dsf", "亚索"};
//        Stream<String> words = Stream.of(test);
//        long count = words
//                .filter(w -> w.length() > 3)
//                .count();
//        System.out.println(count);
        Stream<Double> echos = Stream.generate(Math::random);
    }

    public static void main(String[] args) {


        showCreateStream();

//        String contents = null;
//        try {
//            contents = Files.readString(
//                    Paths.get("D:\\Test01.txt")
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        List<String> words = null;
//        if(contents != null){
//            words = List.of(contents.split("\\PL+"));
//        }
//        long count = 0;
//        if(null != words){
//            count = words.stream()
//                    .filter(w -> w.length() > 5)
//                    .count();
//        }


    }
}
