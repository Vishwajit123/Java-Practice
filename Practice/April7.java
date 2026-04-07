class April7{
    static int a;
   
    public static void main(String[] args){
        System.out.println(a);
        int a=10;
        System.out.println(a);
        demo();
        System.out.println(April7.a);


    }
    public static void demo(){
        System.out.println(a);
        int a =20;
        System.out.println(a);

    }
}