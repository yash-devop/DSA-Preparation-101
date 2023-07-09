package arrays;

import java.util.ArrayList;

// https://www.youtube.com/watch?v=sTdiMLom00U&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod&index=4

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = { 1,5,9,12,12,15};
        // System.out.println(search(arr, 12, 0));
        // System.out.println(searchMultipleOccurence(arr, 12, 0));

        // searchMultipleOccurence(arr, 12, 0);
        // System.out.println(list);
        System.out.println(searchMultipleOccurenceInArguments(arr, 12, 0, new ArrayList<>()));
        System.out.println(searchMultipleOccurenceWithoutPassingArguments(arr, 12, 0));
    }
    static int search(int[] arr ,int target, int index){
        if(index == arr.length -1){
            return -1;
        }
        if(arr[index] != target){
            return search(arr, target, ++index);
        }
        else{
            return index;
        }
    }
    // Multiple occurence.
    static ArrayList<Integer> list = new ArrayList<>();
    static void searchMultipleOccurence(int[] arr ,int target, int index){
        if(index == arr.length -1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchMultipleOccurence(arr, target, ++index);
        
    }
    static ArrayList<Integer> searchMultipleOccurenceInArguments(int[] arr ,int target, int index,ArrayList<Integer> list){
        if(index == arr.length -1){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return searchMultipleOccurenceInArguments(arr, target, ++index,list);  
    }
    static ArrayList<Integer> searchMultipleOccurenceWithoutPassingArguments(int[] arr ,int target, int index){
        
        ArrayList<Integer> list = new ArrayList<>();  // every time it will create a new.
        

        if(index == arr.length -1){
            return list;
        }

        // it will contain the answer for that function call only !
        if(arr[index] == target){
            list.add(index);
        }
       ArrayList<Integer> ansFromBelowCalls = searchMultipleOccurenceWithoutPassingArguments(arr, target, ++index);  
        //after comming out of the return , the below will run for each .
        // return from where it was called and then add it to the list
       list.addAll(ansFromBelowCalls);   // try to comment this line and run code.
       /*
             basically , empty list was returning even if we were doing list.add(index) but this is only setting it
             in that FUNCTION CALL.
             so , after the index==arr.length-1 condition met , return statement will hit and now return from
             where it was called and in btw this , just add all the elements inside the list.. so that eg: when we go
             suppose 4th call to 3rd call and soo on., they should have the values also with them otherwise [] will be
             returned.
        */
        return list;
    }
}
