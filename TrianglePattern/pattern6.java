class Pattern6{
    public static void main(String[] args){
        int n = 17;
        for(int i = 0; i < n; i++ ){
            for(int j = 0 ; j <  2*n - i; j++){
                if(j < i+1){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}