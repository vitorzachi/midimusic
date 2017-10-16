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
		System.out.println("begin...");
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
		
			
				+ "65q 63i 65q 63i 65q 63i 65i 66q Rq | "
				+ "65q 63i 65q 63i 65q 63i 65i 66q Rq | "
				+ "65i 66i 68q 66q 65q Rq | "
				+ "65i 66i 68q 66q 65q 63q Rq | "
				
				+ "65q 63i 65q 63i 65q 63i 65i 66q Rq | "
				+ "65q 63i 65q 63i 65q 63i 70q 66q Rq | "
				+ "65i 66i 68q 66q 65q Rq | "
				+ "65i 66i 68q 66q 65q 63q 63q Rq | "
					
					+ "71q 71i 71i 71q 71q 71i 70q Rq | "
					+ "71q 71i 71i 71q 71q 71i 70q Rq | "
					+ "71q 71i 71i 71q 73q 70q Rq | "
					+ "63i 65q 66q 68q 66q 65q 63q Rq | "
					
//		@formatter:on
		);
		System.out.println("end :)");
	}
}
