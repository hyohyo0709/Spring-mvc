package part05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//<bean id="noticedao" class="part05.NoticeDAO">

@Repository("noticeDAO")
public class NoticeDAO {

	public List<NoticeDAO> getAllData(){
		System.out.println("NoticeDAO getAllData");
		return new ArrayList<NoticeDAO>();
	}
}
