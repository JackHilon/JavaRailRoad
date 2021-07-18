
package javarailroad;

import java.util.Scanner;


public class JavaRailRoad {

    
    // https://open.kattis.com/problems/railroad2
    // simple calculation program
    // we can make closed-curve if the number of open ends is an even number.
    // accepted in kattis.
    
    
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
        PrintResult(in);
        
    }
    private static void PrintResult(Scanner input)
    {
        System.out.println(ClosedCurve(Line2IntArray(input)));
    }
    
    private static String ClosedCurve(int[] numbers)
    {
        int a=numbers[0];
        int b=numbers[1];
        int res =Math.abs(a*4-b*3);
        if (res%2==0)
            return "possible";
                    else
            return "impossible";
    }
    
    private static int[] Line2IntArray(Scanner input)
    {
        String str = input.nextLine();
        String[] strArray=str.split(" ",2);
        int[] numbers=new int[2];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(strArray[i]);
        }
        return numbers;
    }
}
