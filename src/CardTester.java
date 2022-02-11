/**
 * Rohan Parikh
 * 11 February 2022
 * College Board Elevens Lab
 */

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        // jack queen king
        // blue red
        // 11 12 13
        Card numberOne = new Card("Jack", "Blue" , 11);
        Card numberTwo = new Card("Queen", "Red", 12);
        Card numberThree = new Card("King", "Blue", 13);
        Card numberFour = new Card("Jack", "Blue", 11);
        System.out.println("Card numberOne Details\n" + numberOne + "\n");
        System.out.println("Card numberTwo Details\n" + numberTwo + "\n");
        System.out.println("Card numberThree Details\n" + numberThree +"\n");
        System.out.println("Card numberFour Details\n" + numberFour + "\n");
        System.out.println("Are card number one and four equal?\n" + numberOne.matches(numberFour));

    }
}