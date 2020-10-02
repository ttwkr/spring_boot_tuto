package com.ttwkr.webservice.domain.score;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Score {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int user_id;

    @Column(nullable = false)
    private Long score;

    @Builder
    public Score(int user_id, Long score){
        this.user_id = user_id;
        this.score = score;
    }
}
