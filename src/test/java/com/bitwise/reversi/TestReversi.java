package test.java.com.bitwise.reversi;

/**
 * Created by saurabhr on 7/25/2016.
 */

import static org.junit.Assert.*;

import main.java.com.bitwise.reversi.Reversi;
import org.junit.Before;
import org.junit.Test;


public class TestReversi {
    Reversi game;
    @Before
    public void initTests(){
        this.game= new Reversi();
    }

    @Test
    public void itShouldPassOnDirection() {
        String input=
                ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . B W . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        "B";
        String output=
                ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . 0 . . . \n" +
                        ". . . B W 0 . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . . 0 . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        "B";

        assertEquals(output,this.game.printLegalMoves(input));
    }

    @Test
    public void itShouldPassOnOppositeUpDirection() {
        String input=
                ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . B W . . .\n" +
                        ". . . W W . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        "B";
        String output=
                ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . B W 0 . . \n" +
                        ". . . W W . . . \n" +
                        ". . . 0 . 0 . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        "B";

        assertEquals(output,this.game.printLegalMoves(input));
    }
    @Test
    public void itShouldPassOnOppositeDownDirection() {
        String input=
                ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        "B";
        String output=
                ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . 0 . . . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 . . . . . \n" +
                        ". . . . . . . . \n" +
                        "B";
        assertEquals(output,game.printLegalMoves(input));
    }

    @Test
    public void itShouldPassOnOppositeUpDownDirection() {
        String input=
                ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . B W W . .\n" +
                        ". . . W B . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        "B";
        String output=
                ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . 0 . 0 . \n" +
                        ". . . B W W . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . . 0 . . . . \n" +
                        ". . . . . . . . \n" +
                        ". . . . . . . . \n" +
                        "B";
        assertEquals(output,game.printLegalMoves(input));
    }
    @Test
    public void itShouldPassOnReverseDirection() {
        String input=
                ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . W . . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . W B . . .\n" +
                        ". . . . . . . .\n" +
                        ". . . . . . . .\n" +
                        "B";
        String output=
                ". . . . . . . . \n" +
                        ". . 0 . . . . . \n" +
                        ". . 0 W . . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 W B . . . \n" +
                        ". . 0 . . . . . \n" +
                        ". . . . . . . . \n" +
                        "B";
        assertEquals(output,game.printLegalMoves(input));
    }
}