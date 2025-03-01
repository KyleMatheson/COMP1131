/*********************************************************************************************************************
 Die.java

 Kyle Matheson T00153296
 COMP1131 Assignment 4 Question 2
 This class contains two constructors:
    1. A constructor with no parameters that creates a default 6-sided die.

     2. A constructor with one parameter that indicates how many faces the die is to have and
     checks that it is one of the permitted values, otherwise default to a 6-sided die.

 Service methods:
    1. Die() create a Die obj with the passed parameters

    2. roll() method rolls a die with the instantiated number of sides and stores the value.

    3. setFaceValue(int) setter method for setting a value

    4. getFaceValue():int getter method to retrieve current die value.

    5. getDieFaces(): int getter method to retrieve number of faces the die was instantiated with

    6. getDieFacesStringValues: Str getter method to retrieve the number of faces the die was instanntiated with

    7. toString(): Str getter for the numerical and teextual number

*********************************************************************************************************************/


public class Die
{
    private int faceValue;
    private int faces;
    private final String[] STRINGNUMBERARRAY = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
                                        "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                                        "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};

    public Die()
    {
        this.faces = 6;

        faceValue = 1;

    }

    public Die(int faces)
    {
        switch(faces)
        {
            case 4: case 8: case 6: case 10: case 12: case 20:  // check valid number of sides.
            {
                this.faces = faces;
                break;
            }
            default:  // default to 6 sided die
            {
                this.faces = 6;
            }
        }

        faceValue = 1;  //default to a valid roll

    }

    public int roll()
    {
        faceValue = (int) (Math.random() * faces +1);
        return faceValue;
    }

    public void setFaceValue(int value)
    {
        if (value > 0 && value <= faces)
        {
            faceValue = value;
        }
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    public int getDieFaces()
    {
        return faces;
    }

    public String getDieFacesStr()
    {
        return STRINGNUMBERARRAY[faces];  // return the text value of the string array
    }

    public String toString()
    {
        return getDieFacesStr() + " : " + faces;
    }
}
