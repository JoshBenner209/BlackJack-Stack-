/*Josh Benner
 * CS 145
 * Lab 4
 * Jan 24 2023
 * 
 * BlackJack class holds the behavior and state of the game that is true 
 * to both the player and the dealer. 
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class BlackJack {
    private static Stack <String> shuffledDeck = new Stack <String>(); //stack to hold the shuffled deck;
    private Cards card= new Cards(); // Card obj to access 4x13 matrix of caards
    protected  int sum; //add up the cards held by dealer and player
    protected boolean stand;// when player stands round is over.
    protected ArrayList<String> hand = new ArrayList<String>();// needed to add the deck of cards here to shuffle deck 
    
    public BlackJack(){
        shuffledDeck=shuffle(); // shuffle the deck each time new game starts
        sum=gethandSum(); //sum of cards in hand
        stand= false; // games is starting so stand is false
    }
  
    //shuffles and stores deck in stack
    public Stack <String> shuffle() {
        ArrayList<String> shuffleArray= new ArrayList<String>();
        for(int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                shuffleArray.add(card.setdeck(i, j)); //adding cards to the "shuffleArray" to be shuffled
            }  
        }
        Collections.shuffle(shuffleArray); // shuffle the new array list
        for (int i=0; i<shuffleArray.size(); i++){
            shuffledDeck.push(shuffleArray.get(i)); // add the cards from shuffled array into stack
        }
        return shuffledDeck;
        }
    // deal another card and store it in an array list
    public  ArrayList<String> hit(){
         hand.add(shuffledDeck.pop());
         sum+=gethandSum(); // card was dealt add up sum of hand
        return hand;
      
    }
    //show your cards
    public void faceUp(){
        System.out.print("Your current Hand: ");
        for (int i = 0; i<hand.size();i++){
        System.out.print(hand.get(i)+", ");
    }  
    System.out.println();     
    }
    // find out how much your hand adds up to. 
    public  int gethandSum(){
    int value=0;
        for(int i=0;i<hand.size();i++){
            String read = hand.get(i);
            String subRead= read.substring(0, 3);
            
            switch(subRead){    
                case "ACE":
                    if(sum>21){
                        value=1;
                    }else{
                        value=11;
                    }   
                break;
                case "TWO":
                    value=2;
                break;
                case "THR":
                    value=3;
                break;
                case "FOU":
                    value=4;
                break;
                case "FIV":
                    value=5;
                break;
                case "SIX":
                    value=6;
                break;
                case "SEV":
                    value=7;
                break;
                case "EIG":
                    value=8;
                break;
                case "NIN":
                    value=9;
                break;
                case "TEN": 
                value=10;
                break;
                case "JAC": 
                value=10;
                break;
                case "QUE": 
                value=10;
                break;
                case "KIN": 
                value=10;
                break;
            default:
            break;
        }
       
        }
        return value;
    }
    // get the sum of cards in hand
    public int getSum(){
        return sum;
    }
// print out the shuffled deck.... cheat!
    public String toString(){
    
        return shuffledDeck.toString(); // change this before submiting. 
    }  
    // how does the program work          
     public void getRules(){
        System.out.println("The rules of the game are as follows:\n"+
        "To start the game you'll be asked to make a wager.\n"+    
        "Next you'll be dealt two cards and so will the dealer.\n"+
        "You will only see the dealers second card.\n\n"+
        "If you are closer to 21 than the dealer, you win!\n"+
        "If you and the dealer tie no money is lost or paid out.\n"+
        "If you go over 21 you automatically lose, because the house always "+
        "wins ;)\nIf you win you will get paid 1.5 time your wager. \n"+
        "Good Luck!!!");
     }               
    }
