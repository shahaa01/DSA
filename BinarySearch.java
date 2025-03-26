import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        //Lets try to find ceiling of a target in an array:

        //given array:
        int[] arr = {12,2,3,4,15};
        int target = 17;
        int ceiling = findCeiling(arr, target);
        System.out.println(ceiling);
    }

    public static int findCeiling(int[] array, int target) {
        //lets try to apply binary search here

        //but first lets make sure if the array is sorted
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //lets have the basic structure of binary search ready

        int low = 0;
        int high = array.length - 1;

        //lets have the loop condition
        while(low < high) {
            int mid = (high + low) / 2;

            //if mid is equal to the target return mid
            if(array[mid] == target) {
                return array[mid];
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //if the number is not present in the array - the low would be the ceiling
        if(array[low] < target) {
            return -1;
        }

        return array[low];
    }
}