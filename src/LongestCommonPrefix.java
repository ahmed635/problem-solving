import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder();
        for(int j=0; j<strs.length; j++){

        }

        return "";
    }

    private static List<Character> spliceString(String string){
        List<Character> list = new ArrayList<>();
        for(int i=0; i<string.length(); i++){
            list.add(string.charAt(i));
        }
        return list;
    }
}
