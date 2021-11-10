package az.coders.java_lessons.lesson_7.constructors_modifiers;

public class Main {

    public static void main(String[] args) {

        System.out.println(ModifiersEx.ID); // 123

        System.out.println(ModifiersEx.getId()); // 125

        System.out.println(ModifiersEx.UID); //321

        System.out.println(ModifiersEx.getUId()); //321


        System.out.println("Constructor example is here !");

        ConstructorEx ex = new ConstructorEx();
        System.out.println(ex.getName());
    }
}
