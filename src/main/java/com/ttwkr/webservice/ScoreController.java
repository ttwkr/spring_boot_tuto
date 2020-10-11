package com.ttwkr.webservice;

import com.ttwkr.webservice.domain.dto.ScoreSaveRequestDto;
import com.ttwkr.webservice.domain.score.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ScoreController {

    private ScoreRepository scoreRepository;

    @GetMapping("/score")
    public String Score(){
        System.out.println("request");
        return "SCORE!!!";
    }

    @PostMapping("/score")
    public void InsertScore(@RequestBody ScoreSaveRequestDto dto){
        scoreRepository.save(dto.toEntry());
    }
}
