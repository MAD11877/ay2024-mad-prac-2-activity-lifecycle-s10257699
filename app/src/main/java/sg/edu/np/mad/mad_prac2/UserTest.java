package sg.edu.np.mad.mad_prac2;

public class UserTest
{
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public UserTest(String name, String description, int id, Boolean followed)
    {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}