import java.util.Random;

public class CardDeck
{
    Card[] deck = new Card[52];
    int topCard = 0;

    public CardDeck()
    {
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
