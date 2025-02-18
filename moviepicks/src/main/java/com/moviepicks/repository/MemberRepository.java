package com.moviepicks.repository;

import com.moviepicks.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
  @PersistenceContext
  EntityManager em;
  public Long save(Member member) {
    em.persist(member);
    return member.getMemberId();
  }
  public Member find(Long id) {
    return em.find(Member.class, id);
  }
}