package com.mac.sk.learning;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@ToString
@EqualsAndHashCode(callSuper = true)
public class Book extends BaseEntity {

    private String name;

    @OneToOne(mappedBy = "book")
    private AuthorChild author;
}
