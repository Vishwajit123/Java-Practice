package StringOperation;

public class Stringbuilder {
    public static void main(String[] args) {
        
         StringBuilder sb=new StringBuilder(" ");

    for(char ch='a'; ch<='z'; ch++){

        sb.append(ch);
    }
    System.out.println(sb);


        String alphabets=" ";
        for(char ch='a'; ch<='z'; ch++){

            alphabets+=ch;
        }
        System.out.println(alphabets);

    }
     
   
}
