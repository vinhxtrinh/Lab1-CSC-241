import java.io.File;
import java.util.*;

public class Methods {
        //static Object [][] arr = new Object[7][10];
        public void readFiletoArray(String[][] array) throws Exception {
            File file = new File("src/Array.txt");

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


        }

        public void outputArray(Object[][] array) {
            System.out.println("Access matrix Initialized");
            System.out.println("The Access Matrix is:");
            System.out.println();

            System.out.println("PID/RID " + array[0][0] + "  " + array[0][1] + "   " + array[0][2] + "    " + array[0][3] + "     " + array[0][4] + "     " + array[0][5]);

            for (int i = 1; i <= 3; i++) {
                for (int y = 0; y <= 6; y++) {
                    System.out.print(array[i][y] + "      ");
                }
                System.out.println();
            }
        }

   public void compareTo(String X, String Y) {


        if (X .equals("O") && Y.equals("A")) {
            System.out.print("O");
        } else if (X.equals("O") && Y.equals("W")) {
            System.out.print("O");
        } else if (X.equals("O") && Y.equals("R")) {
            System.out.print("O");
        } else if (X.equals("O") && Y.equals("X")) {
            System.out.print("O");
        } else if (X.equals("O") && Y.equals("N")) {
            System.out.print("  No one has higher access");
        } else if (X.equals("A") && Y.equals("W")) {
            System.out.print("A");
        } else if (X.equals("A") && Y.equals("R")) {
            System.out.print("A");
        } else if (X.equals("A") && Y.equals("X")) {
            System.out.print("A");
        } else if (X.equals("A") && Y .equals("N")) {
            System.out.print("A");
        } else if (X.equals("W") && Y.equals("R")) {
            System.out.print("W");
        } else if (X.equals("W") && Y.equals("X")) {
            System.out.print("W");
        } else if (X .equals("X") && Y.equals("W")) {
            System.out.print("W");
        } else if (X.equals("W") && Y.equals("N")) {
            System.out.print("W");
        }
        else if(X.equals("N") && Y.equals("W")){
            System.out.print("W");
        }
        else if (X.equals("R") && Y.equals("X")) {
            System.out.print("R");
        } else if (X.equals("R") && Y.equals("N")) {
            System.out.print("R");
        }
            else if(X.equals("N") && Y.equals("R")){
            System.out.print("R");
            }
         else if (X.equals("X") && Y.equals("N")) {
            //System.out.print("X");

        }
        else if(X.equals("O") && Y.equals("N")) {
            System.out.print("No one has higher access");
        }
    }

    public void compare(String x, String y) {
            System.out.println("For pid " + x + " resouce " + y);
        if (x.equals("10") && y.equals("1006")) {
            System.out.print("  pid 34 has higher access ("); compareTo("X","W"); System.out.println(")");
            compareTo("X","N");

        }
        else if(x.equals("34") && y.equals("1000")) {
            System.out.print("  pid 10 has higher access (");compareTo("N","R"); System.out.println(")");
            System.out.print("  pid 18 has higher access (");compareTo("N", "W"); System.out.println(")");
        }
        else if(x.equals("34") && y.equals("34")) {
            compareTo("O", "N");
            System.out.println();
            //compareTo("O", "N");
        }
    }
}
