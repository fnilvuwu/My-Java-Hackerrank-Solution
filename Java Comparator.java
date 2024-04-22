import java.util.*;

class Checker implements Comparator<Player> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Player player1, Player player2)
    {
        // Comparing customers
        int NameCompare = player1.name.compareTo(
            player2.name);
 
        int ScoreCompare = player2.score - player1.score;
 
        // 2nd level comparison
        return (player2.score == player1.score) ? NameCompare
                                  : ScoreCompare;
                                  
    }
}
 

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}