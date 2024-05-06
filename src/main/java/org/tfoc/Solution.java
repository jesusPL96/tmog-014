package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static int maxArea(int[] heights) {

        int maxWaterArea = 0;
        int left = 0;
        int right = heights.length-1;

        while(left!=right){

            int width = right-left;
            int height = Math.min(heights[left], heights[right]);
            int area = width*height;

            maxWaterArea = Math.max(maxWaterArea, area);

            if(heights[left] < heights[right]){
                left++;
            } else {
                right--;
            }

        }

      return maxWaterArea;
    }

}
