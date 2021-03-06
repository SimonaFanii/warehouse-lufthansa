package com.sha.springbootjwtauthorization.model;

import lombok.Data;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="jwt_refresh_token")
public class JwtRefreshToken {
    @Id
    @Column(name="token_id",nullable=true)
    private String tokenId;


    @Column(name="user_id",nullable=true)
    private Long userId;

    @Column(name="create_date",nullable = true)
    private LocalDateTime creationDate;



    @Column(name="expiration_date",nullable=true)
    private LocalDateTime expirationDate;
}
