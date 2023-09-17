package enumexercise;

public class SwitchWithEnumExercise {


    public static void main(String[] args) {
        SwitchWithEnumExercise enumExercise = new SwitchWithEnumExercise();
        enumExercise.getContact(Contact.ANDRIY);
        enumExercise.getContact(Contact.IVAN);
        enumExercise.getContact(Contact.STEPAN);

        System.out.println("Get status of " + Contact.STEPAN + ": " + Contact.STEPAN.status);
        System.out.println("Get age of " + Contact.STEPAN + ": " + Contact.STEPAN.age);
        System.out.println(Contact.valueOf("IVAN"));
    }

    public void getContact(Contact contact) {
        switch (contact) {
            case ANDRIY: {
                System.out.println("Contact name: Andriy");
                break;
            }
            case IVAN: {
                System.out.println("Contact name: Ivan");
                break;
            }
            case STEPAN: {
                System.out.println("Contact name: Stepan");
                break;
            }
        }
    }
}
