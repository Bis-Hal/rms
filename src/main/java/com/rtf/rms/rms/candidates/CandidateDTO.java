package com.rtf.rms.rms.candidates;

import lombok.*;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class CandidateDTO {
    private String name;
    private String address;
}
