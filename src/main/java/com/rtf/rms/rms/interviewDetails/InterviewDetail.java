package com.rtf.rms.rms.interviewDetails;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "interviews")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class InterviewDetail {
    @SequenceGenerator(
            sequenceName = "interviewDetailId",
            name = "interviewDetailId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "interviewDetailId"
    )
    @Id
    Long interviewId;
    String title;
    LocalDate startOfTime;
    LocalDate endAtTime;
    String location;


}
