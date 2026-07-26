package linearsearch;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,-120,6,7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums)
    {
        int count = 0;
        for(int element : nums)
        {

          int number  =  search2(element);
          if(number%2==0)
          {
             count++;
          }
        }
       return count;
    }

    static int search(int num)
    {
        if(num<0)
        {
            num *= -1;
        }
        int count = 0;
        if(num==0)
        {
            count++;
        }

        while(num>0)
        {
            count++;
            num = num/10;
        }

        return count;
    }

    static int search2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
