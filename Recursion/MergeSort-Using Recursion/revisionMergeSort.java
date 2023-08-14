import java.util.*;
public class revisionMergeSort {
    public static void main (String[] args) throws java.lang.Exception{
        int[] arr = {5,4,3,2,1};
        arr = merge(arr);
        System.out.println(Arrays.toString(arr));
    }  
  	static int[] merge(int[] arr ){
      	if(arr.length == 1){
          return arr;
        }
        int mid = arr.length / 2;
      
      	int[] left = merge(Arrays.copyOfRange(arr,0,mid));
      	int[] right = merge(Arrays.copyOfRange(arr,mid,arr.length));
      	
      return mergeArrays(left,right);
    }
  static int[] mergeArrays(int[] first, int[] second){
    	int[] mixArr = new int[first.length + second.length];
  		int i=0;
    	int j=0;
    	int k=0;
    	
    	while(i < first.length && j < second.length){
        	if(first[i] < second[j]){
            	mixArr[k] = first[i];
              	i++;
            }
          	else{
            	mixArr[k] = second[j];
            	j++;
            }
          	k++;
        }
    
   		while(i < first.length){
        	mixArr[k] = first[i];
          	i++;
          	k++;
        }
    	while(j < second.length){
        	mixArr[k] = second[j];
          	j++;
          	k++;
        }
        return mixArr; 
  }
}
