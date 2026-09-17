class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        int index = 0;
        for(int num : nums){
            if(numMap.containsKey(target - num)){
                return new int[]{numMap.get(target - num), index};
            }
            else{
                numMap.put(num, index);
                index += 1;
            }
        }
        return new int[]{0, 0};
    }
}
