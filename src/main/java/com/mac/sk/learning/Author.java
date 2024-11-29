package com.mac.sk.learning;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    // One to One
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_course_id")

        @ManyToMany
        @JoinTable(
                name = "join_author_course",
                joinColumns = {@JoinColumn(name="fk_author_id",referencedColumnName = "id")},
                inverseJoinColumns = {@JoinColumn(name="fk_course_id", referencedColumnName = "id")}
        )
        private List<Course> courses= new ArrayList<Course>();

}

