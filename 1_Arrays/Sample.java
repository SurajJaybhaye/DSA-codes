import java.util.*;
public class Sample{

    public static String isAlphanumeric(String s){

        String p="";
        for(int i=0; i< s.length();i++){
            char c = s.charAt(i);
            if(( c >= 'a' && c<='z') || (c>='A' && c<='Z')){
                if(c>='A' && c<='Z'){
                    c = (char)(c - 'A' + 'a');
                }
                p += c;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        String s = "hi Yfg";
        String p = isAlphanumeric(s);
        System.out.println(p);
    }
}