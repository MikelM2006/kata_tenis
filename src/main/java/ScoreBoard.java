public class ScoreBoard {
    private Player player1;
    private Player player2;

    //constructor

    public ScoreBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void showScoreBoard(){
        System.out.println("Name: " + this.player1.getName() + " --- Puntaje: " + this.player1.getScore());
        System.out.println("Name: " + this.player2.getName() + " --- Puntaje: " + this.player2.getScore());
    }

}
