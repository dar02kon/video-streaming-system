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
@ApiModel(value="Chunk对象", description="")
public class Chunk implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private Long id;

    @ApiModelProperty(value = "对应的视频id")
    private Long videoId;

    @ApiModelProperty(value = "分片的哈希值")
    private String hashCode;

    @ApiModelProperty(value = "切片开始字节")
    private Long startByte;

    @ApiModelProperty(value = "切片结束字节")
    private Long endByte;

    @ApiModelProperty(value = "切片创建时间")
    private Date createTime;


}
