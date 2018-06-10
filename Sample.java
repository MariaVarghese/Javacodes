class Sample
{
  public static void main(String args[])
  {
     int a=10;
     int b=5;
     int c=5;
     int x=0,y=0;
     try
     {
          x=a/(b-c);
          System.out.println("x="+x);
      }
              
catch(ArithmeticException e)
     { 
         System.out.println("Division by zero");
      }
      y=a+b+c;
     System.out.println("y="+y); 
  }
}
