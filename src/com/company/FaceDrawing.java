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
    public void fill (String str)
    {
        for(int i = 0; i < fFeatures.length; i++)
        {
            for(int n = 0; i < fFeatures[i].length; n++)
            {
                fFeatures[i][n] = str;
            }
        }
    }

    //Returns a String representing the face concatenated together row by row
    //with new line characters between each row
    public String toStringz()
    {
        String str = ".";
        for(int i = 0; i < fFeatures.length; i++)
        {
            for(int n = 0; i < fFeatures[i].length; n++)
            {
                str+= fFeatures[i][n];
            }
            str+='\n';
        }
        return str;
    }
}
