//Guesser will guess the number
//umpire will call the guesser for guessing the no.
//If guess is 5 it will be given to umpire mem.
//Then umpire will ask Player 1 to guess the no., same with Player 2 and Player 3 all will be stored in ump mem.
//If all the Players guesses no. doesn't matched the guesser no. then all have lost the game. Please try again.
//Next time again guess and say Player 2 guessed it right then Player 1 wins.

//Enhancements:
//Guesser should guess the number from (1-10)
//Players should also guess the number from (1-10)
//If 2 or more Players won the game then move to semi-final and the final

import java.util.Scanner;

class Guesser{

    int guessNumber;

    int guessNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.print("\nGuesser please guess a number in the range from (1 - 10): ");
        guessNumber = sc.nextInt();
        int result=0;

        if(guessNumber >= 1 && guessNumber <= 10)
            result = guessNumber;
        else{
            System.out.println("Please! guess a number in the range from (1 - 10)");
            System.exit(0);
        }

        return result;
    }

}

class Players{

    int guessNumber;

    int guessNumber(String Playing){

        Scanner sc = new Scanner(System.in);
        System.out.print("\n"+Playing + " please guess a number: ");
        guessNumber = sc.nextInt();

        int result=0;

        if(guessNumber >= 1 && guessNumber <= 10)
            result = guessNumber;
        else{
            System.out.println("Please! guess a number in the range from (1 - 10)");
            System.exit(0);
        }

        return result;
    }

}


class Umpire{

    int GuessedNoFromGuesser;
    int GuessedNoFromPlayer1;
    int GuessedNoFromPlayer2;
    int GuessedNoFromPlayer3;

    void collectNumberFromGuesser() {

        Guesser g = new Guesser();
        GuessedNoFromGuesser = g.guessNumber();
        System.out.println("The Guessed number is: "+GuessedNoFromGuesser);
    }

    void collectNumberFromPlayers(){

        //Player 1
        Players p1 = new Players();
        GuessedNoFromPlayer1 = p1.guessNumber("Player 1");

        //Player 2
        Players p2 = new Players();
        GuessedNoFromPlayer2 = p2.guessNumber("Player 2");

        //Player 3
        Players p3 = new Players();
        GuessedNoFromPlayer3 = p3.guessNumber("Player 3");

    }

    void compare(){

        //For player 1 2 times repetition
        int count=0;

        Players p = new Players();

        if(GuessedNoFromGuesser == GuessedNoFromPlayer1) {

            if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {

                count++;
                System.out.println("\nAll Players, won the guesser game!");

                System.out.println("Moving to Semi-final");
                //Moving to Semi-final
                GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                GuessedNoFromPlayer2 = p.guessNumber("Player 2");
                GuessedNoFromPlayer3 = p.guessNumber("Player 3");

                //Again checking for Semi-Final
                if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {

                    if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nAll Players, won the guesser game!");
                        System.out.println("What, a coincidence again all players won!");
                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                        System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                        System.out.println("Moving to Final");
                        //Moving to Final
                        GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                        GuessedNoFromPlayer2 = p.guessNumber("Player 2");

                        if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                            System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                            System.out.println("What, a coincidence again player 1 and player 2 won!");

                        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                            System.out.println("\nPlayer 1 won the guesser game!");
                        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                            System.out.println("\nPlayer 2 won the guesser game!");
                        }

                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                        System.out.println("Moving to Final");
                        //Moving to Final
                        GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                        GuessedNoFromPlayer3 = p.guessNumber("Player 3");

                        if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                            System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                            System.out.println("What, a coincidence again player 1 and player 3 won!");

                        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                            System.out.println("\nPlayer 1 won the guesser game!");
                        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                            System.out.println("\nPlayer 3 won the guesser game!");
                        }
                    } else {
                        System.out.println("None of the Players won.");
                    }
                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {

                    System.out.println("\nPlayer 2 and Player 3 won the guesser game!");

                    //Final
                    System.out.println("Moving to Final");
                    //Moving to Final
                    GuessedNoFromPlayer2 = p.guessNumber("Player 2");
                    GuessedNoFromPlayer3 = p.guessNumber("Player 3");

                    if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nPlayer 2 and Player 3 won the guesser game!");
                        System.out.println("What, a coincidence again player 2 and player 3 won!");

                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                        System.out.println("\nPlayer 2 won the guesser game!");
                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nPlayer 3 won the guesser game!");
                    }
                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                    System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                    System.out.println("Moving to Final");
                    //Moving to Final
                    GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                    GuessedNoFromPlayer2 = p.guessNumber("Player 2");

                    if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                        System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                        System.out.println("What, a coincidence again player 1 and player 2 won!");

                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                        System.out.println("\nPlayer 1 won the guesser game!");
                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                        System.out.println("\nPlayer 2 won the guesser game!");
                    }

                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                    System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                    System.out.println("Moving to Final");
                    //Moving to Final
                    GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                    GuessedNoFromPlayer3 = p.guessNumber("Player 3");

