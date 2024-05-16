import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.BossDao;
import com.spring.dao.PostDaoImpl;
import com.spring.dao.Student;

public class MainAop {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext an = 
				new AnnotationConfigApplicationContext(SpringContainer.class);
		Student st = an.getBean("student1", Student.class);
		BossDao po = an.getBean("postDaoImpl", BossDao.class);
		po.allPosts();
		po.allPosts();

	}

}
