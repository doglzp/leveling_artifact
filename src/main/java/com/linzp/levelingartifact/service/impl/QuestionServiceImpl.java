package com.linzp.levelingartifact.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linzp.levelingartifact.mapper.QuestionMapper;
import com.linzp.levelingartifact.model.entity.Question;
import com.linzp.levelingartifact.service.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * '题目' COLLATE utf8mb4_unicode_ci service 实现
 *
 * @author linzp
 * @date 2024/12/06 14:36
 **/

@Service("questionService")
@Slf4j
@RequiredArgsConstructor
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {



}