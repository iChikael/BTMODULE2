package org.example.oopcomparator;

public class GeometricApp {
    public static void main(String[] args) {

        ComparatorByArea comparatorByArea = new ComparatorByArea();
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(1, 9);
        Rectangle r3 = new Rectangle(1, 11);
        Rectangle r4 = new Rectangle(2, 10);
        Rectangle r5 = new Rectangle(3, 8);

        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = r1;
        rectangles[1] = r2;
        rectangles[2] = r3;
        rectangles[3] = r4;
        rectangles[4] = r5;
        System.out.println("Chua sap xep");
        printArray(rectangles);

        MyComparator myComparator = new ComparatorByPrimeter();
        sortArray(rectangles, comparatorByArea);

        System.out.println("Sau khi sap xep");
        printArray(rectangles);

    }

    public static <T> void sortArray(T[] arrays, MyComparator myComparator) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                if (myComparator.compareTo(arrays[i], arrays[j])==1) {
                    T temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }
    public static void printArray(Geometric[] geometrics) {
        for (int i = 0; i < geometrics.length; i++) {
            System.out.println(geometrics[i]);
        }
    }
}
