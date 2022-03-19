package projetos.udemy;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    private int findContact(String contact){
        for(int i = 0; i < myContacts.size(); i++){
            Contact temp = myContacts.get(i);
            if (temp.getName().equals(contact)) return i;
        }
        return -1;
    }

    public boolean addNewContact(Contact newContact){
        if (findContact(newContact.getName()) >= 0) {
            return false;
        } else {
        myContacts.add(newContact);
        return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if (findContact(oldContact) < 0) return false;

        myContacts.remove(oldContact);
        myContacts.add(newContact);

        return true;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact) < 0) return false;
        myContacts.remove(contact);
        return true;
    }

    public Contact queryContact(String contact){
        if (findContact(contact) == -1) return null;
        return myContacts.get(findContact(contact));
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
