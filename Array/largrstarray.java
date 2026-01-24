package Array;

public class largrstarray {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
             if(largest<numbers[i]){
                largest=numbers[i];
             }
             
             
             if(smallest>numbers[i]){
                smallest=numbers[i];
               
        }
    }
     System.out.println("the smallest number in the array:"+smallest);
        return largest;
       
    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,3,4};
        System.out.println("the largest value in the array: "+getlargest(numbers));
    }
}
