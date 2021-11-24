package az.coders.java_lessons.lesson_10.wrapper;

public class Main {

    public static void main(String[] args) {

        /*
         * Primitive types | Wrapper types
         * - boolean    <>      - Boolean
         * - byte       <>      - Byte
         * - short      <>      - Short
         * - char       <>      - Character
         * - int        <>      - Integer
         * - double     <>      - Double
         * - float      <>      - Float
         * - long       <>      - Long
         * */

        Integer integer = new Integer(5);

        String numS = "65";
//        int numP = numS;
        Integer numW = Integer.valueOf(numS);
        Integer numW1 = Integer.parseInt(numS);

        int bb = 5;
        Integer bbb = bb;

        Integer ccc = 67;
        int cc = ccc;
    }
}
