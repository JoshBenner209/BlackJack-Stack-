/* Josh Benne
 * CS 145
 * Jan 19 2023
 * lab 4: Card Class
 * 
 * This class builds a single deck at a time. it Stores the deck in the
 * same configuration each time and is only a 52 card deck. The deck is stored 
 * in a 4x13 matrix. to see how the deck is layed out use the toString() method 
 * get a print out of the matrix.  
 */



import java.util.Arrays;

public class Cards{

    private String[][] deck = new String[4][13];
// construct a single deck of cards
    public Cards(){
        this.deck=deck();
    }
// this builds the deck of cards and stores it in a 4x13 matrix
//rows(i)= suits coloumn(j) = rank
// colomn zero is Ace coloumn 1 is Two....coloumn 12 is King
    public String[][] deck(){
            for(int i=0;i<4;i++){
                for (int j=0;j<13;j++){
                    this.deck[i][j]=setdeck(i,j);
                }
            }
        return this.deck;
    }
    // this determines what the card is based on position in matrix
    // i is the row and j is the coloumn
    public String setdeck(int i, int j){ 
        String[] ranks= {"ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
        String rank,suit,card=" ";
        switch(j){
        //ace + suits
        case 0: 
            rank=ranks[0];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Two's + suits
        case 1: 
            rank=ranks[1];
            suit= getSuit(i);
           card=rank+" OF "+suit+"'S ";
        break;
        //Threes + suits    
        case 2: 
            rank=ranks[2];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Fours +suits
        case 3: 
            rank=ranks[3];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Fives + Suits
        case 4: 
            rank=ranks[4];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Six Plus Suits
        case 5: 
            rank=ranks[5];
            suit= getSuit(i);
            card=rank;
        break;
        //Seven + suit
        case 6: 
            rank=ranks[6];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        // Eight + suits
        case 7: 
        rank=ranks[7];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //nine plus suits
        case 8: 
            rank=ranks[8];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //ten + suits
        case 9: 
            rank=ranks[9];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Jack + suits
        case 10:
            rank=ranks[10];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //Quenn plus Suits
        case 11:
            rank=ranks[11];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        //King + suits
        case 12:
            rank=ranks[12];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        case 13:
            rank=ranks[13];
            suit= getSuit(i);
            card=rank+" OF "+suit+"'S ";
        break;
        default:
        break;
        }
        return card;
    }
    // this gets passed the row number to determine what suit for each 
    //coulumn  Suit 0= Club , Suit 1 = Heart, Suit 2= Spade suit 3 = Diamond
    public String getSuit(int i){
        String [] suits={"CLUB","HEART","SPADE","DIAMOND"};
        String suit;
        if (i==0){
            suit =suits[0];
        }else if(i==1){
            suit=suits[1];
        }else if(i==2){
            suit=suits[2];
        }else{
            suit=suits[3];
        }
        return suit;
    }
    //the extra arrays made the print out cleaner than one big matrix 
    public String toString() {
        return Arrays.deepToString(deck);
    }
   
}
