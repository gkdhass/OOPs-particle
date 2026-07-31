import java.util.*;

public class Remove_Duplicate_Single_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        LinkedHashSet<Character> list = new LinkedHashSet<>();
        
        for(char c : ch){
            list.add(c);
        }
        for(char c : list){
            System.out.print(c);
        }
    }
}
