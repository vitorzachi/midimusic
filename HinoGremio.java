package br.edu.unoesc;

import org.jfugue.player.Player;
/**
 * MIDI for Hino do Grêmio FBPA
 * @author vitor
 *
 */
public class HinoGremio {
	public static void main(String[] args) {
		Player player = new Player();
		System.out.println("begin...");
		System.out.println("playing...");
		//@formatter:off
		player.play("V0 I[Piano] " 
				+ "67q 64i 62i 60q 62i 64i 62q 55h Rq | "
				+ "67q 64i 62i 60q 62i 64i 62h Rq | "
				+ "64i 65i 67q | 66i 67i 69q | 67i 69i 71q 69h | "
				+ "64i 65i 67q | 69i 67i 62q | 65i 64i 60w | "
			
//		@formatter:on
		);
		System.out.println("end :)");
	}
}
