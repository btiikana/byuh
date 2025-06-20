import javax.swing.*;
import java.awt.*;

public class Switch {

    //fields
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    public Switch() {
        int ranking;
        int price;
        // this is if statement
        // if (ranking == FRESHMAN) {
        //     price = 1;
        // } else if (ranking == SOPHOMORE) {
        //     price = 3;
        // } else if (ranking == JUNIOR) {
        //     price = 5;
        // } else {
        //     price = 10;
        // }


        //this is switch statement
        // switch (ranking) {
        //     case FRESHMAN:
        //         price = 1;
        //         break;
        //     case SOPHOMORE:
        //         price = 3;
        //         break;
        //     case JUNIOR:
        //         price = 5;
        //         break;
        //     case SENIOR:
        //         price = 10;
        //         break;
        //     default:
        //         price = 10;
        //         break; //you don't need this always but it's safe.
        // }


        //this is switch expression
        price = switch (ranking) {
            case FRESHMAN -> 1;
            case SOPHOMORE -> 3;
            case JUNIOR -> 5;
            default -> 10;
        };
    }

    //methods

    //main method
    public static void main(String[] args) {

    }
}
