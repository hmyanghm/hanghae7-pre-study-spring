package com.prestudy.hanghae.member;

import com.prestudy.hanghae.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberTest {

    @Test
    @DisplayName("중복 회원 생성 확인")
    void create_duplicate_member() {
        Member member = new Member();
    }
}
