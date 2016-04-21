package com.example.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by mac on 2016. 4. 5..
 */
@Entity
@Getter
@Setter
@Table(schema = "bangbeae", name = "member")
public class Member {

    @Id
    private String id;

    @Column(name = "pwd")
    private String password;

    @ManyToOne
    @JoinColumn(name="team_code")
    private Team team;

}
