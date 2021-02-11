package guestbook.jpa;

import guestbook.config.JpaConfig;
import guestbook.domain.Guest;
import guestbook.domain.GuestbookEntry;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
public class GuestBookRepositoryTest {

    @Autowired
    GuestBookRepository guestBookRepository;
    @Autowired
    GuestRepository guestRepository;


    @Test
    public void fetchData() {
        assertNotNull(guestBookRepository);
        assertNotNull(guestBookRepository.count());
    }

    @Test
    public void saveData() {
        assertNotNull(guestBookRepository);
        Guest guest = new Guest();
        guest.setFirstName("Rahul");
        guest.setLastName("Sharma");
        Guest testGuest=guestRepository.save(guest);
        GuestbookEntry entry = new GuestbookEntry();
        entry.setGuest(testGuest);
        entry.setContent("1st content");
        GuestbookEntry save = guestBookRepository.save(entry);
        assertTrue(save.getId() > 0);
        List<Object[]> data = guestBookRepository.aggregateEntries();

        System.out.println(Arrays.toString(data.get(0)));
    }

    @Test
    public void saveDataWithGuest() {
        assertNotNull(guestBookRepository);
        GuestbookEntry entry = new GuestbookEntry();
        Guest guest = new Guest();
        guest.setFirstName("Rahul");
        guest.setLastName("Sharma");
        entry.setGuest(guest);
        entry.setContent("2st content");
        GuestbookEntry save = guestBookRepository.save(entry);
        assertTrue(save.getId() > 0);
        assertTrue(save.getGuest().getId() > 0);
    }


}
