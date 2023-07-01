import java.util.HashMap;

public class CountFrequency {
    public static void main(String[] args) {
        // Count the frequency of each of the elements.
        // eg: [1,2,1,3,4] = 1 occured 2 times. // 2 occured 1th time. and like this...

        // brute force soln: just take each element from the array by using forloop and take count variable and check each elements occurence
        // and if occurs , increment count by count+1;
        // it will increase the Time Complexity.. like we are check each element... imagine if it was a large array..
        // time complexityy .... HUGEEE i.e:  O(N*N) nsquare.


        // To understand the map , refer the Concept.java
        
        int[] arr = {1,2,1,2,4,51,0};  
        countFreq(arr);
    }

    static void countFreq(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        for (int i = 0; i < arr.length; i++) {
            // if that element present in the Map? then increment it by 1. 
            if(map.containsKey(arr[i])){ 
                map.put(arr[i], map.get(arr[i]) + 1); // why +1 ? because we are storing the count of that element.
            }
            // means that the ellement is not present in the Map.. so add that element. execute the below line.
            else{
                map.put(arr[i],1);
            }
        }
        // print the map.
        System.out.println(map);
    }
}
