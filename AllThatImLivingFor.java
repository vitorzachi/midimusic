package br.edu.unoesc;

import org.jfugue.player.Player;
/**
 * MIDI for All that I'm living for - Evanescence
 * @author vitor
 *
 */
public class AllThatImLivingFor {
	static final int ADICAO_OITAVA = 4;
	public static void main(String[] args) {
		Player player = new Player();
		
		//@formatter:off
		player.play("V0 I[Piano] " 
			+ "39i 46i 51i 58q Rq | "
			+ "39i 46i 51i 56q Rq | "
			+ "39i 46i 51i 54q Rq | " 
			+ "39i 46i 51i 46i 53i 54i 53i 49i | " 
			+ "35i 42i 47i 54q Rq | "
			+ "35i 42i 47i 59q Rq | "
			+ "35i 42i 47i 58q Rq | "
			+ "35i 42i 47i 56q Rq | "
		
//		@formatter:on
		);
	}
}
