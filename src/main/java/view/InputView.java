package view;

import java.util.Scanner;

public class InputView {
    private static Scanner sc = new Scanner(System.in);

    public static String getCoordinateValue() {
        System.out.println("좌표를 입력하세요");
        return sc.nextLine();
    }
}