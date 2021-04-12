package candidateprogram;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class Candidates implements Comparator<Candidates>{

    private int ID, birthdate, type;
    private String name, address, phone, email;
    private String firstName, lastName;

    public Candidates() {
    }

    public Candidates(int ID, int birthdate, int type, String name, String address, String phone, String email) {
        this.ID = ID;
        this.birthdate = birthdate;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        String[] s = name.split("[ ]");
        return s[0];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        String[] s = name.split("[ ]");
        return s[s.length-1];
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public int compare(Candidates o1, Candidates o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

}
