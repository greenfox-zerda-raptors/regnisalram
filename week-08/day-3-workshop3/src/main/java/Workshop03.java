/**
 * Created by regnisalram on 12/14/16.
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class Workshop03 {
    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/workshop03?user=root&password=PtqUHLWr3RZF";

        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, Account.class);
        TableUtils.createTableIfNotExists(connectionSource, Address.class);

        Dao<Account, String> accountDao =
                DaoManager.createDao(connectionSource, Account.class);


        Account account = new Account("Captain America", "uejnsd632**234.");
        createAccountIfNotExists(accountDao, account);

        account = accountDao.queryForId("Captain America");
        System.out.println("Account: " + account.toString());
    }

    private static void createAccountIfNotExists(Dao<Account, String> accountDao, Account acc) throws SQLException {
        if(accountDao.queryForId(acc.getName()) == null) {
            accountDao.create(acc);
        }
    }
}