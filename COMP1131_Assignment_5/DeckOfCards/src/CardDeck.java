/*********************************************************************************************************************
 CardDeck.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 2

 Class that builds a deck of cards from Card.java class.  Performs functions on the deck to allow it to be used.

 *********************************************************************************************************************/

import java.util.Random;

public class CardDeck
{
    Card[] deck;
    int topCard = 0;    //iterator for counting remaining cards in the deck

    //Constructor build a card deck with a variable number of cards in suit and number order.
    public CardDeck(int numberOfDecks)
    {
        deck = new Card[52 * numberOfDecks];
        int card = 0;
        for (int s = 1; s <= 4; s++)
        {
            for (int f = 1; f <= 13; f++)
            {
                deck[card] = new Card(f,s);
                card++;
            }
        }
    }

    //shuffles the deck of cards with a random pairs of cards.
    public void Shuffle()
    {
        //This for defines the number of time a random pair of cards is swapped
        for (int i = 1; i < 256; i++)
        {
            //select two random cards and swap them
            Random generator = new Random();
            int firstCard = generator.nextInt(52);
            int secondCard = generator.nextInt(52);

            Card storage = deck[secondCard];
            deck[secondCard] = deck[firstCard];
            deck[firstCard] = storage;
        }
    }

    // get method that deals a single card from the top of the deck.
    public String DealCard()
    {
        String response;

        if (topCard <= 51) {
            response = deck[topCard].toString();
            topCard++;
        }
        else {response = "No remaining cards";}

        return response;
    }

    // get method that returns the number of cards left in the deck.
    public String CardsRemaining()
    {
        if (topCard >= 52) return "No remaining cards";
        else return "Remaining Cards: " + (52 - topCard);
    }

    public String toString()
    {
        String response = "Deck Contains:\n";

        for (Card card : deck)
        {
            response += card.toString() + "\n";
        }
        return response;
    }
}
