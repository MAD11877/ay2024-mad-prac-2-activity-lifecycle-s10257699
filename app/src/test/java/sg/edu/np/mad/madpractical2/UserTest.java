package sg.edu.np.mad.madpractical2;

import org.junit.Test;
import static org.junit.Assert.*;

import sg.edu.np.mad.mad_prac2.User;

public class UserTest {

    @Test
    public void testUserConstructor() {
        // Test the constructor of the User class
        User user = new User("John Doe", "MAD Developer", 1, false);

        // Assert that the user object is not null
        assertNotNull(user);

        // Assert that the user's name matches the expected value
        assertEquals("John Doe", user.name);

        // Assert that the user's description matches the expected value
        assertEquals("MAD Developer", user.description);

        // Assert that the user's id matches the expected value
        assertEquals(1, user.id);

        // Assert that the user's followed status matches the expected value
        assertFalse(user.followed);
    }

    // You can add more test methods here to cover other functionalities of the User class
}


