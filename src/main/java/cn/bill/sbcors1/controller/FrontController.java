package cn.bill.sbcors1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午3:07:08 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/front")
@Controller
public class FrontController
{
	
	@RequestMapping("test1")
	@ResponseBody
	public String test1(String name)
	{
		System.out.println("FrontController...test1()");
		
		return name;
	}

}
