package enumexercise;

public class SwitchWithEnumExercise {


    public static void main(String[] args) {
        SwitchWithEnumExercise enumExercise = new SwitchWithEnumExercise();
        enumExercise.getContact(Contact.ANDRIY);
        enumExercise.getContact(Contact.IVAN);
        enumExercise.getContact(Contact.STEPAN);
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
