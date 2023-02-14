package org.example.SONGUYENTO20;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers;
        int count = 0;
        int N = 2;

        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        numbers = input.nextInt();

        while (count < numbers) {
            int i;
            for (i = 2; i <= N / 2; ++i) {
                if (N % i == 0) {
                    break;
                }
            }

            if (i > N / 2) {
                System.out.println(N);
                ++count;
            }
            ++N;
        }
    }
}
