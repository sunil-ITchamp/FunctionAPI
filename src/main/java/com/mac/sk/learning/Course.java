package com.mac.sk.learning;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@ToString
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_sequence")
    @SequenceGenerator(name="my_sequence",sequenceName = "Custom_Course_Sequence",initialValue = 100)
    private Long id;
    private String name;
    private String description;

    @ManyToMany(mappedBy = "courses")
    private List<Author> authors= new ArrayList<Author>();
}
