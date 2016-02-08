package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LilZhang on 2016/2/8.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    private static final Log logger = LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/input")
    public String inputProduct() {
        logger.info("product input called");
        return "productInput";
    }

    @RequestMapping(value = "/save")
    public String saveProduct() {
        logger.info("product save called");
        return "productDetail";
    }
}
