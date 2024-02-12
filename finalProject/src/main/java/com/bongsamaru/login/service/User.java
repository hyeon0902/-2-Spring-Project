package com.bongsamaru.login.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Data
public class User implements UserDetails {
    // Jwt 전용 설정 (UserDetails 인터페이스 구현)
    
    @Id
    private String kakaoId;

    private String email;
    private String nickname;
    private String profileImageUrl;
	
	
	
    @Column(length = 100, nullable = false, unique = true)
    private String keyCode; // 로그인 식별키

    @ElementCollection(fetch = FetchType.EAGER) //roles 컬렉션
    private List<String> roles = new ArrayList<>();

    @Override   //사용자의 권한 목록 리턴
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles.stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getUsername() {
        return keyCode;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    // Jwt 전용 설정 종료
    
    
    // 그 외 유저의 다른 속성 및 메서드...
  
}