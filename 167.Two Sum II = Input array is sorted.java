public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indice = new int[2];
        if (numbers == null || numbers.length == 0){
            return indice;
        }
        int left = 0;
        int right = numbers.length-1;
        while(numbers[left]+numbers[right] != target){
            if (numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
            }
        }
        indice[0] = left+1;
        indice[1] = right+1;
        return indice;
    }
}