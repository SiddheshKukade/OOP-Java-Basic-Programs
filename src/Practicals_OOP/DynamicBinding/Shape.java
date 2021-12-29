package Practicals_OOP.DynamicBinding;
/**
 * @author :Siddhesh Bhupendra Kuakde
 * @date : 28-12-2021
 **/
public abstract class Shape {
    double val1 = 0  , val2 =0 ;
    Shape(double a, double b ){
         val1 = a ;
         val2 = b;
    }

    protected abstract double compute_area();
}
