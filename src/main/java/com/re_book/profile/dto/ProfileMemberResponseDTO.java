package com.re_book.profile.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class ProfileMemberResponseDTO {
    private String nickname;
    private String email;
    private LocalDateTime createdAt;
}
