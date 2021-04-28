package homeworkweek8;/*
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius
of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize
the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
● Method named getRadius without any parameters, it needs to return the value of the radius
field.
● Method named getArea without any parameters, it needs to return the calculated area
(radius * radius * PI). For PI use Math.PI constant.
*/

public class Circle {

    private double radius;//instance variable
    public Circle(double r){//constructor with 1 parameter
        this.radius=r;
        if(r<0){//if condition
            r=0;
        }else{
            radius=r;
        }

        }
        public Circle(){

    }
    public double getRadius(){//get method with type double without parameter
        return radius;
    }
    public double getArea(){//find area
        return radius*radius*Math.PI;
    }
}
