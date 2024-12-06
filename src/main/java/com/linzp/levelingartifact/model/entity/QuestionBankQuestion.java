package com.linzp.levelingartifact.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * '题库题目' COLLATE utf8mb4_unicode_ci
 *
 * @author linzp
 * @date 2024/12/06 17:15
 **/

@ApiModel(description = "'题库题目' COLLATE utf8mb4_unicode_ci")
@TableName("question_bank_question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuestionBankQuestion implements Serializable {

    private static final long serialVersionUID = 1864961853856194560L;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    @TableId(type = IdType.ASSIGN_ID)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 题库 id
     */
    @ApiModelProperty(value = "题库 id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long questionBankId;

    /**
     * 题目 id
     */
    @ApiModelProperty(value = "题目 id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long questionId;

    /**
     * 创建用户 id
     */
    @ApiModelProperty(value = "创建用户 id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

}