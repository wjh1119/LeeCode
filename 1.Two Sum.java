public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indice = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                indice[1] = i;
                indice[0] = map.get(target - nums[i]);
                return indice;
            }
            map.put(nums[i], i);
        }
        return indice;
    }
}