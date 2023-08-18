package com.rtf.rms.rms.users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class User {
    @Id
    @SequenceGenerator(
            sequenceName = "userId",
            name = "userId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "userId"
    )
    Long userId;
    String email;
    String  password;
    String name;
}
