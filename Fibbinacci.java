public class Fibbinacci {
    
    public static void fibbinacci(int N){

        int n1=0;
        int n2=1;

        for(int i=0; i<N; i++){

            System.out.println(n1+" ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        
        fibbinacci(10);
    }
}
