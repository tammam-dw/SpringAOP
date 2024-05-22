import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.BossDao;
import com.spring.dao.PostDaoImpl;
import com.spring.dao.PostService;
import com.spring.dao.Student;

public class MainAop {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Student st = an.getBean("student1", Student.class);
		BossDao po = an.getBean("postDaoImpl",BossDao.class);
		PostService pos = an.getBean("postServiceImpl", PostService.class);
		po.allPosts();
		System.out.println(po.allLikes());
		System.out.println("//////");
		System.out.println(pos.allPosts());
		

	}

}
