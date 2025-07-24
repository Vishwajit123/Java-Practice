public class buterfly {
    public static void main(String[] args) {
        for(int i=0; i<4; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }

          for(int i=4; i>=1; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(4-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
    
}
