package com.ip.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: wangzhenya
 * @Date: 19-4-14 下午8:42
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView ipIndex(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ip/ipv1");
        return modelAndView;
    }

    @RequestMapping(value = "/ip", method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("ip");
        return modelAndView;
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public ModelAndView jsonIndex(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("json");
        return modelAndView;
    }

    @RequestMapping(value = "/timestamp", method = RequestMethod.GET)
    public ModelAndView timestampIndex(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("timestamp");
        return modelAndView;
    }

    @RequestMapping(value = "/url", method = RequestMethod.GET)
    public ModelAndView urlencodeIndex(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("url");
        return modelAndView;
    }

    @RequestMapping(value = "/base64", method = RequestMethod.GET)
    public ModelAndView base64Index(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("base64");
        return modelAndView;
    }
}
