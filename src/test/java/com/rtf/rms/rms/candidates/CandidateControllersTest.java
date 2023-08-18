package com.rtf.rms.rms.candidates;

import com.rtf.rms.rms.current_organizations.CurrentOrganization;
import com.rtf.rms.rms.stages.Stage;
import com.rtf.rms.rms.stages.StageRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
class CandidateControllersTest {
    //    enum Stage{
//        INTERNSHIP,
//        TRAINING,
//        AWAITING_REPLY,
//        SEND_TEST,
//        IN_TALK,
//        TO_CONTACT,
//        PLACEMENT_READY,
//        REJECTED,
//        COMPLETED
//    }
    @Autowired
    StageRepository stageRepository;
    @Autowired
    CandidateRepository candidateRepository;

    @Test
    void save() {
        CurrentOrganization currentOrganization = CurrentOrganization.builder()
                .name("RightFind Professional Pvt. Ltd")
                .address("Kupondol,Lalitpur")
                .contact("0987654321")
                .build();

        Optional<Stage> internshipStage = stageRepository.findByStage("Internship");
                    Candidate ethan = Candidate.builder()
                            .name("Bean Bestwood")
                            .address("Manchester,England")
                            .dob(LocalDate.of(2000, 5, 1))
                            .gender("Male")
                            .contact("1234567890")
                            .enrollDate(LocalDate.of(2020, 5, 1))
                            .expectedSalary(110_000L)
                            .orgId(currentOrganization)
                            .stage(internshipStage.get())
                            .build();
                    candidateRepository.save(ethan);

    }
}
