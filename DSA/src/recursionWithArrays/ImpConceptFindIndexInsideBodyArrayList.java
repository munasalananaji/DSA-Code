package recursionWithArrays;

import java.util.ArrayList;

//Only knowledge purpose we don't use
public class ImpConceptFindIndexInsideBodyArrayList {
    /*
    Let me add some notes before adding the code here - Here when you revision observer that
    array
    We are creating the array list in the body of the function - Which means you might think that there will
    be always new object creates for the arrayList object. That is true actually
    But in recursion we are returning those all values back when calling back to the main stack
    so instead of returning that collect those answers and all after the recursion call then return
    so that you would have a final result - See kunal notes he wrote iteration as well clearly
     */


    //VVVV - IMP simple when returning the stack values you can collect in an ArrayList/List
    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,6};
        int target = 4;
        ArrayList<Integer> res = findAllIndexes(arr, target, 0);
        System.out.println("The indexes of the target num are "+ res);
    }

    private static ArrayList<Integer> findAllIndexes(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length)
        {
            return list;
        }
        if(arr[i]== target)
        {
            list.add(i);
        }
        //Now without returning collecting all answers in the back trace call from the recursion
        ArrayList<Integer> allAnswersFromStackBackTracecall = findAllIndexes(arr, target, i+1);
        list.addAll(allAnswersFromStackBackTracecall);
        return list;

    }
}
