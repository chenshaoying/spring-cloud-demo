package cn.walnut.ribbon.controller;

import cn.walnut.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping(path="/hi", method = RequestMethod.GET)
	public String hi(@RequestParam(name = "name") String name) {
		return helloService.sayHi(name);
	}
}
