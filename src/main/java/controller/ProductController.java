package controller;

import domain.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import validator.ProductValidator;

import java.util.Date;

/**
 * Created by LilZhang on 2016/2/8.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/input")
    public String inputProduct(Model model) {
        logger.info("product input called");
        model.addAttribute("product", new Product());
        return "productInput";
    }

    @RequestMapping(value = "/save")
    public String saveProduct(@ModelAttribute Product product, BindingResult bindingResult) {
        logger.info("product save called");

        // validation method
        ProductValidator productValidator = new ProductValidator();
        productValidator.validate(product, bindingResult);

        if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            logger.info("code : " + fieldError.getCode() + ", field : " + fieldError.getField());
            return "productInput";
        }
//        product.setUpdateTime(new Date());
        return "productDetail";
    }

    @RequestMapping(value = "/test")
    public  String testJquery(Model model) {
        model.addAttribute("tests", "hello");
        return "productTest";
    }

    //another way of validation
    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(new ProductValidator());
        binder.validate();
    }*/
}
