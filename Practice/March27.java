class March27{
   public static void main(String[] args) {
        isFibbonacci(7);
        rangeOfFibbonacci(10);
        nFibbonacci(8);
        cFibbonacci(10);
   }
    
    public static void isFibbonacci(int n){
        int n1=0, n2=1, ans;
        while(n1<=n){
            if(n1==n){
            System.out.println("It is the fibbonacci number");
                break;
            }
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
       System.out.println("It is the not fibbonacci number");
        }
     public static void rangeOfFibbonacci(int n){
        int n1=0, n2=1, ans;
        while(n1<=n){
            System.out.print(n1+" ");
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
         System.out.println();
     }

     public static void nFibbonacci(int n){
        int n1=0, n2=1, ans;
        for(int i=1; i<n; i++){
           
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
         System.out.println(n1);
     }
     public static void cFibbonacci(int n){
         int n1=0, n2=1, ans;
         int count=0;
        while(n1<=n){
            count++;
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
         System.out.println(count);
     }
    
}