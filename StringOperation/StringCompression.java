package StringOperation;

public class StringCompression {
   
    public static String Compress(String str){

        String Newstr="";

        // StringBuilder Newstr=new StringBuilder();

        for(int i=0; i<str.length(); i++){

            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){

                
                count++;
                i++;
            }

            Newstr+=str.charAt(i);
            // Newstr.append(str.charAt(i));

            if(count>1){
                Newstr+=count;
                // Newstr.append(count);
            }
        }
        return Newstr.toString();
        // return Newstr.toString();
    }
    public static void main(String[] args) {
        String Newstr="aaabbcccccddd";
        System.out.println(Compress(Newstr));

    }
}

