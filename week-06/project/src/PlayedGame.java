import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by regnisalram on 12/15/16.
 */
@DatabaseTable(tableName = "Played_Game")
public class PlayedGame {

    @DatabaseField (generatedId = true)
    private int id;

    @DatabaseField (columnName = "size_of_table")
    private int tableSize;

    @DatabaseField (columnName = "points")
    private int points;

    @DatabaseField (foreign = true, canBeNull = false, columnName = "player")
    private User player;

    public PlayedGame() {
    }

    public PlayedGame(int tableSize, int points, User player) {
        this.tableSize = tableSize;
        this.points = points;
        this.player = player;
    }

    public int getTableSize() {
        return tableSize;
    }

    public void setTableSize(int tableSize) {
        this.tableSize = tableSize;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public User getUsername() {
        return player;
    }

    public void setUsername(User player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return player.toString() + " " + points;
    }
}
