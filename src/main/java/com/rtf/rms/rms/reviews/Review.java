package com.rtf.rms.rms.reviews;

import com.rtf.rms.rms.questions.Question;
import com.rtf.rms.rms.users.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "reviews")
@AllArgsConstructor
@Setter
@Getter
@Builder
@NoArgsConstructor
public class Review {
    @Id
    @SequenceGenerator(
            sequenceName = "reviewId",
            name = "reviewId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "reviewId"
    )
    Long reviewId;
    String comment;
    int rating;
    @ManyToOne
    @JoinColumn(name = "userId")
    User userId;
    @ManyToOne
    @JoinColumn(name = "questionId")
    Question questionId;
}
