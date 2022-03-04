package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
    }

    public Boolean isInFavorOfX(char[][] array) { //Branch

        int xhAdvant =0;
        int xvAdvant =0;
        int xcAdvant =0;
        int ohAdvant =0;
        int ovAdvant =0;
        int ocAdvant =0;
        int xAdvent;
        int oAdvent;


        String[] horizontal = new String[3];
        String[] vertical = new String[3];
        String[] cross = new String[2];

        for (int i = 0; i < 3; i++){        //Horizontal Print
            for(int j = 0; j < 3; j++){
            horizontal[i] += String.valueOf(array[i][j]);
            }
            if (horizontal[i].equals("x x") || horizontal[i].equals("xx ")){
                xhAdvant++;
            } else if (horizontal[i].equals("o o") || horizontal[i].equals("oo ")){
                ohAdvant++;
            }
        }


        for (int i = 0; i < 3; i++){        //Vertical Print
            for(int j = 0; j < 3; j++){
                vertical[i] += String.valueOf(array[j][i]);
            }
            System.out.println(vertical[i]);
            if (vertical[i].equals("x x") || vertical[i].equals("xx ")){
                xvAdvant++;
            } else if (vertical[i].equals("o o") || vertical[i].equals("oo ")) {
                ovAdvant++;
            }
        }

        cross[0] += String.valueOf(array[0][0]) + String.valueOf(array[1][1]) + String.valueOf(array[2][2]);
        cross[1] += String.valueOf(array[0][2]) + String.valueOf(array[1][1]) + String.valueOf(array[2][0]);

        for(int i = 0; i < 2; i++){
        if(cross[i].equals("x x") || cross[i].equals("xx ")){
            xcAdvant++;
        } else if (cross[i].equals("o o") || cross[i].equals("oo ")){
            ocAdvant++;
        }
        }

        xAdvent = xcAdvant + xhAdvant + xvAdvant;
        oAdvent = ocAdvant + ohAdvant + ovAdvant;

        return xAdvent > oAdvent;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
