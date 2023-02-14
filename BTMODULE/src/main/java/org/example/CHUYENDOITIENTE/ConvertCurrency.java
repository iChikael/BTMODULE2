package org.example.CHUYENDOITIENTE;
import java.util.Scanner;


public class ConvertCurrency {
    public static void main(String[] args) {

        int rate = 23000;


        int valueUSD;


        Scanner input = new Scanner(System.in);
        System.out.print("Nhập giá trị USD: ");
        valueUSD = input.nextInt();


        int valueVND = valueUSD * rate;


        System.out.println("Giá trị VND là: " + valueVND + " VND");
    }
}
