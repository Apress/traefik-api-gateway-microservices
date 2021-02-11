package guestbook.jpa;

import guestbook.domain.GuestbookEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface GuestBookRepository extends JpaRepository<GuestbookEntry, Long> {
    @Query(value = "select GUEST_ID, count(*) from GUEST_BOOK group by GUEST_ID", nativeQuery = true)
    List<Object[]> aggregateEntries();


}
