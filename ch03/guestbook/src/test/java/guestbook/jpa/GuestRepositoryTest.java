package guestbook.jpa;

import guestbook.domain.Guest;
import guestbook.config.JpaConfig;
import guestbook.domain.GuestbookEntry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
public class GuestRepositoryTest {

    @Autowired
    GuestRepository guestRepository;


    @Test
    public void fetchData() {
        assertNotNull(guestRepository);
        assertNotNull(guestRepository.count());
    }

    @Test
    public void saveData() {
        assertNotNull(guestRepository);
        Guest guest=new Guest();
        guest.setFirstName("Rahul");
        guest.setLastName("Sharma");
        Guest data = guestRepository.save(guest);
        assertTrue(data.getId() > 0);
    }

    @Test
    public void saveDataWithEntries() {
        Guest guest=new Guest();
        guest.setFirstName("Rahul");
        guest.setLastName("Sharma");
        GuestbookEntry entry= new GuestbookEntry();
        entry.setContent("2st content");
        guest.setEntries(Arrays.asList(entry));
        Guest save = guestRepository.save(guest);
        assertTrue(save.getId() > 0);
        assertTrue(save.getEntries().get(0).getId() > 0);
    }

}