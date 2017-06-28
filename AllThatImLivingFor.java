package br.edu.unoesc;

import org.jfugue.player.Player;
/**
 * MIDI for All that I'm living for - Evanescence
 * @author vitor
 *
 */
public class AllThatImLivingFor {
	public static void main(String[] args) {
		Player player = new Player();
		
		//@formatter:off
		player.play("V0 I[Piano] " 
			+ "39i 46i 51i 51+58q Rq | "
			+ "39i 46i 51i 51+56q Rq | "
			+ "39i 46i 51i 51+54q Rq | " 
			+ "39i 46i 51i 46i 53i 54i 53i 49i | " 
			+ "35i 42i 47i 49+54q Rq | "
			+ "35i 42i 47+51i 47+51+59q Rq | "
		//@formatter:on
		);
	}
}
