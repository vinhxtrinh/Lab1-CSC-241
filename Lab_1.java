public class Lab_1 {
    public static void main(String[] args) throws Exception {
        Methods me = new Methods();

        String [][] array = new String[10][10];

        me.readFiletoArray(array);
        me.outputArray(array);
        me.compare(array[1][0],array[0][2]);
        me.compare(array[2][0],array[0][0]);
        me.compare(array[2][0],array[0][4]);
        System.out.print("End of Program!");
    }
}