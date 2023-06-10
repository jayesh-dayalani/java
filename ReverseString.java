import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        
        int last = sb.length()-1;
        for(int i = last; i >= 0; i --){
            sb.append(sb.charAt(i));
        }
        sb.delete(0,sb.length()/2);
        System.out.println(sb);

    }
}
