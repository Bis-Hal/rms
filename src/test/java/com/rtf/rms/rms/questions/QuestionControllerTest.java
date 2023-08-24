package com.rtf.rms.rms.questions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class QuestionControllerTest {

    @Autowired
    QuestionRepository questionRepository;
    @Test
    public void setQuestion(){
        Question question1 = Question.builder()
                .question("What")
                .build();
        Question question2 = Question.builder()
                .question("Why")
                .build();
        Question question = Question.builder()
                .question("When")
                .build();
        questionRepository.saveAll(List.of(question1,question2,question));

    }


}