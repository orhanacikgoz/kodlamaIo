package homework.dataAccess;

import homework.entities.Category;
import homework.entities.Course;
import homework.entities.Instructor;

public class HibernateDao implements InstructorDao, CategoryDao, CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("kurs hibernate ile kaydedildi");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("kategori hibernate ile kaydedildi");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("egitmen hibernate ile kaydedildi");
		
	}

}
