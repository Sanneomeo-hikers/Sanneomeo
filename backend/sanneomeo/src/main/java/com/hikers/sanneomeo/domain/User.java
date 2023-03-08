package com.hikers.sanneomeo.domain;

import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "tbl_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_seq", nullable = false)
    private Long userSeq;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private Integer age;

    @Column(name = "si")
    private String si;

    @Column(name = "gu")
    private String gu;

    @Column(name = "dong")
    private String dong;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "social")
    private String social;

    @Column(name = "social_id")
    private String socialId;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "total_duration")
    private String totalDuration;

    @Column(name = "total_distance")
    private String totalDistance;

    @Column(name = "total_number")
    private Integer totalNumber;

    @Column(name = "profile_image")
    private String profileImage;



}
