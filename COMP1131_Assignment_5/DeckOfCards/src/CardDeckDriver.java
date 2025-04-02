public class CardDeckDriver
{
    public static void main(String[] args)
    {
        CardDeck deck = new CardDeck();

        System.out.print(deck.toString());

        deck.Shuffle();

        System.out.println();
        System.out.print(deck.toString());

        for (int i = 0; i <= 52; i++) //this intentionally is overrunning by 1 to demonstrate no array bounds errors
        {
            String card = deck.DealCard();

            System.out.println();
            System.out.println(card);
            System.out.println(deck.CardsRemaining());
        }

    }
}
