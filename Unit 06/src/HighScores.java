public class HighScores {

    public static void main(String[] args){

        // highScores array declaration
        int[] highScores = { 10, 9, 9, 7};
        // use a variable for the index
        int index = 3;
        // modify array value at index
        highScores[index] = 11;
        // print array value at index
        System.out.println(  highScores[index] );
        System.out.println(  highScores[index - 1] );


    }

}
