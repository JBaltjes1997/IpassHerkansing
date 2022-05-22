package com.example.demo.domain;

public class Supplier extends Persoon {
    String specialisme;

    public Supplier(String voornaam, String achternaam, String postcode, int tel_nummer, String wachtwoord, String specialisme) {
        super(voornaam, achternaam, postcode, tel_nummer, wachtwoord);
        this.specialisme = specialisme;
    }

    public String getSpecialisme() {
        return specialisme;
    }

    public void setSpecialisme(String specialisme) {
        this.specialisme = specialisme;
    }
}
