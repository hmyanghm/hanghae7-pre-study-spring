package com.prestudy.hanghae.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne @NotNull
    @JoinColumn(name="board_id", foreignKey=@ForeignKey(value=ConstraintMode.NO_CONSTRAINT))
    private Board board;

    @ManyToOne @NotNull
    @JoinColumn(name="member_id", foreignKey=@ForeignKey(value=ConstraintMode.NO_CONSTRAINT))
    private Member member;

    @Column(name = "text")
    private String text;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "is_use")
    private boolean isUse;
}
