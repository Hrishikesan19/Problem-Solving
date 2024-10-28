
import java.util.*;

class lengthofLastWord {
    public static int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        Stack <Character> last = new Stack<>();
        int i = array.length-1;
        char ch = 'a';
        int size = 0;
        while(ch != ' ')
        {
            ch = array[i];
            last.add(ch);
            size++;
            i--;
        }
        return size -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int n = lengthOfLastWord(s);
        System.out.println(n);
    }
}