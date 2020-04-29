package com.exercise.demo.repositories;


import com.exercise.demo.models.Member;
import com.exercise.demo.repositories.implementation.MemberRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


interface MemberRepositoryJpa
       extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}

@Repository("memberRepository")
public interface MemberRepository extends MemberRepositoryJpa, MemberRepositoryCustom {}
