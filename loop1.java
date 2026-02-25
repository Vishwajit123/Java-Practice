public class Loop1 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Loop start");
        for (System.out.println(i + "  initalizaion"); i <= 4; System.out.println(i + "  Updation")) {
            System.out.println(i + "  Condtion check");
            System.out.println(i + "  Loop exicution");
            i++;
            System.err.println();
        }
        System.out.println("Loop Ends");
    }
}

