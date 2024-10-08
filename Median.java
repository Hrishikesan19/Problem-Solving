import java.util.*;

public class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int num : nums1) {
            minheap.add(num);
        }
        for (int num : nums2) {
            minheap.add(num);
        }

        int total = nums1.length + nums2.length;
        double median = 0.0;

        int mid = total / 2;

        for (int i = 0; i < mid; i++) {
            minheap.poll();
        }

        if (total % 2 == 1) {
            median = minheap.poll();
        }

        else {
            int first = minheap.poll();
            int second = minheap.poll();
            median = (first + second) / 2.0;
        }

        return median;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
