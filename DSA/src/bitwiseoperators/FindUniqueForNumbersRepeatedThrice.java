package bitwiseoperators;

/*For this problem XOR will not work because it only make the number zero if even no of times repeated*/
public class FindUniqueForNumbersRepeatedThrice {
    static void main(String[] args) {
        int[] arr =  {3,3,3,5,5,5,8,7,7,7,9,9,9};
        int result = 0;
        for(int bit =0; bit<=32 ;bit++)
        {
            int count =0;
            for(int n : arr)
            {
                if((n&(1<<bit))!=0)
                {
                    count++;
                }
            }
            if(count%3!=0)
            {
                result = result | (1<<bit);
            }
        }
        System.out.println("The non repeated number from the given array is "+result);
    }
}
