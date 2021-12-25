package az.coders.java_lessons.lesson_19.small_app;

public enum Cmd {

    SP(0, "message"),
    RU(0, "message"),
    SHP(0, "message"),
    EXIT(0, "message");

    private final int code;
    private final String message;

    Cmd(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
