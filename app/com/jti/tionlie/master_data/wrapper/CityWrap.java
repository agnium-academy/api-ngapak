package com.jti.tionlie.master_data.wrapper;

/**
 * Created by HP on 02/02/2016.
 */
public class CityWrap {

    private String id;
    private String name;
    private String postalCode;

    public CityWrap() {
    }

    public CityWrap(String id, String name, String postalCode) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
