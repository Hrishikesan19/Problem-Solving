import java.util.*;

public class ContainsDuplicate {
    public static boolean contains_Duplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return true;
            map.put(nums[i], true);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(contains_Duplicate(nums));

    }
}