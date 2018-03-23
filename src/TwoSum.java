import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //	1. Two Sum
	// Given an array of integers, return indices of the two numbers such that
	// they add up to a specific target.
	//
	// You may assume that each input would have exactly one solution.
	//
	// Example:
	// Given nums = [2, 7, 11, 15], target = 9,
	//
	// Because nums[0] + nums[1] = 2 + 7 = 9,
	// return [0, 1].

	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				return new int[] { map.get(numbers[i]) + 1, i + 1 };
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return new int[] { 0, 0 };
	}


	public int[] twoSum1(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
