package com.prestudy.hanghae.member;

import com.prestudy.hanghae.common.exception.CustomException;
import com.prestudy.hanghae.common.exception.ErrorCode;
import com.prestudy.hanghae.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public Member getById(long id) {
        Optional<Member> member = memberRepository.findById(id);
        if (member.isEmpty()) {
            throw new CustomException(ErrorCode.MEMBER_NOT_FOUND);
        }
        return member.get();
    }

    @Override
    public void isCorrectPassword(long id, String password) {

        Member member = getById(id);

        if (!member.getPassword().equals(password)) {
            throw new CustomException(ErrorCode.UNAUTHORIZED);
        }
    }

    public String getMemberName(long id) {
        return getById(id).getName();
    }
}