                    if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                        System.out.println("What, a coincidence again player 1 and player 3 won!");

                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                        System.out.println("\nPlayer 1 won the guesser game!");
                    } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                        System.out.println("\nPlayer 3 won the guesser game!");
                    }
                } else {
                    System.out.println("None of the Players won.");
                }

            } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {

                count++;
                System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                System.out.println("Moving to Final");
                //Moving to Final
                GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                GuessedNoFromPlayer2 = p.guessNumber("Player 2");

                if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                    System.out.println("\nPlayer 1 and Player 2 won the guesser game!");
                    System.out.println("What, a coincidence again player 1 and player 2 won!");

                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                    System.out.println("\nPlayer 1 won the guesser game!");
                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                    System.out.println("\nPlayer 2 won the guesser game!");
                }else {
                    System.out.println("\nNone of the Players won.");
                }

            } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {

                count++;
                System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                System.out.println("Moving to Final");
                //Moving to Final
                GuessedNoFromPlayer1 = p.guessNumber("Player 1");
                GuessedNoFromPlayer3 = p.guessNumber("Player 3");

                if (GuessedNoFromGuesser == GuessedNoFromPlayer1 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                    System.out.println("\nPlayer 1 and Player 3 won the guesser game!");
                    System.out.println("What, a coincidence again player 1 and player 3 won!");

                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer1) {
                    System.out.println("\nPlayer 1 won the guesser game!");
                } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                    System.out.println("\nPlayer 3 won the guesser game!");
                }else {
                    System.out.println("\nNone of the Players won.");
                }
            }

            if(GuessedNoFromGuesser == GuessedNoFromPlayer1 && count==0)
                System.out.println("Player 1 won the guesser game!");

        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {

            System.out.println("\nPlayer 2 and Player 3 won the guesser game!");

            //Final
            System.out.println("Moving to Final");
            //Moving to Final
            GuessedNoFromPlayer2 = p.guessNumber("Player 2");
            GuessedNoFromPlayer3 = p.guessNumber("Player 3");

            if (GuessedNoFromGuesser == GuessedNoFromPlayer2 && GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                System.out.println("\nPlayer 2 and Player 3 won the guesser game!");
                System.out.println("What, a coincidence again player 2 and player 3 won!");

            } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
                System.out.println("\nPlayer 2 won the guesser game!");
            } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
                System.out.println("\nPlayer 3 won the guesser game!");
            }
        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer2) {
            System.out.println("\nPlayer 2 won the guesser game!");
        } else if (GuessedNoFromGuesser == GuessedNoFromPlayer3) {
            System.out.println("\nPlayer 3 won the guesser game!");
        }else {
            System.out.println("None of the players won.");
        }

    }

}


public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("Welcome! To The Guesser Game Tournament");


        //Calling the Umpire for executing operations
        Umpire u = new Umpire();
        u.collectNumberFromGuesser();
        u.collectNumberFromPlayers();
        u.compare();

    }
}