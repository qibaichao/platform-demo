package com.cyou.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.cyou.common.utils.DateTypeEditor;
import com.cyou.common.utils.IntegerEditor;

/**
 * 类BaseController.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月22日 下午4:28:43
 */
public class BaseController {

    /**
     * @param request
     * @param binder
     * @throws Exception
     */
    @InitBinder
    protected void initBinder(HttpServletRequest request,
            ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new DateTypeEditor());
        binder.registerCustomEditor(int.class, new IntegerEditor());

    }
}
