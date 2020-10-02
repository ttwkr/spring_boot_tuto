package com.ttwkr.webservice;

import com.ttwkr.webservice.domain.score.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ScoreController {

    @GetMapping("/score")
    public String Score(){
        System.out.println("request");
        return "SCORE!!!";
    }
}
