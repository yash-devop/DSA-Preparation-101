import java.util.HashMap;

public class goodPairs {
    public static void main(String[] args) {
        /*
         Given an array of integers nums, return the number of good pairs.
         A pair (i, j) is called good if nums[i] == nums[j] and i < j.

            Example 1:

            Input: nums = [1,2,3,1,1,3]
            Output: 4
            Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

         */
        /*some test arr. */
        // {1,2,3,1,1,3}
        // {1,1,1,1}

        // Start of the Program.
        int[] nums = {1,2,3,1,1,3};
        int count = 0;
        
        
        // 2 For loops method
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 1; j < nums.length; j++) {
        //         if(nums[i] == nums[j] && (i < j)){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(count);

        // method2 : Hashmap method.
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();

        // here, we will count the frequency of each of the element in the map.
        for (int element : nums) {  /*foreach loop :    element will give the element of the array nums.  */
            // int item = map.getOrDefault(element,0) + 1;
            map.put(element, map.getOrDefault(element, 0)+1);
        }
        for (int frequency : map.values() ) {
            count = count + (frequency * (frequency - 1) / 2);
        }
        // System.out.println(map);
        System.out.println("Answer: " + count); 
    }
}

/*

    Let's visualize the process of updating the freqMap using the line of code Map.put(num, freqMap.getOrDefault(num, 0) + 1) with an example.

    Consider the array [1, 2, 3, 1, 1, 3]. We'll iterate through the array and update the frequencies of each number in the freqMap using the mentioned line of code.

    Initially, the map is empty:     map : {}
    Processing the array elements one by one:

    Processing 1:

    As 1 is encountered for the first time, the freqMap doesn't contain the key 1 yet. So, the getOrDefault method will return the default value 0.
    freqMap.put(1, 0 + 1) updates the freqMap by adding the key-value pair (1, 1).
    The updated freqMap becomes {1=1}.

    Processing 2:

    As 2 is encountered for the first time, the freqMap doesn't contain the key 2 yet. So, the getOrDefault method will return the default value 0.
    freqMap.put(2, 0 + 1) updates the freqMap by adding the key-value pair (2, 1).
    The updated freqMap becomes {1=1, 2=1}.

    Processing the array elements one by one:

    Processing 1:

    As 1 is encountered for the first time, the freqMap doesn't contain the key 1 yet. So, the getOrDefault method will return the default value 0.
    freqMap.put(1, 0 + 1) updates the freqMap by adding the key-value pair (1, 1).
    The updated freqMap becomes {1=1}.
    Processing 2:

    As 2 is encountered for the first time, the freqMap doesn't contain the key 2 yet. So, the getOrDefault method will return the default value 0.
    freqMap.put(2, 0 + 1) updates the freqMap by adding the key-value pair (2, 1).
    The updated freqMap becomes {1=1, 2=1}.

    Processing 1:

    As 1 is encountered once again, the freqMap already contains the key 1 with a value of 2.
    The getOrDefault method will return the current frequency value 2 for the key 1.
    freqMap.put(1, 2 + 1) updates the freqMap by updating the value for the key 1 to 3.
    The updated freqMap becomes {1=3, 2=1, 3=1}.
    Processing 3:

    As 3 is encountered again, the freqMap already contains the key 3 with a value of 1.
    The getOrDefault method will return the current frequency value 1 for the key 3.
    freqMap.put(3, 1 + 1) updates the freqMap by updating the value for the key 3 to 2.
    The updated freqMap becomes {1=3, 2=1, 3=2}.
*/
