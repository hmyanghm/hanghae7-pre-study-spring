package com.prestudy.hanghae.member;

import com.prestudy.hanghae.entity.Member;


public interface MemberService {

    Member getById(long id);
    void isCorrectPassword(long id, String password);

    String getMemberName(long id);
}
