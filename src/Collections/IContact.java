package Collections;

import java.util.List;

public interface IContact {
    void add(Contact contact);
    Contact searchContact(String name);
    Contact deleteContact(String name);
    void updateContact(int index, Contact word);
    void displayList();
}
