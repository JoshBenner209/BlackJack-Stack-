

/* Dealer class */

public class Dealer extends BlackJack{
private boolean done;

public Dealer(){
    done= false;
}
    public boolean dealerMove(){
        if(sum>=17){
            done=true;
            faceUp();
        }else{
            hit();
            done=false;
        }
        return done;
    }
    public void showCard(){

            System.out.print("Delears Second Card: "+ hand.get(hand.size()-1));
            System.out.println();
        }
    public void faceUp(){
        System.out.print("Dealer's hand: ");
        for (int i = 0; i<hand.size();i++){
            System.out.print(hand.get(i)+", ");
        }
        System.out.println(); 
    }
}
