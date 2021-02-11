package guestbook.jpa;

import guestbook.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {

}
