public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("tim",500);
        calculateScore(75);
        calculateScore();
        System.out.println("new score is " + newScore);
    }

    public static int calculateScore(String playerName,int score) {
        System.out.println("player " + playerName + " score " + score + " points ");
        return score*1000;

    }
    public static int calculateScore() {
        System.out.println("player "+ " points ");
        return 0;

    }

    public static int calculateScore(int score) {

        System.out.println("player " +  " score " + score + " points ");
        return score*1000;

    }


}