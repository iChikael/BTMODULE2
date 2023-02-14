package org.example.MANG.THEM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Nhập số cần chèn: ");
        int x = sc.nextInt();
        System.out.print("Nhập vị trí chèn: ");
        int index = sc.nextInt();
        if (index < 0 || index >= n) {
            System.out.println("Không thể chèn phần tử vào mảng tại vị trí " + index);
        } else {
            for (int i = n - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
            arr[index] = x;
            n++;
            System.out.println("Mảng sau khi chèn: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
