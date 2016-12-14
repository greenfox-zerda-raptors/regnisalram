/**
 * Created by regnisalram on 12/14/16.
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Workshop02 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/Workshop02?user=root&password=PtqUHLWr3RZF";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);

        Dao<Account, String> accountDao = DaoManager.createDao(connectionSource, Account.class);

        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);

        ArrayList<String> accountNames = new ArrayList<>();
        accountNames.add("Iron Man");
        accountNames.add("Wolverine");
        accountNames.add("Hulk");
        accountNames.add("Loki");

        for (String name : accountNames) {
            createAccountIfNotExists(accountDao, new Account(name, "abc"));
        }

        List<Account> accounts = accountDao.queryForAll();

        QueryBuilder<Account, String> queryBuilder = accountDao.queryBuilder();
        queryBuilder.orderBy("name", true);

        accounts = queryBuilder.query();

        for (Account acc : accounts) {
            System.out.println("Account: " + acc.toString());
        }
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}