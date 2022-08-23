package com.example.bookapp.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

enum gender {
    MALE, FEMALE
}

@Entity
@Table(name="tbl_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @SequenceGenerator(
            name="user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.AUTO,
             generator = "user_sequence")
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
    private Date dob;
    private String gender;
    private String password;


}
