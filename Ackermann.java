/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ackermann;

/**
 *
 * @author ridhi
 */
public class Ackermann {
static int ack[][]=new int[10][10000000];
static int x;
    /**
     * @param args the command line arguments
     */
    public static int ackerman(int m, int n)
    {
       // System.out.println("In Func :" + m+" "+n);
    if (m == 0)
    {
        ack[m][n]= n+1;
        return n+1;
    }
    else if (n == 0)
    {
        if (ack[m-1][1] !=  0)
            return ack[m-1][1];
        else
        {
            ack [m-1][1] = ackerman (m-1,1);
            return ack [m-1][1];
        }
    }
    else
    {   
        if (ack[m][n-1] != 0)
        {
            x = ack[m][n-1];
            if (ack[m-1][x] != 0)
                return ack[m-1][x];
            else
            {
                ack[m-1][x] = ackerman(m-1,x);
                return ack[m-1][x];
            }
        }
        
        x = ackerman(m,n-1);
        if  (ack[m-1][x] != 0)
            return ack [m-1][x];
        else
        {
            //System.out.println("Here "+m+" "+n+" "+ack[m-1][x]);
            //ack [m-1][x]= ackerman (m-1, x);
            //System.out.println("There "+" "+ack[m-1][x]+" "+m+" "+n);
            return ackerman (m-1, x);
        }
    }   
    }
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println("Answer: "+ i+" "+j+" "+ ackerman(i,j));
            }
        }
    }
    
}
