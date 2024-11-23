package com.prestudy.hanghae.dto.response;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.ZonedDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CommentResDto {

    private List<DetailDto> list;

    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public static class DetailDto {
        // TODO. Member 생성 후 변경 필요
        // private Member member;
        private String memberName;
        private String content;
        private ZonedDateTime createdAt;
    }
}
