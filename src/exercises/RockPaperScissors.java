package exercises;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        System.out.println("Let's play 'Rock, Paper, Scissors!' Make your selection by typing 'r', 'p' or 's'.");
        Scanner input = new Scanner(System.in);
        String playerInput = (input.nextLine()).toLowerCase();
        String userPlay = getPlayerChoice(playerInput);
        System.out.println("You played: " + userPlay);

        Random number = new Random();
        int random = number.nextInt(3);
        String computerPlay = getComputerChoice(random);
        System.out.println("Computer played: " + computerPlay);

        getWinner(userPlay, computerPlay);

    }

    public static String getPlayerChoice(String playerInput) {
        String player = "";
        if (playerInput.equals("r")) {
            player = "rock";
        } else if (playerInput.equals("p")) {
            player = "paper";
        } else if (playerInput.equals("s")) {
            player = "scissors";
        } else {
            System.out.println("Invalid choice. Please choose again.");
            Scanner newPlayer = new Scanner(System.in);
            String newPlayerChoice = (newPlayer.nextLine()).toLowerCase();
            player = getPlayerChoice(newPlayerChoice);
        } return player;
    }

    public static String getComputerChoice(int random) {
        String computer = "";
        if (random == 0) {
            computer = "rock";
        } else if (random == 1) {
            computer = "paper";
        } else if (random == 2) {
            computer = "scissors";
        } return computer;
    }

    public static void getWinner(String userPlay, String computerPlay) {
        if (userPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (userPlay.equals("rock") && computerPlay.equals("paper")) {
            System.out.println("Paper beats rock! Computer wins!");
        } else if (userPlay.equals("rock") && computerPlay.equals("scissors")) {
            System.out.println("Rock beats scissors! You win!");
        } else if (userPlay.equals("paper") && computerPlay.equals("rock")) {
            System.out.println("Paper beats rock! You win!");
        } else if (userPlay.equals("paper") && computerPlay.equals("scissors")) {
            System.out.println("Scissors beats paper! Computer wins!");
        } else if (userPlay.equals("scissors") && computerPlay.equals("rock")) {
            System.out.println("Rock beats scissors! Computer wins!");
        } else if (userPlay.equals("scissors") && computerPlay.equals("paper")) {
            System.out.println("Scissors beats paper! You win!");
        }
    }

}
