package beginner;


public class BlackJack {

	public static void main(String[] args) {

		/* 
		 * Given 2 Integer values greater than 0, return whichever value is closest to 21 without going over 21.  
		 * If they both go over 21 then return 0.
		 */
		
		blackJack(19, 20);

	}
	
	public static int blackJack (int dealer, int player) {
		if ( dealer > 21 && player > 21) {
			return 0;
		}else if ( dealer > player ) {
			System.out.println("Dealer wins with " + dealer);
		}else if ( player > dealer ) {
			System.out.println("Player wins with " + player);
		}else if ( dealer == player ) {
			System.out.println("No Winner!");
		}
		return 0;
	}
	
}
