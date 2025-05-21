import java.util.Arrays;
public class anagram{
    public static boolean isanagram(String s1,String s2) {
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
        
    }
    public static void main(String[] args) {
        String str1="listenr";
        String str2="silent";
        if(isanagram(str1, str2))
        {
            
            System.out.println(str1 +" "+ str2 +"are anagrams");
        }
        else{
            System.out.println(str1 +" "+ str2 +"are not anagram");
        }
        
    }
}
