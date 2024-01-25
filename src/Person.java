public class Person
{
    // Instance Variables
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor
    public Person(String firstName, String lastName, String phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public String getFirstName()
    {
        return firstName;
    }

    public void setFristName(String firstName) { this.firstName = firstName; }

    public String getLastName()
    {
        return lastName;
    }

    public void setlastName(String lastName) { this.lastName = lastName; }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    // ToString
    public String toString()
    {
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
