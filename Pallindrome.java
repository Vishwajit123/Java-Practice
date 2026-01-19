import java.util.Scanner;
public class Pallindrome {

    public static void main(String[]  args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the original number:");
        
        int originalnumber= scanner.nextInt();
        
        int tempnumber=originalnumber;
        int reversednumber=0;

        while(tempnumber>0){

            int lastdigit=tempnumber%10;
            reversednumber=(reversednumber*10)+lastdigit;
            tempnumber=tempnumber/10; 
            
        }
            // if(originalnumber==reversednumber){343
            //     System.out.println(originalnumber +" is pallindrome");
            // }
            //    else{
            //     System.out.println(originalnumber+" is not pallindrome");
                
            // }


  /*****************************  Reversed Number **************************** */    
  
            System.out.println("reversed number "+reversednumber);

   /**************************    Reversed Number  ************************8 */         
        
    }
}