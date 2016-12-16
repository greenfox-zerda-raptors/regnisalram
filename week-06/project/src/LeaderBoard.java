import com.j256.ormlite.stmt.QueryBuilder;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by regnisalram on 12/16/16.
 */
public class LeaderBoard extends JFrame {

    private JPanel panel;
    List<PlayedGame> leaderBoardForSize;
    Database usersAndGames;
    int currentGameSize;

    public LeaderBoard(Database usersAndGames, int currentGameSize) {
        this.usersAndGames = usersAndGames;
        this.currentGameSize = currentGameSize;

        setUpPanel();
        getLeaderBoard();

        int index = 1;

        for (PlayedGame game : leaderBoardForSize) {
            panel.add(new JLabel(index++ + ". " + game.toString()));
        }

        pack();
    }

    private void setUpPanel() {

        this.setTitle("Leaderboard");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        panel = new JPanel();
        this.add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        setVisible(true);
    }

    public void getLeaderBoard() {

        QueryBuilder<PlayedGame, Integer> queryBuilder = usersAndGames.playedGameDao.queryBuilder();

        try {
            queryBuilder.orderBy("points", false)
                    .where()
                    .eq("size_of_table", currentGameSize);
            leaderBoardForSize = queryBuilder.query();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
