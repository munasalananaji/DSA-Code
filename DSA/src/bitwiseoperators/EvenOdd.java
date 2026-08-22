package bitwiseoperators;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numvber");
        int n = sc.nextInt();
        System.out.println("The give number is odd ..? "+ ((n&1)==1));
    }
}
