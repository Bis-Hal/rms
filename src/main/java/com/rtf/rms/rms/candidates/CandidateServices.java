package com.rtf.rms.rms.candidates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServices {

    CandidateRepository candidateRepository;
    @Autowired
    CandidateServices(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }
    public List<Candidate> getCandidates() {
        return candidateRepository.findAll();
    }
}
