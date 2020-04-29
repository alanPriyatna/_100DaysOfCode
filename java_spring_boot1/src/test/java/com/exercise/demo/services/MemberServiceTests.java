package com.exercise.demo.services;

import com.exercise.demo.repositories.MemberRepository;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)
public class MemberServiceTests {
    
    @InjectMocks
    MemberService memberService;

    @Mock
    MemberRepository memberRepository;

    @Test
    @DisplayName("should print 3 when the numbers are  1 and 2")
    public void deleteMemberTrue() {
        when(memberRepository.addition(1, 2)).thenReturn(3);
        int number1 = 1;
        int number2 = 2;

        assertEquals(3, memberService.addition(number1, number2));
    }

}