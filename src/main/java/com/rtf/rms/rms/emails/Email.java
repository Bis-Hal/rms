package com.rtf.rms.rms.emails;

import com.rtf.rms.rms.candidates.Candidate;
import com.rtf.rms.rms.email_types.EmailType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "emails")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class Email {
    @Id
    @SequenceGenerator(
            sequenceName = "emailId",
            name = "emailId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "emailId"
    )
    Long emailId;
    String email;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "emailTypeId")
    EmailType emailTypeId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "candidateId")
    Candidate candidateId;
}
