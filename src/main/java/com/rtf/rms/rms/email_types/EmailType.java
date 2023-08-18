package com.rtf.rms.rms.email_types;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "email_types")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class EmailType {
    @SequenceGenerator(
            sequenceName = "candidateId",
            name = "candidateId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "candidateId"
    )
    @Id
    Long emailTypeId;
    String emailType;

}
