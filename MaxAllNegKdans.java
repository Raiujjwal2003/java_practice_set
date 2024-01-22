public class MaxAllNegKdans {

        public static int maxSubarraySum(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;
    
            boolean allNegative = true;
            int maxNegative = Integer.MIN_VALUE;
    
            for (int num : nums) {
                currentSum += num;
                
                if (currentSum < 0) {
                    currentSum = 0;
                } 
                
                else if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
    
                if (num >= 0) {
                    allNegative = false;
                } else {
                    maxNegative = Math.max(maxNegative, num);
                }
            }
    
            if (allNegative) {
                return maxNegative;
            }
    
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] array = {-8, -2, -6, -5, -4};
            int maxSum = maxSubarraySum(array);
            System.out.println("Max sum of subarray is: " + maxSum);  // Output: 9
        }
    }
    

