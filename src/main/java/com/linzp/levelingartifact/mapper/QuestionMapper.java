package com.linzp.levelingartifact.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linzp.levelingartifact.model.entity.Question;
import org.apache.ibatis.annotations.Mapper;

/**
 * '题目' COLLATE utf8mb4_unicode_ci mapper
 *
 * @author linzp
 * @date 2024/12/06 14:36
 **/

@Mapper
public interface QuestionMapper extends BaseMapper<Question> {



}