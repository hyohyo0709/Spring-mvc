package part05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*
 * <bean id="noticeservice" class="part05.NoticeService">
 * <property name="noticeDAO" ref="noticeDAO"/>
 * </bean>
 * 
 */

@Service(value = "noticeservice")
public class NoticeService {

	@Autowired
	private NoticeDAO noticedao;
	
	@Autowired
	private MySample mysample;
	
	public void setNoticedao(NoticeDAO noticedao) {
		this.noticedao = noticedao;
	}
	
	
	public void process() {
		System.out.println("NoticeService process()");
		mysample.func();
		noticedao.getAllData();
	}
	
	
}
