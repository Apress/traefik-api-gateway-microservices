package guestbook.domain;

import javax.persistence.*;

@Entity
@Table(name = "GUEST_BOOK")
public class GuestbookEntry {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="GUEST_ID")
    private Guest guest;
    private String content;

    public void setId(Long id) {
        this.id = id;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getContent() {
        return content;
    }

    public Long getId() {
        return id;
    }
}
