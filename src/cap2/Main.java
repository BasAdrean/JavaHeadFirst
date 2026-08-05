package cap2;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public void main(String[] args){

                //GuessGame
        /*guessGame player = new guessGame();
        player.startGame();*/


                //BE A COMPILER
        /*streamingSong song = new streamingSong();
        song.artist = "AURORA";
        song.title = "Runaway";
        song.play();
        song.printDetails();

        episode ep = new episode();
        ep.seriesName = "Black mirrow";
        ep.episodeNumber = 4;
        ep.skipToNext();
        ep.skipIntro();
        ep.play();*/

    }}
class Player{
    int number;
    public void guess(){
        Scanner ab = new Scanner(System.in);
        System.out.println("fala seu número, parceiro");
        number = ab.nextInt();
    }
}

class guessGame{
    public void startGame(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        boolean p1isRigth = false;
        boolean p2isRigth = false;
        boolean p3isRigth = false;

        while(true){

            int targetNumber = (int)(Math.random()*10);

            System.out.println("Starting the GuessGame place your bets");
            p1.guess();
            guessp1 = p1.number;
            p2.guess();
            guessp2 = p2.number;
            p3.guess();
            guessp3 = p3.number;
            IO.println();
            System.out.println("The number select in this round are " + targetNumber);
            if(guessp1 == targetNumber){
                p1isRigth = true;
            }
            if(guessp2 == targetNumber){
                p2isRigth = true;
            }
            if(guessp3 == targetNumber){
                p3isRigth = true;
            }
            if(p1isRigth || p2isRigth|| p3isRigth){
                System.out.println("We have a champion!!");
                System.out.println("Player One is " + p1isRigth);
                System.out.println("Player Two is " + p2isRigth);
                System.out.println("Player Three is " + p3isRigth);
                System.out.println("Game is over.");
                break;
            }else{System.out.println("Nobody Player is rigth. New round now");targetNumber =0;}

        }


    }

}

class streamingSong{
    String title;
    String artist;
    int duration = (int)(Math.random()*13);
    void play(){
        System.out.println("Playing song");
    }
    void printDetails(){
        System.out.println("This is " + title + " by " + artist + " duration is " + duration + "minutes");
    }
}

class episode{
    String seriesName;
    int episodeNumber;
    void skipIntro(){
        System.out.println("Skipping intro...");
    }
    void skipToNext(){
        System.out.println("Loading episode " + episodeNumber);
    }
    void play(){
        System.out.println("Playing episode " + episodeNumber + " from the serie " + seriesName);
    }
}