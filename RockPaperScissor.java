import java.util.*;
public class RockPaperScissor
{
    public static void main(String args[])
    {
        
        RockPaperScissor RpsObj=new RockPaperScissor();
        Scanner pg=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("\t\t**RockPaperScissor**\nEnter\n1 for Rock\n2 for Paper\n3 for Scissors\nor 0 to quit");
        byte x=1;
        byte userS=0;
        byte comS=0;
        while(x<=5)
        {
        int r=3;
        byte input = pg.nextByte();
        int randomNo;
        randomNo=rnd.nextInt(r)+1;
        String inputSt;
        inputSt=RpsObj.inputM(input);
        String randomSt;
        randomSt=RpsObj.randomM(randomNo);
        if(input!=0)
        {
        System.out.println("You: "+inputSt);
        System.out.println("Computer: "+randomSt);
        switch(input)
            {
                
                case 1:
                
                if(randomNo==3)
                userS++;
                else if(randomNo==2)
                comS++;
                else if(randomNo==1)
                continue;
                break;
                
                case 2:
                
                if(randomNo==3)
                comS++;
                else if(randomNo==2)
                continue;
                else if(randomNo==1)
                userS++;
                break;
                
                case 3:
                
                if(randomNo==3)
                continue;
                else if(randomNo==2)
                userS++;
                else if(randomNo==1)
                comS++;
                break;
            } 
           
            System.out.println();
        System.out.println("SCORES:\nYou: "+userS);
        System.out.println("Computer: "+comS);
        System.out.println();       
        }
        else {
            System.out.println("Thanks for playing\nExiting...\nbyee!!!");
        break;
        }
        x++;
        }
        RpsObj.FindWinner(userS, comS);
    } 


public String inputM(byte i)
{
     String a="";
     switch(i) 
        {
            case 1:a="Rock";
            break;
            case 2:a="Paper";
            break;
            case 3:a="Scissors";
            break;
        }
        return a;
}


public String randomM(int r)
{
     String b="";
     switch(r)
        {
            case 1:b="Rock";
            break;
            case 2:b="Paper";
            break;
            case 3:b="Scissors";
            break;
        }
        return b;
}


public void FindWinner(byte u, byte c)
    {
        System.out.println();
        System.out.println("SCORES:\nYou: "+u);
        System.out.println("Computer: "+c);
        System.out.println();
        if(c>u)System.out.println("Computer won :-[");
        else if(c<u)
System.out.println("You won!!\n Congratulations");
    }
    
}