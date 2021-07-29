package com.vaccinelife.vaccinelifeapi.dto;

import com.vaccinelife.vaccinelifeapi.model.VBoard;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VBoardRequestDto {
    private String title;
    private String contents;
    private String nickname;
    private int hits;
    private int commentCount;
    private Long userId;
    private Long surveyId;
    private int likeCount;

    public static VBoardRequestDto of(VBoard vBoard){
        return VBoardRequestDto.builder()
                .title(vBoard.getTitle())
                .contents(vBoard.getContents())
                .nickname(vBoard.getUser().getNickname())
                .hits(vBoard.getHits())
                .commentCount(vBoard.getCommentCount())
                .likeCount(vBoard.getLikeCount())
                .userId(vBoard.getUser().getId())
                .surveyId(vBoard.getSurvey().getId()).build();
    }
}