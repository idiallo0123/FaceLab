package com.company;

public class FaceDrawing
{
    private String [][] fFeatures;

    public faceDrawing(fFeatures)
    {
        this.fFeatures = fFeatures;
    }

    void edit(String replace, int row, int column)
    {
        fFeatures[row][column] = replace;
    }

    void fill (String str)
    {
        str = " ";
        for(int i = 0; i < fFeatures.length; i++)
        {
            for(int n = 0; i < fFeatures[i].length; n++)
            {
                fFeatures[i][n] = str;
            }
        }
    }

    String toString()
    {
        for(int i = 0; i < fFeatures.length; i++)
        {
            for(int n = 0; i < fFeatures[i].length; n++)
            {
                System.out.print(fFeatures[i][n]);
            }
        }
    }
}
