package com.rtf.rms.rms.stages;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stages")
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
public class Stage {
    @SequenceGenerator(
            sequenceName = "stageId",
            name = "stageId",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "stageId"
    )
    @Id
    Long stageId;
    String stage;
}
