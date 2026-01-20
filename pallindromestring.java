import java.util.Scanner;
public class pallindromestring{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.next();
        int left=0;
        int right=str.length()-1;
        boolean isPallindrome=true;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                isPallindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPallindrome){
            System.out.println("This string is pallindrome");
        }
        else{
            System.out.println("this is not pallindrome");
        }
    }
}