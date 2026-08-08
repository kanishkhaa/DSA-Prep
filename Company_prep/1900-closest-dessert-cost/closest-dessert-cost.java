class Solution {
    int target;
    int closest;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        this.target = target;
        closest = baseCosts[0];
        for(int base : baseCosts) {
            dfs(toppingCosts, 0,base);
        }
        return closest;
    }
    void dfs(int[] toppings, int index, int currentCost) {
         if (Math.abs(currentCost - target) < Math.abs(closest - target)
                || (Math.abs(currentCost - target) == Math.abs(closest - target)
                && currentCost < closest)) {
            closest = currentCost;
        }
        if(index == toppings.length) {
            return;
        }
        dfs(toppings, index+1,currentCost);
        dfs(toppings,index+1, currentCost + toppings[index]);
        dfs(toppings,index+1,currentCost+2*toppings[index]);
    }
}