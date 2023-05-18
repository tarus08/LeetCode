package Easy;

import java.util.Arrays;

public class SumTwoNums
{
    public int[] twoSum(int[] nums, int target)
    {
        nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        
        int[] resultArray = new int[2];

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }
}
