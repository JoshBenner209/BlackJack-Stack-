/* Josh Benner
 *Jan 24 2023
 * CS 145
 * Lab 4
 * 
 * Dealer calss holds all behaviors and states of the dealer
 * throughout the game. Note Ran out of time to add the dealers option
 * to play a "soft 17" .This  behavior would make the dealer's odd's of 
 * winning much greater 
*/

public class Dealer extends BlackJack{
private boolean play;// is the dealers turn up?

public Dealer(){
    play=true; // start with play true 
}
//The dealer continues to draw cards until reaches a value equal to 
// or less than 17. 
    public boolean dealerMove(){
        if(sum<17){
            hit();
           play=true;
        }else{
            play=false;
            faceUp();
        }
        return play;
    }
    // use this when only want to show last card, not both cards
    public void showCard(){

            System.out.print("Delears Second Card: "+ hand.get(hand.size()-1));
            System.out.println();
        }
    //override to say Dealer's hand
        public void faceUp(){
        System.out.print("Dealer's hand: ");
        for (int i = 0; i<hand.size();i++){
            System.out.print(hand.get(i)+", ");
        }
        System.out.println(); 
    }
}
