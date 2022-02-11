/**
 * Rohan Parikh
 * 11 February 2022
 * College Board Elevens Lab
 */

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String [] ranks = {"Jack", "Jack", "King", "Queen", "King", "Queen"};
        String [] suits = {"Blue", "Blue", "Blue", "Red", "Blue", "Red"};
        int [] values = {11, 11 ,11 ,12,13,12};
        Deck deckOne = new Deck(ranks, suits,values);
        System.out.println("Is Deck One Empty? " + deckOne.isEmpty());
        System.out.println("What's the size of Deck One? " + deckOne.size());
        System.out.println(deckOne);
        Card drawnCard = deckOne.deal();
        System.out.println(drawnCard);
    }
}