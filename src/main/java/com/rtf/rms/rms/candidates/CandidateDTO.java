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
    private int candidateId;
    private String name;
    private String address;
    private int expectedSalary;
    private String phoneNumber;
    private String gender;
    private String dob;
}
