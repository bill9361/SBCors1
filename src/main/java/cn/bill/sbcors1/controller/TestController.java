package cn.bill.sbcors1.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bill.sbcors1.entity.Person;

/**
 * Description: <br/>
 * Date:2018年8月6日 下午2:18:13 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@RequestMapping("/test")
@Controller
public class TestController
{

	@RequestMapping("/test1.do")
	@ResponseBody
	public Map<String, Object> test1(/*@RequestParam("name") */String name)
	{
		System.out.println("TestController...test1()");
		System.out.println("name:"+name);
		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("name", name);
		
		Person p = new Person();
		p.setId(UUID.randomUUID().toString());
		p.setName("张三");
		dataMap.put("person", p);
		
		return dataMap;
	}
}
