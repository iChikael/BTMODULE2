package org.example.MANG.XOA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = scan.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử trong mảng: ");
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Nhập phần tử cần xoá: ");
        int x = scan.nextInt();
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng");
        } else {
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            n--;
            System.out.println("Mảng sau khi xoá phần tử " + x + " là: ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
