// import java.util.*;
// class collectionDemo{
//     public static void main(String a[]){
//         ArrayList<String>list=new ArrayList<>();
//         list.add("VD");//for adding element
//         list.add("SD");
//         list.add("KD");
//         list.remove("VD");//will remove element
//         //list.clear()//will delete all elem
//         System.out.println(list.get(1));//print ele at index 1
//         list.set(1,"VD");
//         System.out.println(list.size());
//         System.out.println(list);
//     }
// }

//sorting arraylist while taking user input
import java.util.*;
import java.util.Collections;
import java.util.Scanner;
public class collectionDemo{
    public static void main(String a[]){


        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // int n=0;
        // Scanner sc  = new Scanner(System.in);
        // System.out.println("Enter size of array:");
        // n=sc.nextInt();
        // System.out.println("Enter elements of array:");

        // for(int i=0;i<n;i++){
            
        //     nums.add(sc.nextInt());
        // }
        // //sort arrays reverse order
        // Collections.sort(nums,Collections.reverseOrder());
        // // for(Integer i:nums){
        // //     System.out.println("Sorted array is: "i);
        // // }
        // System.out.println("Sorted array is: "+ nums);

        //SET interface-does not allow duplicates
        // Set<Integer>nums=new HashSet<>();
        // nums.add(23);
        // nums.add(23);
        // nums.add(53);
        // nums.add(283);
        // System.out.println(nums);
        // System.out.println(nums.contains(53));//checks ele in set
        // nums.remove(23);
        // System.out.println(nums);

        // System.out.println(nums.size()); // Output: 2
        // System.out.println(nums.isEmpty());
        // for(int number:nums){
        //     System.out.println(nums);
        // }

        //MAP interface-Store elem in key-value pairs
        Map<String, Integer> ages = new HashMap<>();
        
        // Adding key-value pairs
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);
        
        // Accessing values by key
        System.out.println(ages.get("Alice")); // Output: 30
        
        // Checking if a key exists
        System.out.println(ages.containsKey("Bob")); // Output: true
        
        // Removing key-value pairs
        ages.remove("Charlie"); // Removes the entry with key "Charlie"
        
        // Checking size and emptiness
        System.out.println(ages.size()); // Output: 2
        System.out.println(ages.isEmpty()); // Output: false
        
        // Clearing the map
        ages.clear(); // Clears the ma
    }
}