/**iven an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?**/

/** Pseudocode (Brute-Force)
for i=0 to n-1 
for j=i+1 to n-1
    //if(target==nums[i]+nums[j])
//O(N^2)    O(1)

HashMap
2 is at  0
7 is at  1
11 is at 2
15 is at 3

we can pick 2 and check wether we have 7 in our Hashmap to get the sum 9.
2------- HM(7)**/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer>map = new HashMap();
        
        //Fill HashMap
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
            
        }
            
            
            
        
        // Searching
         for(int i=0;i<nums.length;i++){ //2 7 11 15    target=9
           int num = nums[i]; //2
           int rem= target-num;
           if(map.containsKey(rem)){
               int index=map.get(rem);
               if(index==i)continue;
               return new int[]{i,index}; 
           }
        }
            
        return new int[]{};
        
    }
}

