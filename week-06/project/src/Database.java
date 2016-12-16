import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by regnisalram on 12/15/16.
 */
public class Database {

    String databaseUrl = "jdbc:mysql://127.0.0.1:3306/memory_game?user=root&password=PtqUHLWr3RZF";

    ConnectionSource connectionSource;

    Dao<User, String> userDao;

    Dao<PlayedGame, Integer> playedGameDao;

    void setUp() throws SQLException {

        connectionSource = new JdbcConnectionSource(databaseUrl);

        userDao = DaoManager.createDao(connectionSource, User.class);

        playedGameDao = DaoManager.createDao(connectionSource, PlayedGame.class);

        TableUtils.createTableIfNotExists(connectionSource, User.class);
        TableUtils.createTableIfNotExists(connectionSource, PlayedGame.class);

    }

    void createUserIfNotExists(User username) throws SQLException {
        if(userDao.queryForId(username.getName()) == null) {
            userDao.create(username);
        }
    }

    void storePlayedGame(PlayedGame playedGame) throws SQLException{
        playedGameDao.create(playedGame);
    }
}
