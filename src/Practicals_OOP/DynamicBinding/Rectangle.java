package Practicals_OOP.DynamicBinding;
/**
 * @author :Siddhesh Bhupendra Kuakde
 * @date : 28-12-2021
 * */
public class Rectangle extends Shape {
    Rectangle(double a , double b  ){
        super(a,b);
    }
    @Override
    protected double compute_area(){
        return val1 * val2;
    }
}
