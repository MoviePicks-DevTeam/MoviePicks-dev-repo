package com.moviepicks.domain;

import static com.moviepicks.status.MemberStatus.USER;

import com.moviepicks.status.MemberStatus;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "member")
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id", nullable = false, updatable = false)
  private Long memberId;

  @Column(name = "nickname", nullable = false, unique = true)
  private String nickname;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  // 소셜 로그인 제공자
  // 넣을꺼?
//  @Column(name = "provider")
//  private String provider;

  // orphanRemoval = true : "부모 엔티티가 삭제되면 자식 엔티티도 삭제"
  // cascade = CascadeType.ALL : "부모 엔티티에 수행된 작업(저장, 삭제 등)을 자식 엔티티에도 적용"
  @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Favorite> favorites;

  @Column(name = "status", nullable = false)
  @Enumerated(EnumType.STRING)
  private MemberStatus status;

  @Column(name = "create_date", nullable = false, updatable = false)
  private LocalDateTime createDate;

  public Member() {
    this.status = USER;
    this.createDate = LocalDateTime.now();
  }

}