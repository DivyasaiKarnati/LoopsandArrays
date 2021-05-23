package classandobjectsWPN;

public class prob30 {
	double h,w,d;

    prob30(double width,double height,double depth)
   {
       h=height;
       w=width;
       d=depth;
   }
   double volume()
   { double v;
   v=h*w*d;
   return v;
   }
  
   public static void main(String[] args) {
      
   prob30 bc = new prob30(8.5,80.3,9.6);
   System.out.println(bc.volume());

   }
}
