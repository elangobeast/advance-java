package Feb15;

public class Task3 {
	    public int[] twoSum(int[] nums, int target) {
	        for (int i = 0; i < nums.length; i++) {
	            for (int j = i + 1; j < nums.length; j++) {
	                if (nums[j] == target - nums[i]) {
	                    return new int[] { i, j };
	                }
	            }
	        }
	        // If no valid pair is found, return an empty array instead of null
	        return new int[] {};
	    }
}


