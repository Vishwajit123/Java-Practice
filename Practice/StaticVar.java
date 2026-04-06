class StaticVar{
    static int a =10;
    public static void main(String[] main){
        System.out.println("It is from main method " + a);
        demo();
    }
    public static void demo(){
        System.out.println("It is from demo " + a);
    }
}