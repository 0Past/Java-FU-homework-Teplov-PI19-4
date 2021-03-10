package sample.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {



    public Person(){
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
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty getLastNameProperty() {
        return lastName;
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty getFirstNameProperty() {
        return firstName;
    }

    public String getStreet() {
        return street.get();
    }

    public StringProperty getStreetProperty() {
        return street;
    }

    public int getPostalCode() {
        return postalCode.get();
    }

    public IntegerProperty getPostalCodeProperty() {
        return postalCode;
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty getCityProperty() {
        return city;
    }

    public LocalDate getBirthday() {
        return birthday.get();
    }
    public ObjectProperty<LocalDate> getBirthdayProperty() {
        return birthday;
    }

    public void setFirstName(String firstName){
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName){
        this.lastName.set(lastName);
    }

    public void setCity(String city){
        this.city.set(city);
    }

    public void setStreet(String street){
        this.street.set(street);
    }
    public void setPostalCode(int postalCode){
        this.postalCode.set(postalCode);
    }

    public void setBirthday(LocalDate birthday){
        this.birthday.set(birthday);
    }

}