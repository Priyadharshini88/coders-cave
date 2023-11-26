/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbergame;

/**
 *
 * @author admin
 */
import java.util.*;
import java.io.*;
public class Numbergame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min=1;
        int max=100;
        int maxattempt=10;
        int round=0;
        int score=0;
        boolean playagain=true;
        Scanner s=new Scanner(System.in);
        Random ran=new Random();
        while(playagain){
            int target=ran.nextInt(max-min+1)+min;
            
            System.out.println("\"............YOU ARE IN THE NUMBER GUESSING GAME.............\"");
            System.out.println("I have selected the random numbers between"+min+"to"+max);
            System.out.println("Try to find number within 10 chances.......!!!");
            int attempt=0;
            boolean guess=false;
            while(!guess&&attempt<maxattempt){
                System.out.println("Enter your Guess");
                int n=s.nextInt();
                attempt++;
                if(n<target){
                    System.out.println("Sorry....!Your guess is too low....Please Try again!!");
                    
                }else if(n>target){
                    System.out.println("Sorry....!Your guess is too high....Please Try again!!");
                    
                } else{
                    System.out.println("congrats .....you guessed the correct answer....!");
                    score+=max-attempt+1;
                    guess=true;
                    
                }
            }
            round++;
            System.out.println("Do you want to play again...? (Yes/No)");
            playagain=s.next().equalsIgnoreCase("Yes");
            
            
        }
            System.out.println("Game over.......!! you have played  "+round+"rounds and your score is "+score);
            s.close();
        
    }
    
}
