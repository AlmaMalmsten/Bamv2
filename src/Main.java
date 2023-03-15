import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Creat your monster!");
        System.out.println("What is his name? ");
        String monsterName = scanner.nextLine();
        Monster myMonster = new Monster(monsterName);
        System.out.println("What is your name? ");
        String playerName = scanner.nextLine();
        System.out.println("How much hp do you want? ");
        int playerHp = scanner.nextInt();
        Player myPlayer = new Player(playerName, playerHp);

        //Paint
        JFrame frame = new JFrame("draw health bars");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel myPanel = new MyPanel();
        frame.getContentPane().add(myPanel);
        frame.pack();
        frame.setVisible(true);

        while (myMonster.getHp() != 0 && myPlayer.getHp() != 0){

        }
    }
}