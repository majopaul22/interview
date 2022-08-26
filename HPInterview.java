class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        String result = yourfunction("a2b5c7");
        char[][] horizontal = {{'R','R','R','R'}, {'B','R','R','R'} };
        System.out.println(connect4(horizontal));

        char[][] vertical = {{'B','R','R','R'},
                              {'B','R','R','R'},
                              {'B','B','R','B'},
                              {'B','B','B','R'} ,

        };
        System.out.println(connect4(vertical));
        char[][] diagonal = {{'B','R','R','R'},
                              {'R','B','R','R'},
                              {'B','R','B','B'},
                              {'R','B','R','R'} ,

        };
        System.out.println(connect4(diagonal));
    }


    //Create a function that takes in a string of N aplhanumeric pairs (i.e. "a2b5c7") and returns a string that 'expands' the string by repeating the character of each pair a number of times designated by it's paired number.
    //"a2b5c7" -> "aabbbbbccccccc"
    public static String yourfunction(String input) {
        StringBuilder result = new StringBuilder();
        char [] cArray = input.toCharArray();
        for(int i = 1; i < input.length(); i += 2) {
            // even - characters
            // odd - numbers
            for (int j = 1; j <=  Character.getNumericValue(cArray[i]); j++) {
                result.append(cArray[i-1]);
            }
        }
        return result.toString();

    }

    public static char connect4(char[][] input) {
        int size = input[0].length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 3; j++) {
                if(input[i][j] == input[i][j+1] &&
                    input[i][j+1] == input[i][j+2] &&
                    input[i][j+2] == input[i][j+3])
                    return input[i][j];
            }
        }
        for (int i = 0; i < size - 3; i++) {
            for (int j = 0; j < size; j++) {
                if(input[i][j] == input[i+1][j] &&
                        input[i+1][j] == input[i+2][j] &&
                        input[i+2][j] == input[i+3][j])
                    return input[i][j];
            }
        }
        for (int i = 0; i < size - 3; i++) {
            for (int j = 0; j < size -3; j++) {
                if(input[i][j] == input[i+1][j+1] &&
                        input[i+1][j+1] == input[i+2][j+2] &&
                        input[i+2][j+2] == input[i+3][j+3])
                    return input[i][j];
            }
        }
        return 'E';
    }
}