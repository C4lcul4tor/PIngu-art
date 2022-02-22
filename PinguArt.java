package pgdp.pinguart;

import static pgdp.MiniJava.*;

public class PinguArt {

	public static void main(String[] args) {
	    

        String pingu[] = new String[8];
        for (int i = 0; i < 8; i++) {
            int number = readInt("Please enter a Pingu Art number:");
            String temp = "";
            for (int j = 0; j < 8; j++) {
                if (number % 10 == 0) {
                    temp += " ";

                } else if (number % 10 == 1) {
                    temp += "-";

                } else if (number % 10 == 2) {
                    temp += "~";

                } else {
                    temp += "P";
                }
                number = number / 10;
            }
            pingu[i] = temp;
        }
        write("+---[PinguArt]---+");
        write("|"+pingu[0] + pingu[1]+"|" );
        write("|"+pingu[2] + pingu[3]+"|" );
        write("|"+pingu[4] + pingu[5]+"|" );
        write("|"+pingu[6] + pingu[7]+"|" );
        write("+----------------+");
     

	}
}
