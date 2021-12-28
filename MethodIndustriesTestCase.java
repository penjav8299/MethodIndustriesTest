import java.util.Scanner;

public class MethodIndustriesTestCase {
    public static void main(String args[]) {
    
    Scanner inpNum = new Scanner(System.in);
     System.out.println("Enter 3 Numbers: ");
     
      int firstNum = inpNum.nextInt();
      int secNum = inpNum.nextInt();
      int thirdNum = inpNum.nextInt();
      
    if ((firstNum + secNum) == thirdNum){
        System.out.print("+");
    }
      
      if ((firstNum * secNum) == thirdNum){
        System.out.print("*");
    }
    
    if ((firstNum - secNum) == thirdNum){
        System.out.print("-");
    }
    
    if ((firstNum / secNum) == thirdNum){
        System.out.print("/");
    }
    
     if ((firstNum + secNum) != thirdNum && (firstNum * secNum) != thirdNum && (firstNum - secNum) != thirdNum && (firstNum / secNum) != thirdNum){
        System.out.print("None");
    }
    
}
}