package cn.walnut.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface IHelloService {
	//当使用Feign时，如果发送的是get请求，那么需要在请求参数前加上@RequestParam注解修饰，Controller里面可以不加该注解修饰
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHi(@RequestParam(name = "name") String name);
}
