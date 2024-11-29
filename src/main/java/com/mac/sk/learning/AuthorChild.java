package com.mac.sk.learning;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(callSuper = true)
public class AuthorChild extends BaseEntity {

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_book_id")
    private Book book;

}


