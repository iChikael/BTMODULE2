package org.example.oopcomparator;

public class ComparatorByArea implements MyComparator<Geometric>{
    @Override
    public int compareTo(Geometric g1, Geometric g2) {

        if (g1.getArea() > g2.getArea()) {
            return 1;
        }else{
            if (g1.getArea() == g2.getArea()) {
                return 0;
            }
        }
        return -1;
    }
}
