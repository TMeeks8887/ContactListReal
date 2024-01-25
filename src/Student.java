public class Student extends Person
{
    private int grade;
    // Constructor extending Person
    public Student(String firstName, String lastName, String phoneNumber, int grade)
    {
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }
    // Getters and setters
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    // Overridden ToString
    @Override
    public String toString()
    {
        return super.toString() + " Grade: " + grade;
    }
}
