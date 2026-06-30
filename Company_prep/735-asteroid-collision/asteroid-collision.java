class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
             boolean dest = false;
            while(!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0) {
                if(stack.peek() < -asteroids[i]) {
                    stack.pop();
                } else if(stack.peek() == -asteroids[i]) {
                    stack.pop();
                    dest = true;
                    break;
                } else {
                    dest = true;
                    break;
                }
            }
            if(!dest) {
                stack.push(asteroids[i]);
            }
        }
        int[] res = new int[stack.size()];
        int j = 0;
        for(int x : stack) {
            res[j++] = x;
        }
        return res;
    }
}