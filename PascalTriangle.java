import java.util.*;
public class PascalTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        List<List<Integer>> pascal = new ArrayList();
        for(int i =0;i<n;i++)
        {
            List<Integer> row = new ArrayList();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                row.add(1);
                else{
                    List<Integer> prevRow = new ArrayList();
                    prevRow = pascal.get(i-1);
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }

            }
            pascal.add(row);
        }
        System.out.println(pascal);

    }
}