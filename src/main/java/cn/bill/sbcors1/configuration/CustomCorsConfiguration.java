package cn.bill.sbcors1.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Description: 自定义跨域访问Cors支持配置<br/>
 * Date:2018年8月6日 下午2:00:39 <br/>
 *
 * @author fengminbiao@126.com
 * @version
 */
@Configuration
public class CustomCorsConfiguration implements WebMvcConfigurer
{

	/**
	 * 增加允许跨域（两个不同服务器之间）访问的URL
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry)
	{
		//允许http://localhost:8089的服务器发出请求，访问本服务器的/test/下的Controller
		registry.addMapping("/test/**").allowedOrigins("http://localhost:8098");
	}

}
