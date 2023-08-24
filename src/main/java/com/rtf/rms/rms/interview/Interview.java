package com.rtf.rms.rms.interview;

import com.rtf.rms.rms.candidates.Candidate;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "interviews")
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
public class Interview {
    @SequenceGenerator(
            sequenceName="interviewId",
            name = "interviewId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interviewId"
    )
    @Id
    Long interviewId;

    @ManyToOne
    @JoinColumn(name = "candidateId")
    Candidate candidateId;

    @Column(name = "location")
    String location;

    @Column(name = "date")
    LocalDate date;

    @Column(name = "start_time")
    LocalTime startTime;

    @Column(name = "end_time")
    LocalTime endTime;


}

