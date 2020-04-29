package com.exercise.demo.services;

import com.exercise.demo.models.Member;
import com.exercise.demo.repositories.MemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("memberService")
public class MemberService {
   @Autowired
   private MemberRepository memberRepository;

   public Member findMemberByEmail(String email) {
       return memberRepository.findByEmail(email);
   }

   public List<Member> getAllMembers() {
       return memberRepository.findAll();
   }

   public Member saveMember(Member member) {
       return memberRepository.save(member);
   }

   public Member updateMember(Member member, Long id) {
     Member updateMember = memberRepository.findById(id).orElse(null);
     if(updateMember != null) {
         updateMember.setFirstName(member.getFirstName());
         updateMember.setLastName(member.getLastName());
     }
     final Member mymember = memberRepository.save(updateMember);
     return mymember;
   }

   public Boolean deleteMember (Long id) {
      Member delMember  = memberRepository.findById(id).orElse(null);
      if(delMember != null) {
          memberRepository.delete(delMember);
          return true;
      }
      return false;
   }

   public int addition(int number1, int number2) {
        // System.out.println(memberRepository.addition(1, 2));
       System.out.println("asdf");
       return memberRepository.addition(number1, number2);
   }
}