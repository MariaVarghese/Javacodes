class Ray
{
   public static void main(String[] args) 
   {
      int[] myList = {1, 2, 3, 3};
      for (int i = 0; i < myList.length; i++)
      {         System.out.println(myList[i] + " ");      }
      System.out.println("arraylength="+myList.length);
      // Summing all elements
      int total = 0;
      for (int i = 0; i < myList.length; i++) 
     {         total += myList[i];      }
      System.out.println("Total is " + total);
    }
}
