import java.util.Scanner;

public class BlackJackTest{
    public static void main(String[] args) {
      Scanner scan= new Scanner(System.in);
        boolean play=true;
        Player playerOne = new Player(scan);
        Dealer deal= new Dealer();
        //deal out 4 cards alternaing
        for (int i=1;i<=4;i++){
            if (i%2==0){
            playerOne.hit();
        }else{
            deal.hit();
        }
    }
    deal.showCard();
    System.out.println(" \n");
    playerOne.faceUp();
   
    // show only last card
// player goes first
        do{  play=playerOne.getMove();
        }while(play);
      
//dealer plays hand last
        deal.dealerMove();
        deal.faceUp();
        System.out.println("\n");
        System.out.println("dealer sum "+ deal.getSum());
if(deal.getSum()>21 && playerOne.getSum()<21){
    System.out.println("player Wins");    
    }else if (deal.getSum()-playerOne.getSum()>0){
        System.out.println("you lose!");
    }else if(playerOne.getSum()>21){
        System.out.println("you lose!");
    }else {
        System.out.println("you win");
    }      
}
}