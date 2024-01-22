public class Rem_duplicate {

    public static int removeDuplicate(int nums[]){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int k = 1; // Initialize k to 1 (first element is always unique)
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Move the unique element to its correct position
                k++; // Increment k to point to the next position for a unique element
            }
        }
        
        return k;
    }
    public static void main(String args[]){
        int nums[]={1,2,2,3,3,3,4,4,4,5,5};
        int n=removeDuplicate(nums);
        for(int i=0; i<n;i++){

            System.out.print(nums[i]);
        }
    }
}
