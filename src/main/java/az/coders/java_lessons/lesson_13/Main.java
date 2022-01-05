package az.coders.java_lessons.lesson_13;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        String opDate = "20212809";
//        String opTime = "16:29:23";
//        String formattedDate = opDate.substring(0, 4).concat("-")
//                .concat(opDate.substring(6).concat("-"))
//                .concat(opDate.substring(4, 6));
//        String test = String.format("\\d{4}-\\d{2}-\\d{2}", opDate);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-dd-MM");
//
//        LocalDateTime dateTime = LocalDateTime.parse(formattedDate.concat("T").concat(opTime));
//
//        System.out.println(dateTime.getDayOfMonth());


        List<Integer> b = Arrays.asList(1, 8, 9, 2, 3, 5, 4);
        int max = b.stream().max(Integer::compareTo).get();
        System.out.println(max);
    }
}
