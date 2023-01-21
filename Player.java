public class Player extends BlackJack {
    //private int wager;
  
    
    public Player(){
       

    }
    //going to paste the players key bindings here for now until i figure out how im going to do all these classes:
    public String getKeyBindings(){
        String keyBindings="Here is some basic terminology and key bindings so you can play:\n"+
    "-Type SD for stand: don't give me any cards \n"+
    "-Type HT for Hit: Give me another card.\n"+
    "-Type SR to Surrender: reuslts in losing 1/2 wager and end of round\n"+
    "-Type DD to Double Down: can only double down if you need another card and\n"+
    " results in 2x wager and automatic stand after play is made. \n"+
    "-Type ST to split hand: if the two card are of equal value then you can choose\n"+ 
    " to treate the two cards as the 1st cards of a new hand  and\n "+
    " you'll be dealt two more cards after a second wager is made";
    return keyBindings;
    }
//public int getWager(int wager){
    //return wager;
//}

}

