package com.linzp.levelingartifact.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linzp.levelingartifact.mapper.QuestionBankQuestionMapper;
import com.linzp.levelingartifact.model.entity.QuestionBankQuestion;
import com.linzp.levelingartifact.service.QuestionBankQuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * '题库题目' COLLATE utf8mb4_unicode_ci service 实现
 *
 * @author linzp
 * @date 2024/12/06 17:15
 **/

@Service("questionBankQuestionService")
@Slf4j
@RequiredArgsConstructor
public class QuestionBankQuestionServiceImpl extends ServiceImpl<QuestionBankQuestionMapper, QuestionBankQuestion> implements QuestionBankQuestionService {



}