import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by regnisalram on 12/14/16.
 */
@DatabaseTable(tableName = "accounts")
public class Account {
    @DatabaseField(id = true)
    private String name;

    @DatabaseField
    private String password;

    @DatabaseField (columnName = "addressID", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Address addressID;

    public Account() {

    }

    public Account(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.addressID = address;
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

    public Address getAddressID() {
        return addressID;
    }

    public void setAddressID(Address addressID) {
        this.addressID = addressID;
    }

    @Override
    public String toString() {
        return "name = " + name + addressID.toString();
    }
}
