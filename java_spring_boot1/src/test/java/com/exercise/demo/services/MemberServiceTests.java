package com.exercise.demo.services;

import com.exercise.demo.services.MemberService;
import com.exercise.demo.models.Member;
import com.exercise.demo.repositories.MemberRepository;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Before;

public class MemberServiceTests {
    MemberService memberService;

    @Before
    public void init() {
        memberService = new MemberService();
    }

    @Test
    public void deleteMemberTrue() {
        MemberRepository memberRepository = mock(MemberRepository.class);
        when(memberRepository.findById(1)).thenReturn(memberReturnValue);
    }

}