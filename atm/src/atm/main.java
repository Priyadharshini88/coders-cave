/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm;

/**
 *
 * @author admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        account ac=new account(100000);//call the account constructor
        atm c=new atm(ac);
        c.run();//call the method in atm class
       
    }
    
}
