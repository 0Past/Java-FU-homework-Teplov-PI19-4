package sample.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("firstName")
    @Expose
    private String firstName;

    @SerializedName("lastName")
    @Expose
    private String lastName;

    @SerializedName("street")
    @Expose
    private String street;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("postalCode")
    @Expose
    private String postalCode;

    @SerializedName("birthDate")
    @Expose
    private String birthday;

    public Person(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public StringProperty getLastNameProperty() {
        return  new SimpleStringProperty(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public StringProperty getFirstNameProperty() {
        return new SimpleStringProperty(firstName);
    }

    public String getStreet() {
        return street;
    }


    public String getPostalCode() {
        return postalCode;
    }


    public String getCity() {
        return city;
    }



    public String getBirthday() {
        return birthday;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setStreet(String street){
        this.street = street;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

}