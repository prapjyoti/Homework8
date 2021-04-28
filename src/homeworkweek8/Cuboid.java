package homeworkweek8;/*
2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field
(instance variable) with name height of type double.
The class needs to have one constructor with three parameters width, length, and height all of type
double. It needs to call the parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
● Method named getHeight without any parameters, it needs to return the value of height
field.
● Method named getVolume without any parameters, it needs to return the calculated volume.
to calculate volume multiply the area with height
*/


 public class Cuboid extends Rectangle {//child class ,parents class called with extends keyword
     private double height;
    public Cuboid(double w, double l,double h) {
        super(w, l);
        if(h<0){
            h=0;
        }
        this.height=h;//parent constructor called and initialize a height field
    }

     public double getHeight() {
         return height;
     }
     public double getVolume(){
        return super.getArea()*height;//calculate volume so called parent method through super
     }
 }





