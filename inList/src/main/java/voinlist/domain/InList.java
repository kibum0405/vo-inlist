package voinlist.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import voinlist.InListApplication;

@Entity
@Table(name = "InList_table")
@Data
//<<< DDD / Aggregate Root
public class InList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Address address;

    @Embedded
    private Photo photo;

    @Embedded
    private File file;

    @Embedded
    private User user;

    @Embedded
    private Money mony;

    @Embedded
    private Email email;

    @Embedded
    private Payment payment;

    @Embedded
    private Likes like;

    @Embedded
    private Tags tags;

    @Embedded
    private Comment comment;

    public static InListRepository repository() {
        InListRepository inListRepository = InListApplication.applicationContext.getBean(
            InListRepository.class
        );
        return inListRepository;
    }
}
//>>> DDD / Aggregate Root
