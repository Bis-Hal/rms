package com.rtf.rms.rms.interview;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "interview/")
public class InterviewController {
    @GetMapping(path = "schedule")
    public List<String> getInterview(){
            return List.of(
                    "10:00 A.M.",
                    "10:00 A.M.",
                    "10:00 A.M."
            );
    }
}
