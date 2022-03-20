package com.company;

public class Rectangle {
    private double height;
    private double width;
    private double area;

    public Rectangle(double ht, double w, double area)
    {
      height = ht;
      width= w;
      area = ht*w;
    }

    //  public void setHeight(double ht)
    //{
      //  if(ht>0)
        //height = ht;
        //else
          //  System.out.println("Invalid height: " + ht);
    //}

    public double getHeight(){
        return height;
    }

   // public void setWidth(double w) {
     //   if (w > 0)
      //      height = w;
       // else
        //    System.out.println("Invalid width:" + w);
   // }

    public double getWidth(){
        return width;
    }

    public double getArea()
    {
        return area;
    }


}
