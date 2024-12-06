package com.linzp.levelingartifact.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.linzp.levelingartifact.mapper.QuestionBankMapper;
import com.linzp.levelingartifact.model.entity.QuestionBank;
import com.linzp.levelingartifact.service.QuestionBankService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * '题库' COLLATE utf8mb4_unicode_ci service 实现
 *
 * @author linzp
 * @date 2024/12/06 17:07
 **/

@Service("questionBankService")
@Slf4j
@RequiredArgsConstructor
public class QuestionBankServiceImpl extends ServiceImpl<QuestionBankMapper, QuestionBank> implements QuestionBankService {



}