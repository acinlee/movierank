package com.movie.user.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity(name = "USER")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true, length = 30)
    private String loginId;

    @Column(length = 30)
    private String loginPw;

    @Column(length = 50)
    private String name;

    @Column(length = 8)
    private String birth;

    @Column
    @CreatedDate
    private LocalDateTime createDate;

    @Column
    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Column
    private LocalDateTime lastLoginDateTime;

    @Column
    private int loginFailCount;
}
