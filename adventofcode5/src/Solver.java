import java.io.*;
import java.util.*;
public class Solver{

    private int solve1(int[] array) {
        //jump denotes how many positions in array should be jumped
        //pos is current position in the array
        //i counts increments, in other words total jumps needed to exit the loop
        int i = 0;
        int jump;
        int pos = 0;
        boolean b = true;

        //While-statement is always true, break from loop with try/catch because I don't understand java
        while (b) {
            try {
                jump = array[pos];
                array[pos] = array[pos] + 1;
                //Next position is current position + jump offset
                pos = pos + jump;
                i++;
            }
            //when a value outside list is requested (ie. list is escaped), break the loop
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("reached catch");
                break;
            }
        }
        return i;
    }

    private int solve2(int[] array) {
        int i = 0;
        int jump;
        int pos = 0;
        boolean b = true;


        while (b) {
            try {
                jump = array[pos];
                //if jump-length is 3 or greater, decrement value inside array
                if (jump >= 3) {
                    array[pos] = array[pos] - 1;
                }
                //otherwise, increment value inside array
                else {
                    array[pos] = array[pos] + 1;
                }
                pos = pos + jump;
                i++;

            }
            catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("reached catch");
                break;
            }
        }
        return i;
    }

    public static void main (String[] args){
        try {
            Solver solver = new Solver();

            int[] data1 = new int[1078];
            Scanner s1 = new Scanner(new File("input.txt"));
            int i = 0;
            //While there are still integers ahead in the file
            while(s1.hasNextInt()){
                data1[i] = s1.nextInt();
                i++;
            }
            s1.close();
            System.out.println(solver.solve1(data1));

            int[] data2 = new int[1078];
            Scanner s2 = new Scanner(new File("input.txt"));
            int j = 0;
            while(s2.hasNextInt()){
                data2[j] = s2.nextInt();
                j++;
            }
            s2.close();
            System.out.println(solver.solve2(data2));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}