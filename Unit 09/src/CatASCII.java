public class CatASCII {

    public static void main(String [] args) {
        String [][] asciiCat = {
                {" ", "_", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "}, //20 cols
                {"(", " ", "\\", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {" ", ")", " ", ")", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "},
                {"(", " ", "(", " ", " ", ".", "-", "\"", "\"", "-", ".", " ", " ", "A", ".", "-", ".", "A", " ", " "},
                {" ", "\\", " ", "\\", "/", " ", " ", " ", " ", " ", " ", "\\", "/", " ", ",", " ", ",", " ", "\\", " "},
                {" ", " ", "\\", " ", " ", " ", "\\", " ", " ", " ", " ", "=", ";", " ", " ", "t", " ", " ", "/", "="},
                {" ", " ", " ", "\\", " ", " ", " ", "|", "\"", "\"", ".", " ", " ", " ", ",", "-", "-", ".", " ", " "},
                {" ", " ", " ", " ", "/", " ", "/", "/", " ", " ", " ", "|", " ", "|", "|", " ", " ", " ", " ", " "},
                {" ", " ", " ", "/", "_", ",", ")", ")", " ", " ", " ", "|", "_", ",", ")", ")", " ", " ", " ", " "}
        }; //9 rows

        for(String[] row : asciiCat) {
            for (String column : row)
                System.out.print(column);
            System.out.println();
        }

    }
}