package Arrayssss;

import java.util.*;

public class TwoSum2 {
    public static int[]twosum(int nums[],int target){
        //now we have to create a map for storing data and their index
          HashMap<Integer, Integer> map = new HashMap<>();
          //now we have to traverse the array We use for loop 
          for(int i=0;i<nums.length;i++){
            //now we have to minus current no. from the target 
            int j=target-nums[i];
            //now we have check the value  is available in the map or not 
            if(map.containsKey(j)){
                //if we find the value then return it
                return new int[]{map.get(j),i};
            }
            //if we don't find the the required no. then save the current no & index to the map 
            map.put(nums[i], i);
         }
         return new int[]{};
    }
          public static void main(String[]a){
            int nums[]={2,4,6,7,5,9};
            int target=9;
           int[]result= twosum(nums, target);
           System.out.println("The sum index are"+ Arrays.toString(result));
         }
    }


