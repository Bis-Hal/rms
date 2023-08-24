package com.rtf.rms.rms.reviews;

import com.rtf.rms.rms.interview.InterviewRepository;
import com.rtf.rms.rms.questions.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ReviewControllerTest {
    @Autowired
    InterviewRepository interviewRepository;

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    ReviewRepository reviewRepository;

    @Test
    public void setReview(){
            Review review = Review.builder()
                .interviewId(interviewRepository.findById(3L).get())
                .comment("Well Done")
                .questionId(questionRepository.findById(1L).get())
                .rating(1)
                .build();
        Review review1 = Review.builder()
                .interviewId(interviewRepository.findById(3L).get())
                .comment("Well Done")
                .questionId(questionRepository.findById(2L).get())
                .rating(1)
                .build();

        reviewRepository.saveAll(List.of(review1,review));


    }

}