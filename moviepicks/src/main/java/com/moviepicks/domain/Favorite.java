package com.moviepicks.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Table(name = "favorite")
//즐겨찾기 테이블
public class Favorite {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "favorite_id", nullable = false, updatable = false)
  private Long favoriteId;

  // 여러 즐겨찾기가 하나의 유저를 가짐
  @ManyToOne
  @JoinColumn(name = "member_id", nullable = false)
  private Member member;

  @Column(name = "movie_id", nullable = false)
  private Long movieId; // 즐겨찾기한 영화 ID

  public Favorite(Member member ,Long movieId) {
    this.member = member;
    this.movieId = movieId;
  }
}