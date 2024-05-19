import java.util.*; 
import java.io.*;

class Main {

  public static int FirstFactorial(int num) {
    // code goes here  
    if(num==0)
      return 1;
    else
      return (num*FirstFactorial(num-1));
  }

  public static void main (String[] args) {  
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(FirstFactorial(s.nextLine())); 
  }

}