package com.dar.encode.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author wx
 * @since 2023-02-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Video对象", description="")
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long id;

    @ApiModelProperty(value = "视频标题")
    private String title;

    @ApiModelProperty(value = "视频作者id")
    private Long userId;

    @ApiModelProperty(value = "视频播放地址")
    private String playUrl;

    @ApiModelProperty(value = "视频封面地址")
    private String coverUrl;

    @ApiModelProperty(value = "视频的哈希值")
    private String hashCode;

    @ApiModelProperty(value = "视频清晰度")
    private String resolution;

    @ApiModelProperty(value = "视频大小，单位KB")
    private Integer size;

    @ApiModelProperty(value = "视频时长，单位秒")
    private Integer duration;

    @ApiModelProperty(value = "视频的点赞总数")
    private Integer favoriteCount;

    @ApiModelProperty(value = "视频的评论总数")
    private Integer commentCount;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "逻辑删除 0：未删除，1：已删除")
    private Integer deleted;


}
