package com.company;

public class FaceDrawing
{
    private String [][] fFeatures;

    public FaceDrawing(String [][] fFeatures)
    {
        this.fFeatures = fFeatures;
    }

    //Edits one of the strings in the fFeatures array
    public void edit(String replace, int row, int column)
    {
        fFeatures[row][column] = replace;
    }

    //Fills the fFeatures array with a single string
    public void fill(String str)
    {
        for (int i=0;i < fFeatures.length; i++)
        {
            for (int j=0; j < fFeatures[i].length; j++)
            {
                fFeatures[i][j] = str;
            }
        }
    }


    //Returns a String representing the face concatenated together row by row
    //with new line characters between each row
    public String toString()
    {
        String output = "";
        for (int i=0; i < fFeatures.length; i++)
        {
            for (int j=0; j < fFeatures[i].length; j++)
            {
                output += fFeatures[i][j];
            }
            output+= "\n";
        }
        return output;
    }
}


