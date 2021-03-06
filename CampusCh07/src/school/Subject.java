package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	private int subjectId;
	private String subjectName;
	private int gradeType;
	
	//수강 신청한 학생 리스트 
	ArrayList<Student> studentList = new ArrayList<>();

	public Subject(String subjectName, int subjectId) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE; //기본적으로 A, B type
	}
	public void register(Student student) { //수강신청
		studentList.add(student);
	}
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
