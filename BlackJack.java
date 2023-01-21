import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
public class BlackJack {
    private Stack <String> shuffledDeck = new Stack <String>();
    private Cards card= new Cards(); 
    //private boolean stand;
    private int sum;
    private ArrayList<String> hand = new ArrayList<String>();
    
    
    public BlackJack(){
        this.shuffledDeck=shuffle();
        // start with two cards in hand
        sum= gethandSum();
        for(int i=0;i<2;i++){   
        hand=hit();
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
            this.shuffledDeck.push(shuffleArray.get(i));
        }
        return this.shuffledDeck;
        }
    // deal another card
    public ArrayList<String> hit(){
         this.hand.add(shuffledDeck.pop());
        return hand;
      
        //return shuffledDeck.pop();
    }
    public String faceUp(){
    return hand.toString();        
    }
    public int gethandSum(){
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
       sum+=value;
        }
        return sum;
    }

    public String toString(){
    
        return shuffledDeck.toString(); // change this before submiting. 
    }            
                    
    }
