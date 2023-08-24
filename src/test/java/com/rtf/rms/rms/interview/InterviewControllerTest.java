package com.rtf.rms.rms.interview;

import com.rtf.rms.rms.candidates.Candidate;
import com.rtf.rms.rms.candidates.CandidateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class InterviewControllerTest {

    @Autowired
    CandidateRepository candidateRepository;
    @Autowired
    InterviewRepository interviewRepository;
    @BeforeEach
    void setUp() {
    }

    @Test
    public void setInterview(){
    candidateRepository.findById(1L)
            .ifPresent(candidate -> {
                 Interview interview = Interview.builder()
                        .startTime(LocalTime.now())
                        .endTime(LocalTime.of(LocalTime.now().getHour() + 1, LocalTime.now().getMinute()))
                        .candidateId(candidate)
                        .date(LocalDate.now())
                        .location("Kupandol")
                        .build();
                 interviewRepository.save(interview);

                    }
            );
        candidateRepository.findById(2L)
                .ifPresent(candidate -> {
                            Interview interview = Interview.builder()
                                    .startTime(LocalTime.now())
                                    .endTime(LocalTime.of(LocalTime.now().getHour() + 1, LocalTime.now().getMinute()))
                                    .candidateId(candidate)
                                    .date(LocalDate.now())
                                    .location("Kupandol")
                                    .build();
                            interviewRepository.save(interview);

                        }
                );

    }
    @Test
    void getInterviews(){
        if (interviewRepository.findById(1L).isPresent()) {
            System.out.println(interviewRepository.findById(1L).get().toString());
        }
    }
}