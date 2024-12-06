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
 * '题目' COLLATE utf8mb4_unicode_ci
 *
 * @author linzp
 * @date 2024/12/06 14:36
 **/

@ApiModel(description = "'题目' COLLATE utf8mb4_unicode_ci")
@TableName("question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question implements Serializable {

    private static final long serialVersionUID = 1864921952818401280L;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    @TableId(type = IdType.ASSIGN_ID)
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String content;

    /**
     * 标签列表（json 数组）
     */
    @ApiModelProperty(value = "标签列表（json 数组）")
    private String tags;

    /**
     * 推荐答案
     */
    @ApiModelProperty(value = "推荐答案")
    private String answer;

    /**
     * 创建用户 id
     */
    @ApiModelProperty(value = "创建用户 id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;

    /**
     * 状态：0-待审核, 1-通过, 2-拒绝
     */
    @ApiModelProperty(value = "状态：0-待审核, 1-通过, 2-拒绝")
    private Integer reviewStatus;

    /**
     * 审核信息
     */
    @ApiModelProperty(value = "审核信息")
    private String reviewMessage;

    /**
     * 审核人 id
     */
    @ApiModelProperty(value = "审核人 id")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long reviewerId;

    /**
     * 审核时间
     */
    @ApiModelProperty(value = "审核时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime reviewTime;

    /**
     * 浏览量
     */
    @ApiModelProperty(value = "浏览量")
    private Integer viewNum;

    /**
     * 点赞数
     */
    @ApiModelProperty(value = "点赞数")
    private Integer thumbNum;

    /**
     * 收藏数
     */
    @ApiModelProperty(value = "收藏数")
    private Integer favourNum;

    /**
     * 优先级
     */
    @ApiModelProperty(value = "优先级")
    private Integer priority;

    /**
     * 仅会员可见（1 表示仅会员可见）
     */
    @ApiModelProperty(value = "仅会员可见（1 表示仅会员可见）")
    private Integer needVip;

    /**
     * 编辑时间
     */
    @ApiModelProperty(value = "编辑时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime editTime;

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

    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除")
    @TableLogic
    private Integer isDelete;

}