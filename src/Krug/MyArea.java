package Krug;

import com.sun.corba.se.impl.interceptors.PICurrent;

public class MyArea {
   public static final double PI = 3.14;

    public static double areaOfCircle(double a){
        double square = (a * a) * PI;
        return square;
    }
}

