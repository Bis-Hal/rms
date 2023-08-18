package com.rtf.rms.rms.interview;

import com.rtf.rms.rms.candidates.Candidate;
import com.rtf.rms.rms.interviewDetails.InterviewDetail;
import com.rtf.rms.rms.users.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "interviews")
@AllArgsConstructor
@Setter
@Getter
@Builder
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
    @JoinColumn(name = "InterviewDetailId")
    InterviewDetail interviewDetailId;
    @ManyToOne
    @JoinColumn(name = "userId")
    User userId;
    @ManyToOne
    @JoinColumn(name = "candidateId")
    Candidate candidateId;
}
