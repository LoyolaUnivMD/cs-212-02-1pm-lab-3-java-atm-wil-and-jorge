// Programmers:  [wil and jorge]
// Course:  CS 212
// Due Date: feb 11, 2024
// Lab Assignment: make an atm
// Problem Statement: how can we make an atm and give user options on what to do with their balance
// Data In: their name and the option they want to perform
// Data Out: their balance
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

//impport scanner for input
import java.util.Scanner;

class Lab3 {
    public static void main(String[] args) {
        //creaate balance
        double balance = 212.90;
        //take input for user name
        Scanner input = new Scanner(System.in);
       System.out.print("What is your name?: ");
       String name = input.nextLine();

       System.out.println("Welcome "+name+" please select an option: ");
       String choice = "g";
       //checks to make sure they dont want to leave and keeps asking until they want to leave
       while(!choice.equals("l")) {
           //takes user option
           System.out.println("D eposit\nW ithdraw\nC heck Balance\nL eave");
           choice = input.nextLine();
           choice = choice.toLowerCase();
            //if user chooses deposit
           if (choice.equals("d")) {
               System.out.print("How much do you want to deposit?: ");
               double dep = input.nextDouble();
               //error checks to make sure they dont deposit a negative number
               while(dep <= 0){
                   System.out.print("How much do you want to deposit?: ");
                   dep = input.nextDouble();
               }
               String test = input.nextLine();
               balance += dep;
           }
           //if user chooses withdraw
           else if (choice.equals("w")) {
               System.out.print("How much do you want to withdraw?: ");
               double wd = input.nextDouble();
               //error checks to make sure they dont withdraw more than they have
               while(wd > balance){
                   System.out.print("How much do you want to withdraw?: ");
                   wd = input.nextDouble();
               }
               String test = input.nextLine();
               balance -= wd;
           }
           //if they want to check their balance
           else if (choice.equals("c")) {
               //rounds balnce to nearest hundreth
               balance = (int) (balance*100)/100.0;
               //outputs balance
               System.out.println("Your balance is "+balance);
           }
           choice = "g";
       }
        System.out.println("Thank you for using our ATM have a nice day!");
    }
}
