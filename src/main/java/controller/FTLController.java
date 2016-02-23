package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by LilZhang on 2016/2/18.
 */
@Controller
public class FTLController {
    private static final Log logger = LogFactory.getLog(FTLController.class);

    @RequestMapping(value = "/show")
    public ModelAndView showFTL() {
        ModelAndView mv = new ModelAndView("hello2");
        mv.addObject("title", "FTL title");
        mv.addObject("content", "FTL content");
        logger.info("showFTL called");
        return mv;
    }
}
