/**
 * Epstein.
 * 
 * @author Alice Russell
 * @version 06/11/2020
 */
public class Epstein {
    /**
     * Main method.
     * @param args
     */
    public static void main(String[] args) {
        int [][] rooms = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(drawBorder());
        System.out.println(drawRooms(rooms));
        System.out.println(drawBorder());
    }

    /**
     * drawBorder creates game board border.
     * @return String. 
     */
    public static String drawBorder() {
        String border = "+======================+";
        return border;
    }

    /**
     * drawRooms method.
     * @param int[][] rooms
     * @return String.
     */
    public static String drawRooms(int[][] rooms) {
        String result = "";
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                result += rooms[i][j];
            }
        }
        return result; 
    }
}