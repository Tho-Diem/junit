package com.bae.blackjack.main;

public class BlackJack {
	
	public int twist(int dealer) {
		int twistCard = ((int)(Math.random()*11)+1);
		return twistCard;
	}

	
	public int play(int player, int dealer) {

		if (player>30 || dealer>30 ||player<4|| dealer<4) {
			return -1;
		}
		else if (player>21 && dealer>21) {
			return 0;
		}
		else if (dealer>21) {
			return player;
		}
		else if (player>21) {
			return dealer;
		}
		
		else if (player > dealer) {
			return player;
		}
		return dealer;
	}

	public static void main(String[] args) {

	}

}
