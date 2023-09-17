package core;

public class Cast {

    public static void main(String[] args) {

        //cast double to int(explicit)
        int x = 1;
        double y = 0.1;
        int z = x + (int) y;
        System.out.println(z);

        //cast int to double(implicit)
        int a = 10;
        double b = 10.5;
        double c = a + b;
        System.out.println(c);

        //cast int to char(explicit)
        int s = 87;
        char d = (char) s;
        System.out.println(d);
    }
}
