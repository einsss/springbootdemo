package com.study.domain.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequest {

    private Long id;             // PK
    private String title;        // ����
    private String content;      // ����
    private String writer;       // �ۼ���
    private Boolean noticeYn;    // ������ ����
    
}