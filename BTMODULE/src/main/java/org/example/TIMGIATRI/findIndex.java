package org.example.TIMGIATRI;
import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        String[] numbers = {"30", "10", "13", "15", "18", "11", "19"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so can tim:");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(input_name)) {
                System.out.println("Vi tri so can tim trong list " + input_name + " is: " + i );
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay" + input_name + " trong list.");
        }
    }
}
