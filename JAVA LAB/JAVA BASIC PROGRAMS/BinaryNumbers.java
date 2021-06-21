import java.util.Scanner;
public class BinaryNumbers {
 public static void main(String args[])
 {
  long b1, b2;
  int i = 0, remainder = 0;
  int[] sum = new int[20];
  Scanner in = new Scanner(System.in);

  System.out.print("First binary number: ");
  b1 = in.nextLong();
  System.out.print("Second binary number: ");
  b2 = in.nextLong();

  while (b1 != 0 || b2 != 0) 
  {
   sum[i++] = (int)((b1 % 10 + b2 % 10 + remainder) % 2);
   remainder = (int)((b1 % 10 + b2 % 10 + remainder) / 2);
   b1 = b1 / 10;
   b2 = b2 / 10;
  }
  if (remainder != 0) {
   sum[i++] = remainder;
  }
  --i;
  System.out.print("Sum of two binary numbers is : ");
  while (i >= 0) {
   System.out.print(sum[i--]);
  }
   System.out.print("\n");  
 }
}