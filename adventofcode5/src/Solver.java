import java.io.*;
import java.util.*;
public class Solver{

    private int solve(int[] array) {
        //jump denotes how many positions in array should be jumped
        //pos is current position in the array
        //i counts increments, in other words total jumps needed to exit the loop
        int i = 0;
        int jump;
        int pos = 0;
        boolean b = true;

        while (b) {
            //System.out.println(pos);
            //System.out.println(array.length);
            try {
                jump = array[pos];
                //System.out.println("value in array before: " + jump);
                array[pos] = array[pos] + 1;
                //System.out.println("Value after increment +1: " + array[pos]);

                pos = pos + jump;
                //System.out.println("Next position to jump to: " + pos);
                i++;
                //System.out.println("iteration nr: " + i);
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
            int[] data = new int[1078];
            Scanner s = new Scanner(new File("input.txt"));
            int i = 0;
            while(s.hasNextInt()){
                data[i] = s.nextInt();
                i++;
            }
            Solver solver = new Solver();
            System.out.println(solver.solve(data));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}