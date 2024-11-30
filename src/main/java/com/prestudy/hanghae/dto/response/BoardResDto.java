package com.prestudy.hanghae.dto.response;

import com.prestudy.hanghae.entity.Member;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;
import java.util.List;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BoardResDto extends PageResDto {

    private List<DetailDto> list;

    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public static class DetailDto {

        private String memberName;
        private String title;
        private String content;
        private ZonedDateTime createdAt;
        private boolean isUse;
    }

}
