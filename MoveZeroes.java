//Move all 0's to the end while maintaining the relative order of non-zero elements.
//Brute Force (Extra Array) – O(n)
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] temp = new int[nums.length];
        int i = 0;

        for (int num : nums)
            if (num != 0)
                temp[i++] = num;

        for (int j = 0; j < nums.length; j++)
            nums[j] = temp[j];
    }

    public static void main(String[] args) {
    MoveZeroes obj = new MoveZeroes();

    int[] nums = {0, 1, 0, 3, 12};

    obj.moveZeroes(nums);

    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i] + " ");
    }
}
}