package guestbook;

import guestbook.domain.GuestbookEntry;
import guestbook.jpa.GuestBookRepository;

public class GuestbookService {

    private GuestBookRepository jpaRepository;

    public void create(GuestbookEntry guestbookEntry, String ipAddress) {
        jpaRepository.save(guestbookEntry);
    }
}
