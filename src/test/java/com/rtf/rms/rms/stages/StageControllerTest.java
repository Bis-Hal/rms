package com.rtf.rms.rms.stages;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
@SpringBootTest
class StageControllerTest {

    @Autowired
    private  StageRepository stageRepository;



    @Test
    public void save() {
        Stage internship = Stage.builder()
                .stage("Internship")
                .build();
        Stage training = Stage.builder()
                .stage("Training")
                .build();
        Stage awaitingReply = Stage.builder()
                .stage("Awaiting reply")
                .build();
        Stage sendTest = Stage.builder()
                .stage("Send Test")
                .build();
        Stage inTalk = Stage.builder()
                .stage("In-Talk")
                .build();
        Stage toContact = Stage.builder()
                .stage("To Contact")
                .build();
        Stage placementReady = Stage.builder()
                .stage("Placement Ready")
                .build();
        Stage rejected = Stage.builder()
                .stage("Rejected")
                .build();
        Stage completed = Stage.builder()
                .stage("Completed")
                .build();

        List<Stage> stages = List.of(
                internship,
                training,
                awaitingReply,
                sendTest,
                inTalk,
                toContact,
                placementReady,
                rejected,
                completed

        );
        stageRepository.saveAll(stages);

    }
}