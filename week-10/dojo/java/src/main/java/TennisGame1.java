
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1"))
            player1Score += 1;
        else
            player2Score += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore;
        if (scoresAreEqual()) {
            if (player1Score == 3 || player1Score == 4) {
                score = "Deuce";
            } else {
                score += scoreToString(player1Score);
                score += "-All";
            }
        }
        else if (anyScoreBiggerThan4()) {
            int difference = player1Score - player2Score;
            if (difference == 1) {
                score = "Advantage player1";
            } else if (difference == -1) {
                score = "Advantage player2";
            } else if (difference >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            score = scoreToString(player1Score) + "-" + scoreToString(player2Score);
        }
        return score;
    }

    private String scoreToString(int playerScore) {
        String score = "";
        switch (playerScore) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
        }
        return score;
    }

    private boolean scoresAreEqual() {
        return player1Score == player2Score;
    }

    private boolean anyScoreBiggerThan4() {
        return player1Score >=4 || player2Score >=4;
    }
}
