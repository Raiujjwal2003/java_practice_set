public class Trapping_rainwater {

    public static  int Trap_water(int height[]){
        //left max boundary 

        int n=height.length;
        if(n== 1 || n==2){
            return 1;
        }
        else{
        int left_max[]= new int[n];
        left_max[0]= height[0];

        for(int i=1;i<n; i++){
            left_max[i]= Math.max(height[i], left_max[i-1]);
        }
        // right max boundary 

        int right_max[]= new int[n];
        right_max[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--){
            right_max[i]= Math.max(height[i], right_max[i+1]);
        }

     int trappedWater=0;

    for(int i=0; i<n; i++){
        // water lavel= min(left max, right max)

        int water_lavel= Math.min(left_max[i], right_max[i]);

        // trapped water = water lavel -height[i]
        
        trappedWater += water_lavel- height[i];
    }

    return trappedWater;
}
    }
    public static void main(String args[]){
        int height[]={1,2};
         int Total_WaterTrapped= Trap_water(height);
         if(Total_WaterTrapped==1){
            System.out.println("No watter Trapped");
         }
         else
         System.out.println("total trapped water:"+ Total_WaterTrapped);
    }
}
