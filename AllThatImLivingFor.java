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
		System.out.println("playing...");
		//@formatter:off
		player.play("V0 I[Piano] " 
			/*
			+ "47i 54i 59i 66q Rq | "
			+ "47i 54i 59i 64q Rq | "
			+ "47i 54i 59i 62q Rq | " 
			+ "47i 54i 59i 54i 61i 62i 61i 57i | " 
			+ "43i 50i 55i 62q Rq | "
			+ "43i 50i 55i 67q Rq | "
			+ "43i 50i 55i 66q Rq | "
			+ "43i 50i 55i 64q Rq | "*/
		+ "51i 58i 63i 70q Rq | "
			+ "51i 58i 63i 68q Rq | "
			+ "51i 58i 63i 66q Rq | " 
			+ "51i 58i 63i 58i 65i 66i 65i 61i | " 
			+ "47i 54i 59i 66q Rq | "
			+ "47i 54i 59i 71q Rq | "
			+ "47i 54i 59i 70q Rq | "
			+ "47i 54i 59i 68q Rq | "
			
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
										
					+ "71q 71i 71i 71q 71q 71i 70q Rq | "
					+ "71q 71i 71i 71q 71q 71i 70q Rq | "
					+ "71q 71i 71i 71q 73q 70q Rq | "
					+ "63i 65q 66q 68q 66q 65q 63q 63qq Rq | "
					
//		@formatter:on
		);
		System.out.println("end :)");
	}
}
