package homeworkweek8;

public class Rectangle {

     private double width;//instance variable declare
   private double length;

   public Rectangle (double width,double length){//constructor declare
       this.width=width; // constructor inisitioal
       this.length=length;
       if(width<0){
           width=0;
       }
       if(length<0){
           length=0;
       }
       this.width=width;
       this.length=length;
   }
    public double getWidth() {//instance method created with without any parameter
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea(){
       return width*length;
    }
}
