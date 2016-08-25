package midimusic;

import org.jfugue.player.Player;

/**
 *
 * @author vitor
 */
public class PraSerSincero {

    
    public static void main(String[] args) {
        Player player = new Player();
		
		
                /*
                E |-------0-2-0----------------------------------------|
                B |-----3-------3---0---3-2--------2-3-2---------------|
                G |---2-----------2---0----------4-------4-2-4-2-0-----|
                D |-0---------------------------4-----------------4-2--|
                A |----------------------*0*---2--------------------0--|
                E |----------------*3*----------------------*3*--------|
                */
		
                String bloco_inicio =  "50i 57i 62i 64i | 66i 64i 62i 57i | "
                                        + "59i 55i 59i 62i 61q | Rii |";
                String bloco_compl =  " 47i 54i 59i 61i | 62i 61i 59i 57i |"
                                        + " 59i 57i 55i 54i 52qq ";
		player.play("V0 " 
				+ bloco_inicio
                                + bloco_compl
                                + bloco_inicio
                                + bloco_compl
		);
    }
    
}
