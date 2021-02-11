package guestbook.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "GUEST")
public class Guest {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;

    @OneToMany(mappedBy = "guest",cascade = CascadeType.ALL)
    List<GuestbookEntry> entries;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<GuestbookEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<GuestbookEntry> entries) {
        this.entries = entries;
    }
}
