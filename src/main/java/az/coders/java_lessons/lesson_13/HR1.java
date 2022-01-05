//package az.coders.java_lessons.lesson_13;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Stream;
//https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true
//public class HR1 {
//
//
//}
//
//import java.io.*;
//        import java.math.*;
//        import java.security.*;
//        import java.text.*;
//        import java.util.*;
//        import java.util.concurrent.*;
//        import java.util.function.*;
//        import java.util.regex.*;
//        import java.util.stream.*;
//        import static java.util.stream.Collectors.joining;
//        import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'getTotalX' function below.
//     *
//     * The function is expected to return an INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER_ARRAY a
//     *  2. INTEGER_ARRAY b
//     */
//
//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//        int maxB = b.stream().max(Integer::compareTo).get();
//        int maxA = a.stream().max(Integer::compareTo).get();
//
//        List<Integer> numbers = new ArrayList<>();
//
//        for(int i = maxA; i <= maxB; i++){
//            if(checkNumberForA(i, a) && checkNumberForB(i, b))
//                numbers.add(i);
//        }
//
//        return numbers.size();
//    }
//
//    private static boolean checkNumberForA(int number, List<Integer> a){
//        boolean result = false;
//
//        for(Integer element: a){
//            if((number % element) != 0)
//                return false;
//            else result = true;
//        }
//        return result;
//    }
//
//    private static boolean checkNumberForB(int number, List<Integer> b){
//        boolean result = false;
//
//        for(Integer element: b){
//            if((element % number) != 0)
//                return false;
//            else result = true;
//        }
//        return result;
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(firstMultipleInput[0]);
//
//        int m = Integer.parseInt(firstMultipleInput[1]);
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int total = Result.getTotalX(arr, brr);
//
//        bufferedWriter.write(String.valueOf(total));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
