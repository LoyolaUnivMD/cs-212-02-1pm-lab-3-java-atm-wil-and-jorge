// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;

class Lab3 {
    public static void main(String[] args) {

        double balance = 212.90;
        Scanner input = new Scanner(System.in);
       System.out.print("What is your name?: ");
       String name = input.nextLine();

       System.out.println("Welcome "+name+" please select an option: ");
       String choice = "g";
       //checks to make sure they dont want to leave and keeps asking until they want to leave
       while(!choice.equals("l")) {
           System.out.println("D eposit\nW ithdraw\nC heck Balance\nL eave");
           choice = input.nextLine();
           choice = choice.toLowerCase();

           if (choice.equals("d")) {
               System.out.print("How much do you want to deposit?: ");
               double dep = input.nextDouble();
               while(dep <= 0){
                   System.out.print("How much do you want to deposit?: ");
                   dep = input.nextDouble();
               }
               String test = input.nextLine();
               balance += dep;
           }
           else if (choice.equals("w")) {
               System.out.print("How much do you want to withdraw?: ");
               double wd = input.nextDouble();
               while(wd > balance){
                   System.out.print("How much do you want to withdraw?: ");
                   wd = input.nextDouble();
               }
               String test = input.nextLine();
               balance -= wd;
           }
           else if (choice.equals("c")) {
               balance = (double) (balance*100)/100;
               System.out.println("Your balance is "+balance);
           }
           choice = "g";
       }
        System.out.println("Thank you for using our ATM have a nice day!");
    }
}
