package recursionWithArrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckTargetInArray {
    static void main(String[] args) {
        int[] arr = {2,5,78,12, 1 ,56,1};
      int  target = 1;
      boolean res = findTarget(arr, target, 0);
        System.out.println("is target found "+res);
        //To return the index of the element
        int index = findTargetIndex(arr,target,0);
        System.out.println("The index of the target element is "+index);
        CheckTargetInArray ch = new CheckTargetInArray();
       List<Integer> list = ch.findAllIndex(arr, target, 0, new ArrayList<>() );
        System.out.println("The indexes including the duplicate elements are "+list);

    }


    private  ArrayList findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {
        if(i == arr.length)
        {
            return list;
        }
        if(arr[i]== target) list.add(i);
        return findAllIndex(arr, target, i+1, list);
    }

    private static boolean findTarget(int[] arr, int target, int i) {

        if(i== arr.length)
        {
            return false;
        }

        return arr[i] == target || findTarget(arr, target, i+1);

    }
    private static int findTargetIndex(int[] arr, int target, int i) {

        if(i== arr.length)
        {
            return -1;
        }

        if(arr[i] == target ) return i;
        return findTargetIndex(arr, target, i+1);

    }
}
