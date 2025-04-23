public class PracticaLab {

    public static void main(String[] args) {
        Player player1 = new Player("Mikel", 0);
        Player player2 = new Player("Mathias",  0);
        ScoreBoard newScore = new ScoreBoard(player1, player2);
        playGame(new PingPongGame(player1, player2, newScore));
    }

    public static void playGame(Game game){
        game.play();
    }
}
