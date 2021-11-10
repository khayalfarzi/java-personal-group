package az.coders.java_lessons.lesson_7.constructors_modifiers;

/**
 * $ Modifiers
 * - Access modifiers
 * - Non access modifiers
 * <p>
 * $ Access modifiers:
 * - Class base access modifiers
 * - Class member base access modifiers
 * <p>
 * $ Class base access modifiers:
 * - Default
 * - Public
 * <p>
 * $ Class member base access modifiers:
 * <p>
 * - Public
 * - Default
 * - Protected
 * - Private
 * <p>
 * $ Non access modifiers:
 * - Class base non access modifiers
 * - Class member base non access modifiers
 * <p>
 * $ Class base non access modifiers
 * - abstract
 * - final
 * <p>
 * $ Class member base non access modifiers:
 * <p>
 * - abstract
 * - final
 * - static
 * - synchronized
 */
public class ModifiersEx {

    public static int ID = 123;

    public static final long UID = 321;

    public String name;

    private String surname;

    int age;

    protected String father;

    public static int getId() {
        ID = ID + 2;
        return ID;
    }

    public static long getUId() {
//        UID = UID + 2;
        return UID;
    }
}

class SubModifierEx {

    public String getName() {
        return null;
    }

    private String getSurname() {
        return null;
    }

    int getAge() {
        return 1;
    }

    protected String getFather() {
        return null;
    }
}