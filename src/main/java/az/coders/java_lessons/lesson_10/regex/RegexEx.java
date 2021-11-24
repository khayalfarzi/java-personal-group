package az.coders.java_lessons.lesson_10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Welcome to the Java World");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
