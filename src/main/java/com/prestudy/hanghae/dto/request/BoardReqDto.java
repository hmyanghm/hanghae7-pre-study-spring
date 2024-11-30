package com.prestudy.hanghae.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class BoardReqDto {

    @Schema(name = "title", example = "제목", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "게시글 제목은 필수입니다.")
    private String title;

    @Schema(name = "content", example = "내용입니다.", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty(message = "게시글 내용은 필수입니다.")
    private String content;

    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public static class Update {

        @Schema(name = "id", example = "게시글 id", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "게시글 id는 필수입니다.")
        private long id;

        @Schema(name = "title", example = "제목", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @NotEmpty(message = "게시글 제목은 필수입니다.")
        private String title;

        @Schema(name = "content", example = "내용입니다.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
        @NotEmpty(message = "게시글 내용은 필수입니다.")
        private String content;

        @Schema(name = "password", example = "회원 비밀번호입니다.", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "회원 비밀번호는 필수입니다.")
        private String password;

    }

    @NoArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    @Accessors(chain = true)
    public static class Delete {

        @Schema(name = "id", example = "게시글 id", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "게시글 id는 필수입니다.")
        private long id;

        @Schema(name = "password", example = "회원 비밀번호입니다.", requiredMode = Schema.RequiredMode.REQUIRED)
        @NotEmpty(message = "회원 비밀번호는 필수입니다.")
        private String password;
    }
}
