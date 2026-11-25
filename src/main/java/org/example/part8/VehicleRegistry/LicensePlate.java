package org.example.part8.VehicleRegistry;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        if(this.liNumber == null){
            return this.country.hashCode();
        }
        return this.liNumber.hashCode() + this.country.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof LicensePlate)){
            return false;
        }

        LicensePlate comparedObject = (LicensePlate) obj;
        return this.liNumber.equals(comparedObject.liNumber) && this.country.equals(comparedObject.country);

    }
}
