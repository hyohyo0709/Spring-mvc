package part04;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8090/myapp/mem.htm

@Controller
public class HelloCommandController {

	@RequestMapping(value = "/mem.htm", method = RequestMethod.GET)
	public String form() {
		return "part04/memForm";
	}
	
	
	
//	@RequestMapping(value = "/mem.htm", method = RequestMethod.POST)
//	public ModelAndView submit(String name, String age, ModelAndView mav)  {
//		
//
//		mav.addObject( "name", name);
//		mav.addObject("age", age);
//		mav.setViewName("part04/memPro");
//		return mav;
//	}
	////////////////////////////////////////////////////////////////////////////////////
	
//	view에 대한 값만 넘길 때는 String 타입 메소드로 할 수 있따
	
//	@RequestMapping(value = "/mem.htm", method = RequestMethod.POST)
//	public String submit(MemDTO dto) {
//		
//		
//		return "part04/memPro";
//	}
	
/////////////////////////////////////////////////////////////////////////////////////////////
	
	
	@RequestMapping(value = "/mem.htm", method = RequestMethod.POST)
	public String submit(@ModelAttribute("mdo") MemDTO dto) {
		
		return "part04/memPro";
	}
	
	
	
	
	
}
