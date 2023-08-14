import java.util.*;
public class checkPermutation {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11};
        int[] arr2 = {6,5,4,3,2,1,0,11,10,9,8,7};

        if(checker(arr1, arr2)){
            System.out.println("Yes permution");
        }
        else{

            System.out.println("no permution");
        }
    }
    static boolean checker(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int num : arr1){
            if(map.containsKey(map)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        

    }
}






// import java.util.*;
// public class checkPermutation {
//     public static void main(String[] args) {
//         int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11};
//         int[] arr2 = {6,5,4,3,2,1,0,11,10,9,8,7};

//         if(checker(arr1, arr2)){
//             System.out.println("Yes permution");
//         }
//         else{

//             System.out.println("no permution");
//         }
//     }
//     static boolean checker(int[] arr1, int[] arr2){
//         HashSet<Integer> set = new HashSet<Integer>();

//         for (int i = 0; i < arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             if(!set.contains(arr2[i])){
//                 return false;
//             }
//         }
//         return true;
//     }
// }