package com.example.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2016-04-18.
 */
@Entity
@Getter
@Setter
@Table(schema = "bangbeae", name = "team")
public class Team {

    @Id
    @Column(name = "team_code")
    private String teamCd;

    @Column(name = "team_name")
    private String teamNm;
}
