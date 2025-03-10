package com.moviepicks.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Data
@Table(name = "review_board")
public class ReviewBoard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "review_board_id", nullable = false, updatable = false)
  private Long reviewBoardId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "member_id")
  private Member member;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "board_content", nullable = false)
  private String boardContent;

  @Column(name = "point", nullable = false)
  private int point;

  @Column(name = "board_create_date", nullable = false, updatable = false)
  private LocalDateTime boardCreateDate;

  public ReviewBoard() {
    this.boardCreateDate = LocalDateTime.now();
  }
}