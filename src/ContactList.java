// Teddy Meeks

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactList
{
    private ArrayList<Person> contacts;
    private Scanner s;


    // Constructor
    public ContactList()
    {
        contacts = new ArrayList<Person>();
        s = new Scanner(System.in);
    }

    // Just returns contacts
    public ArrayList<Person> getContacts()
    {
        return contacts;
    }


    // Adds contacts given to the arrayList
    public void addContacts()
    {
        System.out.println("Select a type of contact to add: \n1. Student \n2. Athlete");
        int contactType = s.nextInt();
        s.nextLine();
        String first;
        String last;
        String phoneNum;
        System.out.println("Please fill in the following information.");
        System.out.println("First Name:");
        first = s.nextLine();
        System.out.println("Last Name:");
        last = s.nextLine();
        System.out.println("Phone Number:");
        phoneNum = s.nextLine();
        if (contactType == 1)
        {
            int grade;
            System.out.println("Grade:");
            grade = s.nextInt();
            s.nextLine();
            Student newStudent = new Student(first, last, phoneNum, grade);
            contacts.add(newStudent);
        }
        else if (contactType == 2)
        {
            String sport;
            System.out.println("Sport:");
            sport = s.nextLine();
            Athlete newAthlete = new Athlete(first, last, phoneNum, sport);
            contacts.add(newAthlete);
        }
    }

    // Prints out all contacts
    public void printContacts()
    {
        for (Person s : contacts)
        {
            System.out.println(s.toString());
        }
    }

    // Sorts the Contacts based on user input
    public void sort(int sorter)
    {

        for (int i = 0; i < contacts.size() - 1; i++)
        {
            for (int j = 0; j < contacts.size() - i - 1; j++)
            {
                Person person1 = contacts.get(j);
                Person person2 = contacts.get(j + 1);
                int result = 0;
                // Sorts by first name
                if (sorter == 0)
                {
                    result = person1.getFirstName().compareTo(person2.getFirstName());
                }
                // Sorts by last name
                else if (sorter == 1)
                {
                    result = person1.getLastName().compareTo(person2.getLastName());
                }
                // Sorts by phone number
                else if (sorter == 2)
                {
                    result = person1.getPhoneNumber().compareTo(person2.getPhoneNumber());
                }
                // Swapper
                if (result > 0)
                {
                    Collections.swap(contacts, j, j + 1);
                }
            }
        }
    }

    // Prints only the students
    public void listStudents()
    {
        for (Person s : contacts)
        {
            if (s instanceof Student)
            {
                System.out.println(s.toString());
            }
        }
    }

    // Checks if the first name given equals any in the ArrayList
    public Person searchByFirstName(String firstName)
    {
        for (Person s : contacts)
        {
            if (s.getFirstName().equals(firstName))
            {
                return s;
            }
        }
        return null;
    }

    // Checks if the last name given equals any in the ArrayList
    public Person searchByLastName(String lastName)
    {
        for (Person s : contacts)
        {
            if (s.getLastName().equals(lastName))
            {
                return s;
            }
        }
        return null;
    }

    // Checks if the phone number given equals any in the ArrayList
    public Person searchByPhoneNumber(String phoneNumber)
    {
        for (Person s : contacts)
        {
            if (s.getPhoneNumber().equals(phoneNumber))
            {
                return s;
            }
        }
        return null;
    }

    // Prints out the phone menu instructions
    public void printMenu()
    {
        System.out.println("Menu: ");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search By Phone Number");
        System.out.println("0. Exit");
    }

    // Runs the code fully
    public void run()
    {
        // Choice by default not 0-8
        int choice = 9;


        System.out.println("Welcome to your Contacts List");
        System.out.println("Please pick from the following menu options\n");
        while (choice != 0)
        {
            printMenu();
            choice = s.nextInt();
            s.nextLine();

            if (choice == 1)
            {
                addContacts();
            }

            else if (choice == 2)
            {
                sort(0);
                printContacts();
            }

            else if (choice == 3)
            {
                sort(1);
                printContacts();
            }

            else if (choice == 4)
            {
                sort(2);
                printContacts();
            }

            else if (choice == 5)
            {
                listStudents();
            }

            else if (choice == 6)
            {
                System.out.println("Enter A First Name: ");
                String name = s.nextLine();
                Person nameFound = searchByFirstName(name);
                if (nameFound == null)
                {
                    System.out.println(name + " Is Not In Your Contacts");
                }
                else
                {
                    System.out.println(nameFound);
                }
            }

            else if (choice == 7)
            {
                System.out.println("Enter A Last Name: ");
                String name = s.nextLine();
                Person nameFound = searchByLastName(name);
                if (nameFound == null)
                {
                    System.out.println(name + " Is Not In Your Contacts");
                }
                else
                {
                    System.out.println(nameFound);
                }
            }

            else if (choice == 8)
            {
                System.out.println("Enter A Phone Number: ");
                String number = s.nextLine();
                Person nameFound = searchByPhoneNumber(number);
                if (nameFound == null)
                {
                    System.out.println(number + " Is Not In Your Contacts");
                }
                else
                {
                    System.out.println(nameFound);
                }
            }

            else
            {
                return;
            }
        }
    }

    public static void main(String[] args)
    {
        ContactList contactlist = new ContactList();
        contactlist.run();
    }
}
