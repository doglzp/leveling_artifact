package com.linzp.levelingartifact.controller;

import com.linzp.levelingartifact.service.QuestionBankQuestionService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* '题库题目' COLLATE utf8mb4_unicode_ci controller
*
* @author linzp
* @date 2024/12/06 17:15
**/

@Api(tags = "'题库题目' COLLATE utf8mb4_unicode_ci")
@RestController
@RequestMapping("/questionBankQuestion")
@Slf4j
public class QuestionBankQuestionController {

    @Resource
    private QuestionBankQuestionService questionBankQuestionService;



}