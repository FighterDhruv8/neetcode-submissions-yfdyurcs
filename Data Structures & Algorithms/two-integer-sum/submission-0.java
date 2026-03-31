class Solution
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0 ; i < nums.length ; i++ )
        {
            int diff = target - nums[i];
            if (map.get(nums[i]) != null)
            {
                return new int[]{map.get(nums[i]), i};
            }
            else
                map.put(diff, i);
        }
        return new int[]{0, 0};
    }
}
