package com.prestudy.hanghae.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageResDto {

    @Builder.Default
    private int size = 10;

    @Builder.Default
    private int page = 1;

    private int totalPage;

    private long totalCount;

    public int getPage() {
        return page + 1;
    }
}
