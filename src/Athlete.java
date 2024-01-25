public class Athlete extends Person
{
    private String sport;
    // Constructor extending Person
    public Athlete(String firstName, String lastName, String phoneNumber, String sport)
    {
        // Super to extend
        super(firstName, lastName, phoneNumber);
        this.sport = sport;
    }

    // Getters and setters
    public String getSport()
    {
        return sport;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    // Overridden ToString
    @Override
    public String toString()
    {
        return super.toString() + " Sport: " + sport;
    }
}
