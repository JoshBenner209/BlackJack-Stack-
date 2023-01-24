import java.util.Scanner;
import java.util.InputMismatchException;

public class Player extends BlackJack {
    Scanner scan;
    private double wager;
    public Player(Scanner scan){
       this.scan=scan;  
       System.out.println(); 
       wager=getWager();
    }
    private double getWager() {
        boolean error=false;
        while(error=!error){
            try{System.out.println("how much would you like to wager?");
            wager= scan.nextDouble();
                error=error;
            }catch(InputMismatchException e){
                System.out.println();
                System.out.println("Error Please enter Double value");
                scan.next();
            }
        }
        return wager;
    }
    public void payOut(boolean win){
        double payOut=0.00;
        if (win==true){
            payOut+=wager*1.5;
            System.out.println("You won!: $"+(payOut-wager));
        }else{
            payOut=0.00;
            System.out.println("You lost!: $"+(payOut-wager));
        } 
    }   
    public boolean getMove(){
       boolean play= true;
            System.out.println("Sum: "+sum);
            System.out.println();
            System.out.println(getKeyBindings());
            System.out.println("\n");
            System.out.println("please make your move");
            String move= scan.next();
            scan.nextLine();
            switch(move.toUpperCase()){
                case "SD":
                    play=!play;
                break;
                case "HT":
                   hit();
                   faceUp();
                break;
                case "SR":
                    wager=wager*.5;
                    play=!play;
                break;
                case "DD":
                    hit();
                    wager=wager*2;
                    System.out.println("Sum: "+sum);
                    play=!play;
                break;
                case "ST":
                    //may not get done!!  :(
                break;
                default:
                System.out.println("invalid response try again");
                break;
            }
        return play;
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
    " you'll be dealt two more cards after a second wager is made\n";
    return keyBindings;
    }
    public int gethandSum(){
        int value=0;
        int answer=0;    
        for(int i=0;i<hand.size();i++){
                String read = hand.get(i);
                String subRead= read.substring(0, 3);
                switch(subRead){    
                    case "ACE":
                    faceUp();
                    if(sum!=0){ // if ace is first card dealt skip all this and assign it
                        System.out.println("Sum: "+sum);
                        boolean error=false;
                        while(error=!error){
                            try{System.out.println("Do you want the Ace to be a 1 or 11?");   
                            answer= scan.nextInt();    
                            if(answer!=1|| answer !=11){
                            error=true;
                            }
                            }catch(InputMismatchException e){
                                System.out.println();
                                System.out.println("Error Please enter integer 1 or 11");
                                scan.nextLine();
                            }
                        }
                    }else{
                        if(sum>21||answer ==1){
                            value=1;
                        }else{
                            value=11;
                        } 
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
    

}

