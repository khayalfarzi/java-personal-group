package az.coders.java_lessons.lesson_11;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //0000000707.9
        //0000000707.9
        //000000707.99
//        String formatted = String.format("%12s", BigDecimal.valueOf(5.67)).replace(" ", "0");
//        System.out.println(formatted);

        String smbFile = "smb://192.168.15.20/Share$/Bank Cards/Clearing/H2H/DailyEXDFiles_DEV/EXDA107597XXX.323";
        String outputFilePathEXDA10HOP = smbFile.replace("XXX", "HOP");

        System.out.println(outputFilePathEXDA10HOP);

        String outputFilePathEXDA11HOP = smbFile.replace("EXDA10", "EXDA11")
                .replace("XXX", "HOPFEE");

        System.out.println(outputFilePathEXDA11HOP);

    }
}
