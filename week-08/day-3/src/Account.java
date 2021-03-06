import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by regnisalram on 12/14/16.
 */
@DatabaseTable (tableName = "accounts")
public class Account {
    @DatabaseField (id = true)
    private String name;

    @DatabaseField
    private String password;

    public Account() {

    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name;
    }
}
