public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            // Shift result left to make room for next bit
            result <<= 1;
            
            // Add the last bit of n
            result |= (n & 1);
            
            // Shift n right (unsigned)
            n >>>= 1;  // >>> means logical right shift (fills with zeros)
        }

        return result;
    }
}
