package com.rtf.rms.rms.candidates;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateDTOMapper {
    public List<CandidateDTO> toCandidateDTO(List<Candidate> candidates) {
        List<CandidateDTO> candidateDTOS = new ArrayList<>();

        candidates.forEach(candidate -> {
            candidateDTOS.add(CandidateDTO.builder()
                    .name(candidate.getName())
                    .address(candidate.getAddress()).build());
        });
        return candidateDTOS;
    }
}
