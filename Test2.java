import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Methods me = new Methods();
        File file = new File("src/Array.txt");
        String [][] array = new String [13][13];
        Scanner input = new Scanner(file);

    for(int i =0; i <=5; i++) {
        array[0][i] = Integer.toString(input.nextInt());
    }

    for(int i = 1; i <= 3;i++) {
        for (int y = 0; y <= 6;y++ ){
            if(input.hasNextInt()) {
                array[i][y] = Integer.toString(input.nextInt());
            }
            else if(input.hasNext()){
                array[i][y] = input.next();
            }
        }
    }

    for(int i = 4; i <= 7; i++) {
        for(int y = 0; y <= 1;y++) {
            array[i][y] = Integer.toString(input.nextInt());
        }
    }


    System.out.println("Access matrix Initialized");
    System.out.println("The Access Matrix is:");

    System.out.println("PID/RID " + array[0][0] + "  " + array[0][1] + "   " + array[0][2] + "    " + array[0][3] + "     " + array[0][4] + "     " + array[0][5]);

    for (int i = 1; i <= 3; i++) {
        for (int y = 0; y <= 6; y++) {
            System.out.print(array[i][y] + "      ");
        }
        System.out.println();
    }

        //me.compareTo(array[returnCollummIndex(array[4][0])][returnRowIndex(array[0][3])],array[returnCollummIndex(array[5][0])][returnRowIndex(array[4][1])]);
        //System.out.println(array[returnCollummIndex(array[1][0])][returnRowIndex(array[0][3])]);
        //System.out.println(array[1][3].equals("X"));

        System.out.println(returnCollummIndex("34"));

        //me.compareTo(array[1][3], array[2][3]);
}
    public static int returnRowIndex(String x) throws Exception {
        // find the x value in the array
        int count = 0;
        String[][] array = new String[0][6];
        array[0][1] = "1000";
        array[0][2] = "1011";
        array[0][3] = "1006";
        array[0][4] = "10";
        array[0][5] = "34";
        array[0][6] = "18";

        while (x != array[0][count]) {

            count++;
        }
        return count;
    }

    public static int returnCollummIndex(String x) {
        int count = 0;
        String[][] array = new String[3][0];
        array[1][0] = "10";
        array[2][0] = "34";
        array[3][0] = "18";

        while(x != array[count][0]) {
            count++;
        }
        return count;
    }



        /*if(X == "O" & Y == "A"){
            return X;
        }
        else if(X == "O" & Y =="W"){
            return X;
        }
        else if(X == "O" & Y =="R"){
            return X;
        }else if(X == "O" & Y =="X"){
            return X;
        }else if(X == "O" & Y =="N"){
            return X;
        }else if(X == "A" & Y =="W"){
            return X;
        }else if(X == "A" & Y =="R"){
            return X;
        }else if(X == "A" & Y =="X"){
            return X;
        }else if(X == "A" & Y =="N"){
            return X;
        }else if(X == "W" & Y =="R"){
            return X;
        }else if(X =="W" && Y=="X") {
            return X;
        }else if(X=="X" && Y=="W"){
            return Y;
        }
        else if(X == "W" & Y =="N"){
            return X;
        }else if(X == "R" & Y =="X"){
            return X;
        }else if(X == "R" & Y =="N"){
            return X;
        }else if(X == "X" & Y =="N"){
            return X;
        }else{
            return "missed";
        }*/


}
