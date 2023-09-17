package enumexercise;

public enum Contact {
    ANDRIY("Student", 35),
    IVAN("Worker", 42),
    STEPAN("Unemployed", 40);

    String status;
    int age;


    Contact(String status, int age) {
        this.status = status;
        this.age = age;
    }
}
