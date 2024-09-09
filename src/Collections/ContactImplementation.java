package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ContactImplementation implements IContact {
    LinkedList<Contact> details = new LinkedList<>();
    @Override
    public void add(Contact contact) {
       details.add(contact);
    }

    @Override
    public Contact searchContact(String name) {
        Stream<Contact> sContact = details.stream()
                .filter(contact -> contact.getName().equalsIgnoreCase(name))
                .findFirst().stream();

        if(details.isEmpty()){
            return null;
        }
        return (Contact) sContact;

    }

    @Override
    public Contact deleteContact(String name) {
        details.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
        if(details.isEmpty()){
            return null;
        }else{
            return null;
        }

    }

    @Override
    public void updateContact(int index, Contact word) {
        details.set(index, word);
    }

    @Override
    public void displayList() {
        for(Contact detail : details){
            System.out.println(detail);
        }
    }

}
