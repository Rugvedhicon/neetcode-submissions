class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right =heights.length-1;
        int min;
        int max=Integer.MIN_VALUE;
        int height;
        while(left<right){
            min=Math.min(heights[left],heights[right]);
            height=min*(right-left);
            max=Math.max(height,max);
            if(min==heights[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
