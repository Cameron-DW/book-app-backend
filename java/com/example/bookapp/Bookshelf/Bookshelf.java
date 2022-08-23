package com.example.bookapp.Bookshelf;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="tbl_bookshelf")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bookshelf {

    @Id
    @SequenceGenerator(
            name="bookshelf_sequence",
            sequenceName = "bookshelf_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "bookshelf_sequence")
    private Long bookshelfId;
    private String name;

}
