package PHONEBOOK;
import java.util.Arrays;
public class PhoneBook {
    final public int masheho = 60;
    public int numContacts;
    private Contact[] book;

    public PhoneBook(int phoneBookSize){
        this.book = new Contact[phoneBookSize];
        this.numContacts = 0;
    }

    public int searchName(String name){
        for(int i = 0; i < this.numContacts; i++) {
            if (this.book[i].getName().equals(name))
                return i;
        }
        return -1;
    }

    public void addContact(String name, String phone){
        if(searchName(name) == -1){
            this.book[numContacts] = new Contact(name,phone);
            this.numContacts++;
            return;
        }
        this.book[searchName(name)].setPhone(phone);
    }

    public void delContact(String name){
        if(searchName(name) != -1){
            this.book[searchName(name)] = new Contact(this.book[numContacts-1].getName(),this.book[numContacts-1].getPhone());
            this.book[numContacts-1] = null;
            numContacts--;
        }
    }

    public String getPhone(String name){
        if(searchName(name) != -1) {
            return (this.book[searchName(name)].getPhone());
        }
        return null;
    }

    public String[] getAllContactsNames(){
        String[] arr = new String[numContacts];
        for(int i = 0 ; i < numContacts; i ++){
            arr[i] = this.book[i].getName();
        }
        return arr;
    }

    @Override
    public String toString() {
        String[] contactNames = getAllContactsNames();
        Arrays.sort(contactNames);
        String output = "";
        for (int i = 0; i < contactNames.length; i++) {
            output += book[searchName(contactNames[i])].getName() + book[searchName(contactNames[i])].getPhone() + "\n";
        }
        return output;
    }
}
