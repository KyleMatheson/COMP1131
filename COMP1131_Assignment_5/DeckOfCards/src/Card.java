/*********************************************************************************************************************
 Card.java

 Kyle Matheson T00153296
 COMP1131 Assignment 5 Question 2

Class that creates individual cards.

 *********************************************************************************************************************/
public class Card
{
    private int face;
    private int suit;
    private final String[] FACES = {"", "Ace", "2", "3","4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private final String[] SUITS = {"","Diamonds", "Clubs", "Hearts", "Spades"};

    //1 thru 13 (being Ace thru King), and the suit values are 1 thru 4 (being Diamonds, Clubs, Hearts, Spades)
    public Card (int f, int s)
    {
        //check that the range is valid
        if (f >0 && f <= 13 && s > 0 && s <= 4)
        {
            face = f;
            suit = s;
        }
        else
        {
            System.out.println("Invalid input");
        }
    }

    public String toString()
    {
        return FACES[face] + " of " + SUITS[suit];
    }
}
