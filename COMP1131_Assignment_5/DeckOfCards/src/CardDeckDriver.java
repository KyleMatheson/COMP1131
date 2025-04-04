/*********************************************************************************************************************
 CardDeckDriver.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 2

 Driver and entry method for testing the functions of Card.java and CardDeck.java

 *********************************************************************************************************************/
public class CardDeckDriver
{
    public static void main(String[] args)
    {
       // Make a 52 card deck
        CardDeck deck = new CardDeck(1);

        System.out.print(deck.toString());

        deck.Shuffle();

        // Output
        System.out.println();
        System.out.print(deck.toString());

        // Deal the entire deck and print the results.
        for (int i = 0; i <= 52; i++) //this intentionally is overrunning to demonstrate no array bounds errors
        {
            String card = deck.DealCard();

            System.out.println();
            System.out.println(card);
            System.out.println(deck.CardsRemaining());
        }

    }
}
