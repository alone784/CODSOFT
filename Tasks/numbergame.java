import java.util.*;
class numbergame
{
    int guesnumber()
    {    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomno = random.nextInt(101);
        System.out.println("I have choosen a number between 0 to 100");
        int attempt = 0;
        int maxattempt = 10;
        while(attempt < maxattempt)
        {
            attempt++;
            System.out.print("GUESS YOUR NUMBER : ");
            int guess = sc.nextInt(); 
            if(guess < randomno)
                System.out.println("too low");
            else if(guess > randomno)
            System.out.println("too high");
            else
            {
            System.out.println("correct! your number is " + guess + ".");
            System.out.println("you have taken " + attempt + " attempts.");
            return attempt;
            }
             }
        System.out.println("sorry you have taken all " + maxattempt + " attempts. The correct number was " + randomno + ".");
        return maxattempt + 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int roundwon = 0;
        int gamesplayed = 0;
        int score = 0;
        do {
            numbergame game = new numbergame();
            gamesplayed++;
            int attemptt  = game.guesnumber();
            if(attemptt <= 10)
            {
                roundwon++;
                
                 int roundScore = 10 + (10 - attemptt); 
                score += roundScore;
                System.out.println("Round won! score for this round is = " + roundScore);
            }
            else
            {
                System.out.println("Round lost");
            }
            System.out.print("Do you want to play again (yes/no) : ");
            s = sc.next();
        } while (s.equalsIgnoreCase("yes"));

        System.out.println("gamesplayed = " + gamesplayed);
        System.out.println("rounds won = " + roundwon);
        System.out.println("score : " + score);
        System.out.println("Thank you for playing.");

    }
}   