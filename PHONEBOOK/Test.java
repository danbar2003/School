package PHONEBOOK;
import java.util.Scanner;

public class Test
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);


        PhoneBook book = new PhoneBook(20);

        book.addContact("Galit Israel", "03-9089730");
        book.addContact("Avner Chohen", "02-7474747");
        book.addContact("Gershon Avraham", "02-8900011");
        book.addContact("Daniela Yariv", "04-5677708");
        book.addContact("Alice Marlo", "04-5699300");
        book.addContact("Bob Denver", "04-5699300");
        book.addContact("Galit Israel","02-6415555");
        int op;
        do
        {
            op = showMenu();
            switch(op)
            {
                case 1: addContactToPhoneBook(book); break;
                case 2: delContactFromPhoneBook(book); break;
                case 3: getContactPhone(book); break;
                case 4: System.out.println(book.toString()); break;
                case 5: System.out.println("Num Of Contacts: " + book.getAllContactsNames().length); break;
                default:
                    throw new IllegalStateException("Unexpecteעםvalue: " + op);
            }
            if(op != 6)
            {
                System.out.println("Press Enter to show menu...");
                input.nextLine();
                System.out.println();
                System.out.println();
            }
        } while(op!=6);
        System.out.println("Bye Bye.");
    }


    public static int showMenu()
    {
        int op;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("=======================================");
            System.out.println("1. Add/Update contact");
            System.out.println("2. Delete exist contact");
            System.out.println("3. Get contact phone number");
            System.out.println("4. Print the phone book");
            System.out.println("5. Get number of conatcts in phone book");
            System.out.println("6. Exit");
            System.out.println("=======================================");
            System.out.print(">> Enter your option [1-6]: ");
            op = input.nextInt();
            System.out.println();

        }while(op<1 || op>6);

        return(op);
    }

    // פעולה להוספה/עדכון איש קשר בספר הטלפונים
    public static void addContactToPhoneBook(PhoneBook book)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(">> Enter contact name to add or update: ");
        String name = input.nextLine();
        System.out.print(">> Enter contact phone: ");
        String phone = input.nextLine();


        if(book.getPhone(name) != null)
            System.out.println("Contact allready exist in phone book, phone was updated. ");
        else
            System.out.println("Contact was add to phone book.");
        book.addContact(name,phone);
        System.out.println(book);
    }

    // פעולה למחיקת איש קשר מספר הטלפונים
    public static void delContactFromPhoneBook(PhoneBook book)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(">> Enter contact name to delete: ");
        String name = input.nextLine();

        if(book.getPhone(name) != null)
        {
            book.delContact(name);
            System.out.println("Contact was deleted from phone book. ");
        }
        else
            System.out.println("Contact was not found in the phone book. ");

        System.out.println(book);
    }


    // פעולה למציאת מספר טלפון של איש קשר בספר הטלפונים
    public static void getContactPhone(PhoneBook book)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(">> Enter contact name: ");
        String name = input.nextLine();

        String phone = book.getPhone(name);
        if(phone != null)
            System.out.println("The phone number is: " + phone);
        else
            System.out.println("Contact was not found in the phone book. ");
    }
}