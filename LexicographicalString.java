/*The problem you are solving involves sorting the characters of a given string (S) based on the lexicographical order
of characters from another string (P), where P defines the order of characters.

EXAMPLE:

Input:
P = "qwertyuiopasdfghjklzxcvbnm"  (random keyboard layout order)
S = "coding"

Output:
iodcng
*/


import java.util.*;

class Node {
    char data;
    int priority;

    public Node(char data, int priority) {
        this.data = data;
        this.priority = priority;
    }
}

public class LexicographicalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.nextLine();
        char[] p = P.toCharArray();
        String S = sc.nextLine();
        char[] s = S.toCharArray();
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.priority - b.priority);
        
        if ((p.length == 26) && (s.length >= 1 && s.length < 100)) {
            for (int i = 0; i < s.length; i++) { 
                for (int j = 0; j < p.length; j++) { 
                    if (p[j] == s[i]) { 
                        pq.add(new Node(p[j], j)); 
                    }
                }
            }

            
            while (!pq.isEmpty()) {
                System.out.print(pq.poll().data);
            }
        }

    }
}
