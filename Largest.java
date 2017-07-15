# Largest
import java.util.*;
import java.io.*;
public class Largest
{
 public static void main (String[] args) {
06
        Scanner input = new Scanner(System.in);
07
        int total=0;
08
        int numbers;
09
        int high;
10
        int counter=0;
11
        {
12
        while (counter < 10){
13
            numbers = input.nextInt();
14
            total = total + numbers;
15
            counter++;
16
             
17
        }
18
        high = total;
19
        System.out.println("The hightest number entered is "+ high);
20
        }
21
    }
22
}
