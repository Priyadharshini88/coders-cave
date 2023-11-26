/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author admin
 */

import java.util.*;
public class atm {
    private account count;
    private Scanner s=new Scanner(System.in);
    public atm(account acc){
        count=acc;
    }
    public void display(){
        System.out.println("                  Welcom to ATM");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.println("*                                                     *");
        System.out.println("*    Enter 1 - view the Account Balance......         *");
        System.out.println("*    Enter 2 - withdraw the amount...........         *");
        System.out.println("*    Enter 3 - desposit the amount...........         *");
        System.out.println("*    Enter 4 - exit the ATM..................         *");
        System.out.println("*                                                     *"); 
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
    public void run(){
   display();
        int n;
        do{
         
            System.out.println("Enter your choice ");
            n=s.nextInt();
            switch(n){
                case 1:
                    checkbalance();
                    System.out.println();
                    break;
                case 2:
                    withdrawal();
                    System.out.println();
                    break;
                case 3:
                    deposit();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Thanks for using the ATM....!!");
                         
            }
            
            }while(n!=4);
    }
        
    private void checkbalance(){
        System.out.println("Your Account Balance is "+count.getbal());
        
    }
    private void withdrawal(){
        try{
            System.out.println("Enter the amount to Withdrawal");
            double amount=s.nextDouble();
            count.withdrawal(amount);
            
        }
        catch(java.util.InputMismatchException e){
            System.out.println(e);
            s.next();
            
            
        }
        
    }
    
    private void deposit(){
        try{
            System.out.println("Enter the amount to deposit");
            double amount=s.nextDouble();
            count.deposit(amount);
        }catch(java.util.InputMismatchException e){
            System.out.println(e);
            s.next();
            
        }
        
    }
    
    
    
    
    
}
