import builder.UserAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserAccountBuilderTest {

    @Test
    public void creatingUserThroughBuilder() throws Exception {

        UserAccount newAccount = new UserAccount
                .UserAccountBuilder("Janis", "Riga, Salnas 15")
                .withEmail("jaanis@inbox.lv")
                .withPhoneNumber("22738022")
                .wantNewsletter(true)
                .build();

        assertEquals(newAccount.getName(),"Janis");
        assertEquals(newAccount.getAddress(), "Riga, Salnas 15");
        assertEquals(newAccount.getPhoneNumber(), "22738022");
        assertEquals(newAccount.getEmail(),"jaanis@inbox.lv");
        assertEquals(newAccount.isNewsletter(), true);
    }
}
