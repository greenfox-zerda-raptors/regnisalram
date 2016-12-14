import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by regnisalram on 12/14/16.
 */
@DatabaseTable(tableName = "address")
public class Address {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String street;

    @DatabaseField
    private String city;

    @DatabaseField
    private int postcode;

    @DatabaseField
    private String country;

    public Address() {

    }

    public Address(String street, String city, int postcode, String country) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "{\n" +
                "postcode = " + postcode +
                "\ncity = " + city +
                "\ncountry = " + country +
                "\nstreet = " + street +
                "\n}";
    }
}
