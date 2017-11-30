package cn.walnut.feign.controller;

import cn.walnut.feign.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	IHelloService helloService;

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hello(@RequestParam(value = "name") String name) {
		return helloService.sayHi(name);
	}
}
