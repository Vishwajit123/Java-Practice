class Count1{
    public static void  main(String[] main){
        int n=3;
        int num=1;
        for(int i=1; i<=n; i++){
             num=i;
            for(int j=1; j<=n; j++){
                System.out.print(num + " ");
                num +=n;
            }
            System.out.println();
        }
    }
}   


