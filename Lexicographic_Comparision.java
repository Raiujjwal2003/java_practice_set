public class Lexicographic_Comparision {
    
    public static void  main(String args[]){
        // String str1="apple";
        // String str2="banana";
        // System.out.println(str1.compareToIgnoreCase(str2));
        // if(str1.compareToIgnoreCase(str2)==0){
        //     System.out.println("same ");
        // }
        // else if(str1.compareToIgnoreCase(str2)<0){
        //     System.out.println("first String is Bigger"+ str1);
        // }
        // else{
        //     System.out.println("Second String is Bigger"+ str2);
        // }

        String fruits[]={"ujjwal", "paridhi"};
        String largest=fruits[0];

        for(int i=0; i<fruits.length; i++){

            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
