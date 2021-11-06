package az.coders.java_lessons.lesson_6.warmup;

public class MethodExample {

    public static int findVowelsCount(String str) {
        int count = 0;

        // use char array
        char[] vowels = {'a', 'ı', 'ə', 'ö', 'ü', 'o', 'u', 'e', 'i'};

        // delete this array
        String[] vowel = {
                "a", "ı", "ə", "ö", "ü", "o", "u", "e", "i"
        };

        // remove complexity
        for (int i = 0; i < str.length(); i++) {
            for (String a : vowel) {
                if (String.valueOf(str.charAt(i)).contains(a)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean containsVowel(char vowel) {
        return false;
    }
}
