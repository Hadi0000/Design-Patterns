package course_student_teacher;

public class SE506 extends ICourse{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Course no is SE506");
	}

	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		ITeacher teach = new SETeacher();
		teach.one();
	}

	public void student() {
		// TODO Auto-generated method stub
		IStudent learner = new Student1();
		learner.whoAreYou();
	}
	
}
