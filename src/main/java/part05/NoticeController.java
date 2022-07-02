package part05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/*
 * <bean class="part05.NoticeController">
 * <property name="noticeservice" ref="noticeService"/>
 * </bean>
 * 
 */


@Controller
public class NoticeController {

	@Autowired
	private NoticeService noticeservice;
	
	public void setNoticeservice(NoticeService noticeservice) {
		this.noticeservice = noticeservice;
	}
	
	
//	http://localhost:8090/myapp/
	@RequestMapping(value = "/")
	public String home() {
		return "part05/Notice";
	} 
	
	
//	http://localhost:8090/myapp/proc
	@RequestMapping(value = "proc")
	public String inputProc(String name, String message) {
		System.out.println(name + ":" + message);
		noticeservice.process();
		return "part05/Notice";
	}
	
	@RequestMapping(value = "dataJson")
	public @ResponseBody String dataProc(String data1, String data2) {
		JsonObject obj = new JsonObject();
		obj.addProperty("data1", data1);
		obj.addProperty("data2", data2);
		return new Gson().toJson(obj); //{"data1":data1, "data2":data2}
	}
	
	
}


