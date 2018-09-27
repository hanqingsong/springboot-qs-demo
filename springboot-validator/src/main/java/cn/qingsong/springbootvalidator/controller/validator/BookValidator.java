package cn.qingsong.springbootvalidator.controller.validator;

import cn.qingsong.springbootvalidator.model.Book;
import cn.qingsong.springbootvalidator.model.User;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by hanqingsong on 18/9/25.
 *
 * @author hanqingsong
 * @date 18/9/25
 */
@Component
public class BookValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        boolean equals = Book.class.equals(aClass);
        // return equals;
        return true;
    }

    @Override
    public void validate(@Nullable Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","参数为空");
    }
}
