/**
 * credit to https://leetcode.com/discuss/72127/easy-to-understand-solution-
 * using-dp-with-video-explanation, 看了答案才会
 */

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) 
    {
        if(nums.length <= 1) 
            return nums.length;

        int Track[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            Track[i] = 1;

        for(int i = 1; i < nums.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(nums[j] < nums[i])
                {
                    if(Track[j] + 1 > Track[i])
                    {
                        Track[i] = Track[j] + 1;
                    }
                }
            }
        }

        int longest = 0;
        for(int i = 0; i < Track.length; i++)
            longest = Math.max(longest, Track[i]);

        return longest;
    }
}

/**  original version, wrong logic.
public class LengthOfLIS {
	public int lengthOfLIS (int[] nums) {
	    
	    if(nums.length <= 1) 
	        return nums.length;
	    
	    int len = 1;
	
	    // Mark one pointer at i. For each i, start from j=0.
	    for(int i=1; i < nums.length; i++)
	    {
	        for(int j=0; j < i; j++)
	        {
	            // It means next number contributes to increasing sequence.
	            if(nums[j] < nums[i])
	            {
	            	len = Math.max(len, i-j+1);
	            }
	        }
        }
		return len;
	}
}
*/


/**
 * best solution found
public class Solution {
    public int lengthOfLIS(int[] nums) {            
        int[] dp = new int[nums.length];
        int len = 0;

        for(int x : nums) {
            int i = Arrays.binarySearch(dp, 0, len, x);
            if(i < 0) i = -(i + 1);
            dp[i] = x;
            if(i == len) len++;
        }

        return len;
    }
}
*/
