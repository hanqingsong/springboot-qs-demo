package cn.qingsong.springbootswagger2.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by hanqingsong on 18/9/25.
 *
 * @author hanqingsong
 * @date 18/9/25
 */
@ApiModel(value="Book对象",description="Book对象说明")
public class Book {
    @ApiModelProperty(name = "name",value = "书名",required = true,example = "测试书名")
    private String name;
    @ApiModelProperty(name = "price",value = "价格",required = true,example = "2.1")
    private double price;
    @ApiModelProperty(name = "repertory",value = "价格",required = true,example = "1")
    private Integer repertory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
}
