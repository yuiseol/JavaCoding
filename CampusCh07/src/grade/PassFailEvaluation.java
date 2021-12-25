package grade;

public class PassFailEvaluation implements GradeEvaluation{

	@Override
	public String getGrade(int point) {
		String grade;
		if(point >= 70) 
			return "P";
		else return "F";
	}

}
