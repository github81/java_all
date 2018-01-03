import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Player {

    int score;
    String name;

    Player(int score, String name) {
        this.score = score;
        this.name = name;
    }
}

class PlayerComparator implements Comparator {

    public int compare(Object o1, Object o2) {

        Player p1 = (Player)o1;
        Player p2 = (Player)o2;

        if (p1.score == p2.score) {
            return p2.name.compareTo(p1.name);
        }
        return p1.score>p2.score?-1:1;
    }
}

public class HRJavaComparator {

    public static void main(String args[]) {

        int score;
        String name;
        String[] player;
        Player new_player;

        Scanner sc = new Scanner(System.in);
        int players = Integer.parseInt(sc.nextLine());
        Player player_list[] = new Player[players];
        for (int i=0; i<players; i++) {
            player = sc.nextLine().split(" ");
            score = Integer.parseInt(player[1]);
            name = player[0];
            new_player = new Player(score,name);
            player_list[i] = new_player;
        }

        Arrays.sort(player_list, new PlayerComparator());

        for (int i=0; i<players; i++) {
            new_player = player_list[i];
            System.out.println(new_player.name + "," + new_player.score);
        }

    }

}
