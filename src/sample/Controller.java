package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.util.Random;

public class Controller {
    private Image image;
    private static final String BATTING = "BATTING";
    private static final String BOWLING = "BOWLING";
    private static final int one = 1;
    private static final int two = 2;
    private static final int three = 3;
    private static final int four = 4;
    private static final int five = 5;
    private static final int six = 6;

    int[] arr = new int[2];
    int play;

    private String player, computer;
    private int target = 0, score = 0, innings = 1;


    @FXML
    private Button onebtn;

    @FXML
    private Button twobtn;

    @FXML
    private Button threebtn;

    @FXML
    private Button fourbtn;

    @FXML
    private Button fivebtn;

    @FXML
    private Button sixbtn;

    @FXML
    private Label target_id;

    @FXML
    private Label score_id;
    
    @FXML
    private Label choice;
    
    @FXML
    private ImageView computer_id;

    @FXML
    private Button battingbtn;

    @FXML
    private Button bowlingbtn;

    @FXML
    private ImageView player_id;

    @FXML
    private Label result;
    
    @FXML
    private Label result2;

    
    @FXML
    private void choice(ActionEvent event) {

        switch (((Button) event.getSource()).getId()) {
            case "battingbtn":
            	choice.setText("You choose batting ");

                player = BATTING;
                computer = BOWLING;
                break;

            case "bowlingbtn":
            	choice.setText("You choose bowling ");

                player = BOWLING;
                computer = BATTING;
                break;

        }

    }

    @FXML
    private void playBall(ActionEvent event) {
        switch (((Button) event.getSource()).getId()) {
            case "onebtn":
                image = new Image("/images/one.png");
                play = one;
                break;
            case "twobtn":
                image = new Image("/images/two.jpg");
                play = two;
                break;
            case "threebtn":
                image = new Image("/images/three.png");
                play = three;
                break;
            case "fourbtn":
                image = new Image("/images/four.jpg");
                play = four;
                break;
            case "fivebtn":
                image = new Image("/images/five.jpg");
                play = five;
                break;
            case "sixbtn":
                image = new Image("/images/six.jpg");
                play = six;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + ((Button) event.getSource()).getId());
        }
        player_id.setImage(image);
        computerPlay();

    }

    public void computerPlay() {
        int comp = new Random().nextInt(6) + 1;
        switch (comp)
        {
            case 1:
                image = new Image("/images/one.png");
                comp=one;
                break;
            case 2:
            image = new Image("/images/two.jpg");
            comp = two;
            break;
            case 3:
                image = new Image("/images/three.png");
                comp = three;
                break;
            case 4:
                image = new Image("/images/four.jpg");
                comp = four;
                break;
            case 5:
                image = new Image("/images/five.jpg");
                comp = five;
                break;
            case 6:
                image = new Image("/images/six.jpg");
                comp = six;
                break;

        }computer_id.setImage(image);
        
        System.out.println("\nYour play: " + play + "\nComputer's play: " + comp);
        if (play == comp) {
            if (player.equals(BATTING)) {
                result.setText("You are out");
                result2.setText("Computer is batting");
                if (innings == 1) {
                    player = BOWLING;
                    computer = BATTING;
                    target = score + 1;
                    score = 0;
                    innings++;
                    target_id.setText(""+target);
                	choice.setText("You are bowling  ");


                } else this.exit();
            } else {
                result.setText("Computer is out");
                result2.setText("You are batting");

                if (innings == 1) {
                    player = BATTING;
                    computer = BOWLING;
                    target = score + 1;
                    score = 0;
                    innings++;
                    target_id.setText(" "+target);
                	choice.setText("You are batting ");
                } else this.exit();
            }
        } else {
            if (player.equals(BATTING)) {
                arr[0] = arr[1];
                arr[1] = play;
                score += play;
                score_id.setText(""+ score);

            } else score += comp;
            score_id.setText(" "+ score);

        }
        if (score > target && innings == 2) this.exit();
    }


    private void exit(){
        if (player.equals(BATTING)) {
            if (score < target) {
  
                result.setText("You Lost!"); 
                choice.setText("");
                result2.setText("");
            }

            else if (score > target) {
            	result.setText("You Won!");
                choice.setText("");
                result2.setText("");
            }

            else {
            	result.setText("It's a Tie");
                choice.setText("");
                result2.setText("");
            }

        } else {
            if (score > target) {
            	result.setText("You Lost!");
                choice.setText("");
                result2.setText("");
            }
            else if (score < target)  
            	{result.setText("You Won!");
                choice.setText("");
                result2.setText("");}
            else 
                   {result.setText("It's a Tie");
                   choice.setText("");
                   result2.setText("");}
        }


    }
}
