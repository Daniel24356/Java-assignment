package Collections;

import java.util.ArrayList;

public class Contact {
    private String phone;
    private String name;
    private String email;
    private int id;

    public Contact(String phone, String name, String email, int id) {
        this.phone = phone;
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void ContactList(){
        System.out.println("\nid: "+ id +
                "\nphone: "+ phone +
                "\nName: "+ name +
                "\nemail: "+ email
        );
    }

}
