package az.student.util;

import java.util.Scanner;

public class InputUtil {
    private  static Scanner sc = new Scanner(System.in);
    public static int getInt(String text) {
        System.out.print(text);
        int number = sc.nextInt();
        sc.nextLine();
        return number ;
    }

    public static String getString(String text) {
        System.out.print(text);
        return sc.nextLine();
    }
}
