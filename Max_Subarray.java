//Find the contiguous subarray with the largest sum
//Brute Force – O(n²)
class Max_Subarray {

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Max_Subarray obj = new Max_Subarray();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}
