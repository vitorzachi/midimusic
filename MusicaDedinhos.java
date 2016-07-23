package music;

import org.jfugue.player.Player;
/**
 * Musica dos dedinhos.
 * @author vitor
 *
 */
public class MusicaDedinhos {

	public static void main(String[] args) {

		Player player = new Player();

		player.play("V0 "
				+ "64q 66q 68q 64q R. | "
				+ "64q 66q 68q 64q R. | "
				+ "68q 69q 71q Rq | "
				+ "68. 68. 69q 71q R. | "
				+ "71. 73. 71. 69. 68. 64. R. | "
				+ "71. 73. 71. 69. 68. 64. R. | "
				+ "66. 61q 64q Rq | "
				+ "66. 61q 64hq Rq |");

	}
	
}
