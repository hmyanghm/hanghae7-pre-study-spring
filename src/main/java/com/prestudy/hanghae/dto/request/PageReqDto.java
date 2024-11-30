package com.prestudy.hanghae.dto.request;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageReqDto {

    private int size = 10;
    private int page = 1;

    public int getPage() {
        return page - 1;
    }
}
