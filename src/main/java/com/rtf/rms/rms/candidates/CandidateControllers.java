package com.rtf.rms.rms.candidates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "api/v1/candidates")
public class CandidateControllers {

    private final CandidateServices candidateServices;
    private final CandidateDTOMapper candidateDTOMapper;

    @Autowired
    public CandidateControllers(CandidateServices candidateServices, CandidateDTOMapper candidateDTOMapper) {
        this.candidateServices = candidateServices;
        this.candidateDTOMapper = candidateDTOMapper;
    }

    @GetMapping(path = "/candidate")
    public ResponseEntity<List<CandidateDTO>> getCandidates(){

        List<Candidate> candidates = candidateServices.getCandidates();
        List<CandidateDTO> candidateDTOS =candidateDTOMapper.toCandidateDTO(candidates);

        return ResponseEntity.ok(candidateDTOS);
    }
}
