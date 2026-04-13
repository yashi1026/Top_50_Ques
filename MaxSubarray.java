class MaxSubarray {

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubarray obj = new MaxSubarray ();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}