import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class BlackJack {
    private static Stack <String> shuffledDeck = new Stack <String>();
    private Cards card= new Cards(); 
    private final int BLACKJACK=21;
    protected  int sum;
    protected boolean stand;
    protected ArrayList<String> hand = new ArrayList<String>();
    
    
    public BlackJack(){
        shuffledDeck=shuffle();
        // start with two cards in hand
        sum=gethandSum();
        stand= false;
    }
    public void endRound(){
        if (sum==BLACKJACK){
        System.out.println("blackJack!");
        }
        if (stand==true){
            System.out.print("End Round");
        }
    }
    //shuffles and stores deck in stack
    public Stack <String> shuffle() {
        ArrayList<String> shuffleArray= new ArrayList<String>();
        for(int i=0;i<4;i++){
            for (int j=0;j<13;j++){
                shuffleArray.add(card.setdeck(i, j)); 
            }  
        }
        Collections.shuffle(shuffleArray);
        for (int i=0; i<shuffleArray.size(); i++){
            shuffledDeck.push(shuffleArray.get(i));
        }
        return shuffledDeck;
        }
    // deal another card
    public  ArrayList<String> hit(){
         hand.add(shuffledDeck.pop());
         sum+=gethandSum();
        return hand;
      
        //return shuffledDeck.pop();
    }
    public void faceUp(){
        System.out.print("Your current Hand: ");
        for (int i = 0; i<hand.size();i++){
        System.out.print(hand.get(i)+", ");
    }  
    System.out.println();     
    }
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
    public int getSum(){
        return sum;
    }

    public String toString(){
    
        return shuffledDeck.toString(); // change this before submiting. 
    }            
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
