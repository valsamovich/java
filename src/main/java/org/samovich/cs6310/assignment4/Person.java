package org.samovich.cs6310.assignment4;

/**
 * @author Valery Samovich
 * @see
 */
public class Person {
    private Long uuid;
    private String name;
    private String homeAddress;
    private String phoneNumber;

    public Person(Long uuid, String name, String homeAddress, String phoneNumber) {
        this.uuid = uuid;
        this.name = name;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
