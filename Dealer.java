import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/* Dealer class */

public class Dealer extends BlackJack{
    private Stack <String> shuffledDeck = new Stack <String>();
    private Cards card= new Cards(); 
    
    public Dealer(){
        this.shuffledDeck=shuffle();
        ;
    }
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
    
    public String hit(){
        return shuffledDeck.pop();

    }

        public String toString(){
    
        return shuffledDeck.toString(); // change this before submiting. 

    }            
                    
    }

                





