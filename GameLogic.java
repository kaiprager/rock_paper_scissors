package rock_paper_scissors;

import java.util.Random;

public class GameLogic {
	
	public String playing(int userChoice) {
		
		Random random = new Random();
		int randomResult = random.nextInt(3) + 1;
		
		String result = switch(userChoice) {
		
			case 1 -> {
				if(randomResult == 1) {
					yield "It's a tie.";
				} else if(randomResult == 2) {
					yield "Paper wraps Rock.\nYou've lost.";
				} else {
					yield "Rock crushes Scissors.\nYou've won.";
				}
			}
			case 2 -> {
				if(randomResult == 1) {
					yield "Paper wraps Rock.\nYou've won.";
				} else if(randomResult == 2) {
					yield "It's a tie.";
				} else {
					yield "Scissors cut Paper.\nYou've lost.";
				}
			}
			case 3 -> {
				if(randomResult == 1) {
					yield "Rock crushes Scissors.\nYou've lost.";
				} else if(randomResult == 2) {
					yield "Scissors cut Paper.\nYou've won.";
				} else {
					yield "It's a tie.";
				}
			}
			default -> throw new IllegalArgumentException("Invalid Option");
		
		};
		
		return result;
	}

}
