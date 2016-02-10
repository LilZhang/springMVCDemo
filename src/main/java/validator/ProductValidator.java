package validator;

import domain.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by LilZhang on 2016/2/10.
 * Spring Validation
 */
public class ProductValidator implements Validator {
    public boolean supports(Class<?> aClass) {
        return Product.class.isAssignableFrom(aClass);
    }

    public void validate(Object o, Errors errors) {
        Product product = (Product) o;
        ValidationUtils.rejectIfEmpty(errors, "name", "product.name.required");
        ValidationUtils.rejectIfEmpty(errors, "description", "product.description.required");
        ValidationUtils.rejectIfEmpty(errors, "updateTime", "product.updateTime.required");
        ValidationUtils.rejectIfEmpty(errors, "price", "product.price.required");

        Double price = product.getPrice();
        if (price != null && price.doubleValue() < 0d) {
            errors.rejectValue("price", "product.price.negative");
        }
    }
}
