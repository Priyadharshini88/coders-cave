/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

/**
 *
 * @author admin
 */
public class account {
    private double accbalance;
    account(double initialbal){
        accbalance=initialbal;
        
    }
    public double getbal(){
        return accbalance;
    }
    public void withdrawal(double a){
        if(a>0&&a<accbalance){
            accbalance-=a;
            System.out.println("Now your Account balance after withdrawal is "+accbalance);
        }
        else if(a>accbalance){
            System.out.println("insufficient balance......Try another amount");
        }else{
             System.out.println("withdrawal failed!!!......Please try again.");
      
        }
        
    }
    public void deposit(double cur){
        if(cur>accbalance){
            accbalance+=cur;
            System.out.println("The Account balance after deposited the amount is "+accbalance);
        }else{
            System.out.println("Sorry.........Please try another amount");
        }
    }
    
}
