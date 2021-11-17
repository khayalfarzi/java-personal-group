package az.coders.java_lessons.lesson_8;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
//          int[][] array1 = {{1, 2, 3}, {}, {1, 1, 1, 1, 1}};
//          int[][] array2 = new array() {{1, 1, 1}, {}, {1, 1,1, 1, 1}};
//          int[][] array3 = {1, 2, 3}, {0}, {1, 1,1, 1, 1};
//          int[][] array5 = new int[2][];

//        1) Kod ve pseudo kod arasinda ne ferqler var?
//
//        2) Alqoritm nedir? Nece izah ede bilersiniz? Numune?
//
//                3) Ededin cut ve ya tek olmasini alqoritmle nece yoxlaya bilersiniz?
//
//        4)
//
//        String s1="Java";
//        String s2="java";
//        if(expression) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
//        }

//        expression yerine ne yazmaq olar?
//
//                5)
//
//        public class Main {
//            public static void main(String[] args) {
//                System.out.println(2 + 4 * 3- 7 );          // A
//                System.out.println((2 + 4) * (3 - 7) );     // B
//                System.out.println(2 + (4 * 3) - 7 );       // C
//                System.out.println(((2 + 4) * 3) - 7 );     // D
//
//            }
//        }
//
//        Hansi ifade(ler)nin neticesi 7-dir?
//
//                6)
//        public class Main {
//            public static void main(String args[]) {
//                int num = 0;
//
//                switch (num) {
//                    default:
//                        System.out.println("default");
//                    case 0:
//                        System.out.println("case1");
//                    case 10 * 2 - 20:
//                        System.out.println("case2");
//                        break;
//                }
//            }
//        }
//
//        Output nedir?
//
//        7)
//
//        public class Main {
//            public static void main(String args[]) {
//                int i = 0;
//                for (; i < 2; i = i + 5) {
//                    if (i < 5)
//                        continue;
//                    System.out.println(i);
//                }
//                System.out.println(i);
//            }
//        }
//
//        Output nedir?
//
//        8)
//        public class Main {
//            public static int getVal() {
//                return 100;
//            }
//            public static void main(String args[]) {
//                int num = 10;
//                final int num2 = 20;
//                switch (num) {
//                    // BURAYA KOD DAXIL EDIN
//                    break;
//                    default: System.out.println("default");
//                }
//            }
//        }
//
//        A: case 10*3: System.out.println(2);
//        B: case num: System.out.println(3);
//        C: case 10/3: System.out.println(4);
//        D: case num2: System.out.println(5);
//
//        Kodlardan hansini daxil etsek, kod compile olar?
//
//        9)
//
//        System.out.println( 16  >>>  3);
//
//        Output nedir?
//
//        10)
//
//        Bildiyiniz 5 eded data structure siralayin.

    }
}
