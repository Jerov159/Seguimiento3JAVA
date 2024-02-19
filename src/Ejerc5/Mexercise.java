package Ejerc5;
import javax.swing.*;
public class Mexercise {
        public static void main(String[] args) {
            Exerc[] rooms = new Exerc[6];
            rooms[0] = new Exerc(1, 100.0, true, "Guest");
            rooms[1] = new Exerc(2, 200.0, true, "Guest");
            rooms[2] = new Exerc(3, 1200.0, true, "Guest");
            rooms[3] = new Exerc(4, 1100.0, true, "Guest");
            rooms[4] = new Exerc(5, 1600.0, true, "Guest");

            // Printing initial room details
            for (Exerc room : rooms) {
                if (room != null) {
                    JOptionPane.showMessageDialog(null, room.getDetails());
                }
            }

            // Modifying the price and availability of room 3
            if (rooms[2] != null) {
                rooms[2].setPricePerNight(1500.0);
                rooms[2].setAvailability(false);
            }

            // Printing room details after modification
            for (Exerc room : rooms) {
                if (room != null) {
                    JOptionPane.showMessageDialog(null, room.getDetails());
                }
            }
        }
    }

