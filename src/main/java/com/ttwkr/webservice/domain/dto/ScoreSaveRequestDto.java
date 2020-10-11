package com.ttwkr.webservice.domain.dto;


import com.ttwkr.webservice.domain.score.Score;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ScoreSaveRequestDto {
    private int user_id;
    private Long score;

    public Score toEntry(){
        return Score.builder()
                .user_id(user_id)
                .score(score)
                .build();
    }

}
