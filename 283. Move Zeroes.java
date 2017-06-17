public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int numOfZero = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 0){
                nums[i-numOfZero]=nums[i];
            }else{
                numOfZero++;
            }
        }
        for (int i=nums.length-numOfZero;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}