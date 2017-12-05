//import java.io.*;
//import java.util.*;
public class Solver{

private int solve(int[] array) {
    //jump denotes how many positions in array should be jumped
    //pos is current "position" in the array
    int i = 0;
    int jump;
    int pos = 0;
    boolean b = true;


        while (b) {
            //System.out.println(pos);
            //System.out.println(array.length);
            try {
                if (pos > array.length || pos < 0) {
                    b = false;
                } else {
                    jump = array[pos];
                    //System.out.println("jump: " + jump);
                    //System.out.println("value in array before: " + array[pos]);
                    array[pos] = array[pos] + 1;
                    //System.out.println("Value after increment +1: " + array[pos]);

                    pos = pos + jump;
                    //System.out.println("Next position to jump to: " + pos);
                    i++;
                    //System.out.println("iteration nr: " + i);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                //System.out.println("reached catch");
                break;
            }
        }
    return i;

}


public static void main (String[] args) {
        //Scanner s = new Scanner(new File("input.txt"));
        //int[] array = new int[s.nextInt()];
        //for (int i = 0; i < array.length; i++)
        //array[i] = s.nextInt();

        int array[] = new int[5];
        array[0] = 0;
        array[1] = 3;
        array[2] = 0;
        array[3] = 1;
        array[4] = -3;

        Solver solver = new Solver();
        System.out.println(solver.solve(array));
        }
}