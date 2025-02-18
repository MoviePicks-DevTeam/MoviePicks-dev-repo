package com.moviepicks.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "Member")
public class Member {
  @Id
  @GeneratedValue
  private Long memberId;
  private String username;
}