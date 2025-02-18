package com.moviepicks.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "Member")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id", nullable = false, updatable = false)
  private Long memberId;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  // 소셜 로그인 제공자
  // 넣을꺼?
  @Column(name = "provider")
  private String provider;

  // orphanRemoval = true : "부모 엔티티가 삭제되면 자식 엔티티도 삭제"
  // cascade = CascadeType.ALL : "부모 엔티티에 수행된 작업(저장, 삭제 등)을 자식 엔티티에도 적용"
  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Favorite> favorites;

//  @Column(name = "status", nullable = false)
//  @Enumerated(EnumType.STRING)
//  private MemberStatus status;

//  public member() {
//    this.status = MemberStatus.ACTIVE;
//  }

}