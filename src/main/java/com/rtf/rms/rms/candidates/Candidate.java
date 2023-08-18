package com.rtf.rms.rms.candidates;

import com.rtf.rms.rms.current_organizations.CurrentOrganization;
import com.rtf.rms.rms.stages.Stage;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "candidates")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class Candidate{
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
        private Long candidateId;
        private String name;
        private String address;
        private String contact;
        private String gender;
        private LocalDate dob;
        private Long expectedSalary;
        private LocalDate enrollDate;

        @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "orgId")
        private CurrentOrganization orgId;
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "stageId")
        private Stage stage;
        


 ;
}


