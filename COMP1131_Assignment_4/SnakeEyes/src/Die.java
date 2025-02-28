/*********************************************************************************************************************
 Die.java

 Kyle Matheson T00153296
 COMP1131 Assignment 4 Question 2
 A constructor with no parameters that creates a default 6-sided die.

 A constructor with one parameter that indicates how many faces the die is to have.
 Check that it is one of the permitted values, otherwise default to a 6-sided die.

 The roll() method given needs to be modified to work within the number of faces established by the constructors.

 The setFaceValue() method needs to have logic added to ensure the new incoming face value is within the allowable limits
 for the number of faces.

 A second get_ method that retrieves the textual name of the current face value, such as One, Two, Three, etc.
 Note that a single method is expected that will work with any of the five regular dice.

 The toString() method should return both the numeric value and textual name for the current face value in a form like “1 : One”.

 For your design, create a UML Class diagram similar to Figure 5.5 on page 180 of the textbook.
 Note that you need to include the constructors in the methods section.

 *********************************************************************************************************************/


public class Die
{
    private int faceValue;
    private int faces;
    private String[] strNumberArray = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
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

        faceValue = 1;

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

    public int getDiceFaces()
    {
        return faces;
    }

    public String getFacesStringValue()
    {
        return strNumberArray[faces];  // return the text value of the string array
    }

    public String toString()
    {
        return getFacesStringValue() + " : " + Integer.toString(faces);
    }
}
