public class SystemArrayCopy 
{
   public static void main(String[] args) 
   {
         int arr1[] = { 0, 1, 2, 3, 4, 5 };
         int arr2[] = { 5, 10, 20, 30, 40, 50 };
        // copies an array from the specified source array
         System.arraycopy(arr1, 3, arr2, 3, 3);
         System.out.print("array2 = ");
         for(int i=0;i<6;i++)
         {           System.out.print(arr2[i] + " ");         }
   }
}
