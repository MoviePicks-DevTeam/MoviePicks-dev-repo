package com.moviepicks.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "review_board_comment")
public class ReviewBoardComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "comment_id", nullable = false, updatable = false)
  private Long commentId;

  @Column(name = "comment_content", nullable = false)
  private String commentContent;

  @Column(name = "comment_created_date", nullable = false, updatable = false)
  private LocalDateTime commentCreatedDate;

  @ManyToOne
  @JoinColumn(name = "member_id", nullable = false)
  private Member member;

//  @ManyToOne
//  @JoinColumn(name = "review_board_id")
//  private ReviewBoard reviewBoard;

  public ReviewBoardComment() {
    this.commentCreatedDate = LocalDateTime.now();
  }

}
