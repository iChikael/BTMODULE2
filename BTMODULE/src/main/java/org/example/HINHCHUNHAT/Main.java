package org.example.HINHCHUNHAT;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu rong:");
        double width = scanner.nextDouble();
        System.out.print("Nhap chieu dai:");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hinh chu nhat \n"+ rectangle.display());
        System.out.println("Chu vi hinh chu nhat: "+ rectangle.getPerimeter());
        System.out.println("Dien tich hinh chu nhat: "+ rectangle.getArea());
    }
}
