class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack= new Stack<>();
        int arr[] = new int[temperatures.length];
        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                        arr[i]=0;
                        stack.push(i);
                    }
                    else{
                        arr[i]=stack.peek()-i;
                stack.push(i);
                    }

            }
            else{
                stack.push(i);
            }
        }
        return arr;
    }
}
