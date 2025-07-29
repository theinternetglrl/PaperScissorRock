//@theinternetglrl

import java.util.Scanner;
public class PaperScissorsrock {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to paper scissors rock.");
        System.out.println("Here are the rules:\n- Rock beats scissors\n- Scissors beats paper\n- Paper beats rock");
        
       int wincounter=0,losecounter=0,tiecounter=0,game=1;
        do{
            System.out.print("(1)Rock , (2)Paper , (3)Scissors\nEnter the number of your choice: ");
            int choice=input.nextInt();
            
            if(choice>3||choice<1){
                System.out.println("invalid choice. please choose between(1-3)");
                continue;
            }
            int random=(int)(1+Math.random()*3);
            
            if(choice==random){
                System.out.println("it's a tie!");
                tiecounter++;
            }
            else if((choice==1&&random==3)||(choice==3&&random==2)||(choice==2&&random==1)){
               System.out.println("You win!");
               wincounter++;
            }
            else {
                System.out.println("You lost!");
                losecounter++;
            }
            
            System.out.println("You chose "+switch(choice){
                case 1->"Rock";
                case 2->"Paper";
                case 3->"Scissors";
                default->" ";
            }+" and the computer chose "+switch(random){
                case 1->"Rock";
                case 2->"Paper";
                case 3->"Scissors";
                default->" ";
            });
            
            System.out.println("number of wins: "+wincounter+"\nnumber of losses: "+losecounter+"\nnumber of ties: "+tiecounter);
            
            System.out.println("Enter (1) if you want to continue (0) to Exit");
            game=input.nextInt();
            
        }while(game!=0);
        
        System.out.println("Thank you for playing, hope you enjoyed the game.");
    }
}
