package com.ttwkr.webservice;

import com.ttwkr.webservice.domain.score.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ScoreController {


    @RequestMapping(value = "/score", method = RequestMethod.GET)
    public String Score(){
        System.out.println("request");
        return "SCORE!!!";
    }
}
