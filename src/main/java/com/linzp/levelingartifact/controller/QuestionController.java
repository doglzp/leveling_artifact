package com.linzp.levelingartifact.controller;

import com.linzp.levelingartifact.service.QuestionService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * '题目' COLLATE utf8mb4_unicode_ci controller
 *
 * @author linzp
 * @date 2024/12/06 14:36
 **/

@Api(tags = "'题目' COLLATE utf8mb4_unicode_ci")
@RestController
@RequestMapping("/question")
@Slf4j
public class QuestionController {

    @Resource
    private QuestionService questionService;



}