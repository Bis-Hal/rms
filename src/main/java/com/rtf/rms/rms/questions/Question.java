package com.rtf.rms.rms.questions;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "questions")
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
public class Question {
    @SequenceGenerator(
            sequenceName ="questionId",
            name = "questionId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "questionId"
    )
    @Id
    Long question_id;
    String question;
}
