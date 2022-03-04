package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() { //Branch

        String test = getWinner();

        if(test.equals("xAdvant") || test.equals("X")){
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        String test = getWinner();

        if(test.equals("oAdvant") || test.equals("O")){
            return true;
        }

        return false;

    }

    public Boolean isTie() {

        String test = getWinner();

        if(test.equals("")){
            return true;
        }

        return false;
    }

    public String getWinner() {

        int xAdvant = 0;
        int oAdvant = 0;
        String line = "";
        String output = "";
        String result = "";

        String[] horizontal = new String[3];
        String[] vertical = new String[3];
        String[] cross = new String[2];

        for (int i = 0; i < 3; i++){        //Horizontal Print
            for(int j = 0; j < 3; j++){
                line += String.valueOf(board[i][j]);
            }
            horizontal[i] = line;
            System.out.println(horizontal[i]);
            line ="";
            if (horizontal[i].equals("X X") || horizontal[i].equals("XX ")){
                xAdvant++;
            } else if (horizontal[i].equals("O O") || horizontal[i].equals("OO ")){
                oAdvant++;
            }
            if (horizontal[i].equals("XXX")){
                return output = "X";
            } else if (horizontal[i].equals("OOO")){
                return output = "O";
            }
        }

        for (int i = 0; i < 3; i++){        //Vertical Print
            for(int j = 0; j < 3; j++){
                line += String.valueOf(board[j][i]);
            }
            vertical[i] = line;
            line = "";
            System.out.println(vertical[i]);
            if (vertical[i].equals("X X") || vertical[i].equals("XX ")){
                xAdvant++;
            } else if (vertical[i].equals("O O") || vertical[i].equals("OO ")) {
                oAdvant++;
            }
            if (vertical[i].equals("XXX")){
                return output = "X";
            } else if (vertical[i].equals("OOO")){
                return output = "O";
            }
        }

        cross[0] = String.valueOf(board[0][0]) + String.valueOf(board[1][1]) + String.valueOf(board[2][2]);
        cross[1] = String.valueOf(board[0][2]) + String.valueOf(board[1][1]) + String.valueOf(board[2][0]);

        for(int i = 0; i < 2; i++){
            if(cross[i].equals("X X") || cross[i].equals("XX ")){
                xAdvant++;
            } else if (cross[i].equals("O O") || cross[i].equals("OO ")){
                oAdvant++;
            }
            if(cross[i].equals("XXX")){
                return output = "X";
            } else if (cross[i].equals("OOO")){
                return output = "O";
            }
        }


        if (xAdvant > oAdvant){
            return "xAdvant";
        } else if (xAdvant < oAdvant){
            return "oAdvant";
        } else if (xAdvant == oAdvant){
            return "";
        }

        return output;
    }

}
