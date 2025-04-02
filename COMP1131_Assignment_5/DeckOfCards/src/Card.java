public class Card
{
    private int face;
    private int suit;
    private String[] faces = {"", "Ace", "2", "3","4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suits = {"","Diamonds", "Clubs", "Hearts", "Spades"};

    //1 thru 13 (being Ace thru King), and the suit values are 1 thru 4 (being Diamonds, Clubs, Hearts, Spades)
    public Card (int f, int s)
    {
        face = f;
        suit = s;
    }

    public String toString()
    {
        return faces[face] + " of " + suits[suit];
    }
}
