import java.util.*;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
	    int len = 0;
	    Map<Character, Integer> map = new HashMap<>();
	    for (int i = 0, j = 0; i < s.length(); i++) 
	    {
	        char c = s.charAt(i);
	        if (map.containsKey(c)) 
	            j = Math.max(map.get(c)+1, j);
	        len = Math.max(len, i-j+1); 
	        map.put(c, i);
	    }
	    return len;
	}
}


