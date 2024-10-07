package org.community.moyoyoung.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
// 김용
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostMiniDTO {

    private Long id;
    private String title;
    private LocalDateTime dueDate;
    private String userNickname;
    private String name;

}
