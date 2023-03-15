package ArrayList;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		ArrayList<String> game = new ArrayList<>();
		game.add("football");
		game.add("cricket");
		game.add("socar");
		game.add("tanis");
		game.remove(3);
		game.remove("football");
		
		
		if (game.isEmpty()) {
			System.out.println("There is no games");
		}
		else {
			for(String games :game ) {
			System.out.println("Games "+games);
		}

		
		}
	}

}
