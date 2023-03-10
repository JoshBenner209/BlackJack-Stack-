/* Josh Benner
 * CS 145
 * Lab 4
 * Jan 24,2023
 * 
 * This is the main class where the game is played. 
 * the objects and methods are used to play a game of 
 * 21 Player Vs Dealer. 
 * 
 */

import java.util.Scanner;
 
public class BlackJackTest{
    public static void main(String[] args) {
        //create objs and intial conditions
        Scanner scan= new Scanner(System.in);
        boolean play=true;
        Dealer deal= new Dealer();
       System.out.println();
        deal.getRules(); // dealer explain the rules
        System.out.println();
        Player playerOne = new Player(scan);
        boolean win;
         // get rules to the game
        
        //deal out 4 cards alternaing
        for (int i=1;i<=4;i++){
            if (i%2==0){
                playerOne.hit();
            }else{
                deal.hit();
            }
        }
        deal.showCard(); // show dealers 2nd card
        System.out.println(" \n");
        playerOne.faceUp(); //show players cards 
        // player goes first
        do{  
            play=playerOne.getMove(); // this give the player options. until player stands
            
        }while(play); // if player stands play= false
        playerOne.faceUp();
        System.out.println();
        //dealer plays hand last
        boolean dealPlay=true;
        do{
            dealPlay=deal.dealerMove(); //similar to players move
        }while(dealPlay); // once dealer is done dealPlay=false
        System.out.println("dealer sum "+ deal.getSum()); //print out dealers sum
        System.out.println("\n");
        //check to see who wins
        if(deal.getSum()>21 && playerOne.getSum()<21){ //you win
            win=true;
            playerOne.payOut(win);
        }else if (deal.getSum()-playerOne.getSum()>0){ //you lose
            win=false;
            playerOne.payOut(win);
        }else if(playerOne.getSum()>21){ //you lose
            win=false;
            playerOne.payOut(win);
            System.out.println("Bust!");
        }else { // you win
            win=true;
            playerOne.payOut(win);
        }      
    }
}