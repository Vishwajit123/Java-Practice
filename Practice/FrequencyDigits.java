class FrequencyDigits{
    public static void main(String[] args){
       frequencyDigits(14532);
    }
    public static void frequencyDigits(int num){
        
      for(int i=0; i<=9; i++){
        int cnt = 0;
        for(int j=num; j!=0; j/=10){
            int ld = j % 10;
            if(ld == i){
                cnt++;
            }
        }
        System.out.println(i + " Printed " + cnt + " times");
      }
      
    }
}