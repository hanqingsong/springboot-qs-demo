package cn.qingsong.springbootswagger2.controller;

import cn.qingsong.springbootswagger2.model.Book;
import cn.qingsong.springbootswagger2.model.User;
import cn.qingsong.springbootswagger2.result.WebResponse;
import com.google.common.collect.Maps;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by hanqingsong on 18/9/27.
 *
 * @author hanqingsong
 * @date 18/9/27
 */
@Controller
@RequestMapping("/book")
public class BookController {


    @ResponseBody
    @GetMapping("/info")
    public WebResponse getInfo(String lid) {
        Map<String, Object> map = Maps.newHashMap();
        return new WebResponse();
    }
    /**
     *  @ApiOperation api接口描述 value方法名描述 notes接口信息描述 tags标签名分组
     *  @ApiImplicitParams api参数说明，描述，类型，是否是必须
     *  @ApiResponses 返回值说明
     *
     *  @ApiModel和@ApiModelProperty
     * @param book
     * @return
     */
    @ApiOperation(value = "添加教材value", notes = "添加教材notes", /*tags = "标签book",*/httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "price", value = "价格", required = true, dataType = "Double"),
            @ApiImplicitParam(name = "repertory", value = "库存", required = true, dataType = "Integer")
    })
    @ApiResponses({
            @ApiResponse(code=200,message="成功",response=WebResponse.class),
    })
    @ResponseBody
    @PostMapping("/save")
    public WebResponse saveInfo(@RequestBody Book book) {
        Map<String, Object> map = Maps.newHashMap();
        return new WebResponse();
    }

}
