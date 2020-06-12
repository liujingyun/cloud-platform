package com.liujy.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "基础返回类", description = "基础返回类")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    @ApiModelProperty(
            example = "10000"
    )
    private Integer code;
    @ApiModelProperty(
            example = "成功，或者失败原因，提示信息"
    )
    private String msg;
    @ApiModelProperty("数据对象")
    private T data;
}
