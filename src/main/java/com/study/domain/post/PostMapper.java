package com.study.domain.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    /**
     * �Խñ� ����
     * @param params - �Խñ� ����
     */
    void save(PostRequest params);

    /**
     * �Խñ� ������ ��ȸ
     * @param id - PK
     * @return �Խñ� ������
     */
    PostResponse findById(Long id);
    
    /**
     * �Խñ� ����
     * @param params - �Խñ� ����
     */
    void update(PostRequest params);

    /**
     * �Խñ� ����
     * @param id - PK
     */
    void deleteById(Long id);

    /**
     * �Խñ� ����Ʈ ��ȸ
     * @return �Խñ� ����Ʈ
     */
    List<PostResponse> findAll();

    /**
     * �Խñ� �� ī����
     * @return �Խñ� ��
     */
    int count();

}