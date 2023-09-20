package core;

import java.util.Scanner;

public class EmailValidator {

    public static final char AT = '@';
    public static final char DOT = '.';

    public static void main(String[] args) {
        System.out.println("Please enter email address:");
        String email = EmailValidator.enterEmailAddress();
        boolean isEndsDotPresent = EmailValidator.isEndsDot(email);
        int atCount = EmailValidator.countOfAt(email, AT);
        boolean isPrefixPresent = EmailValidator.isPrefixPresent(email);
        int countOfDotAfterAt = EmailValidator.countDotAfterAt(email, DOT);
        EmailValidator.validationMessage(isEndsDotPresent, atCount, isPrefixPresent, countOfDotAfterAt);
    }

    public static String enterEmailAddress() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean isEndsDot(String email) {
        boolean checkEndDot = email.endsWith(String.valueOf(DOT));
        if (checkEndDot) {
            System.out.println("Warning: email ends with dot!");
        }
        return checkEndDot;
    }

    public static int countCharacters(String email, char character) {
        int count = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == character)
                count++;
        }
        return count;
    }

    public static int countOfAt(String email, char character) {
        int countOfAt = 0;
        boolean isAtPresent = email.contains(String.valueOf(AT));
        if (!isAtPresent) {
            System.out.println("AT is not present in email!");
        } else {
            countOfAt = countCharacters(email, character);
            if (countOfAt != 1) {
                System.out.println("Warning: mail address must contain one @!");
            }
        }
        return countOfAt;
    }

    public static int countDotAfterAt(String email, char character) {
        String buffering = email.substring(email.indexOf(AT) + 1);
        int countDotAfterAt = countCharacters(buffering, character);
        if (countDotAfterAt != 1) {
            System.out.println("Warning: suffix part of email must contain one dot!");
        }
        return countDotAfterAt;
    }

    public static boolean isPrefixPresent(String email) {
        boolean checkPrefix = email.split(String.valueOf(AT))[0].isEmpty();
        if (checkPrefix) {
            System.out.println("Warning: email prefix is empty!");
        }
        return checkPrefix;
    }

    public static void validationMessage(boolean checkEndDot, int countOfAt, boolean checkPrefix, int countOfDotAfterAt) {
        if ((checkEndDot) || (countOfAt != 1) || (checkPrefix) || (countOfDotAfterAt != 1)) {
            System.out.println("Email address is not valid.");
        } else {
            System.out.println("Email address is valid.");
        }
    }
}
