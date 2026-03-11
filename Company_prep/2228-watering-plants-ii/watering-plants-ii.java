class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0;
        int right =  plants.length-1;
        int waterA = capacityA;
        int waterB = capacityB;
        int refill = 0;
        while(left<=right) {
            if(left == right) {
                if(waterA >= waterB) {
                    if(waterA < plants[left]) refill++;
                } else {
                    if(waterB < plants[right]) refill++;
                }
                break;
            }
        if(waterA < plants[left]) {
            refill++;
            waterA = capacityA;
        }
        waterA-=plants[left];
        if(waterB < plants[right]) {
            refill++;
            waterB = capacityB;
        }
        waterB-=plants[right];
        left++;
        right--;
        }
        return refill;
    }
}