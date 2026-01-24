package Array;

public class linearsearch {
    public static int search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[]={12,14,16,18,20,22,24,26,28};
        int key=66;
        int index=search(numbers, key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("the value is found:"+index);
        }
        
    }
    
}
