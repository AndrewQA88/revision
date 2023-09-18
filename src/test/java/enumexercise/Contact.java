package enumexercise;

public enum Contact {
    ANDRIY("Andriy", 35),
    IVAN("Ivan", 42),
    STEPAN("Stepan", 40);

    String name;
    int age;


    Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Contact getEnumValue(String name) {
        for (Contact e : values()) {
            if (e.name.equals(name)) {
                return e;
            }
        }
        return null;
    }
}
