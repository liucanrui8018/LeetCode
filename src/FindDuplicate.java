/**
 * Created by 刘灿锐 on 5/22/2017.
 * 287. Find the Duplicate Number Add
 * <p>
 * Given an array nums containing n + 1 integers where each integer is between 1 and n
 * (inclusive), prove that at least one duplicate number must exist. Assume that there is
 * only one duplicate number, find the duplicate one.
 * <p>
 * Note:
 * 1.You must not modify the array (assume the array is read only).
 * 2.You must use only constant, O(1) extra space.
 * 3.Your runtime complexity should be less than O(n2).
 * 4.There is only one duplicate number in the array, but it could be repeated more than once.
 */
public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        if (nums.length > 1) {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }

    public int findDuplicate1(int[] nums) {
        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }
}
