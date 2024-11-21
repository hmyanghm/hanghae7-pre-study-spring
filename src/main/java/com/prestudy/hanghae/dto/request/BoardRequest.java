package com.prestudy.hanghae.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class BoardRequest {

    @Schema(name = "title", example = "제목")
    @NotEmpty(message = "게시글 제목은 필수입니다.")
    private String title;

    @Schema(name = "content", example = "내용입니다.")
    @NotEmpty(message = "게시글 내용은 필수입니다.")
    private String content;
}
