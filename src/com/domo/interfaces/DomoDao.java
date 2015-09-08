package com.domo.interfaces;
import java.util.List;

import com.domo.pojo.Question;
import com.domo.pojo.SetExam;
import com.domo.pojo.Template;
import com.domo.pojo.TemplateQuestion;
import com.domo.pojo.User;
public interface DomoDao {
	public void addUser(User user);
	List<String> signinUser(int userid, String password);
	public List<User> getAllCandidatesFromDatabase();
	public List<SetExam> getCandidateByIdFromDatabase(int id);
	public List<SetExam> getCandidateByIdNotConductedFromDatabase(String id);
	public List<SetExam> getAllExams();
	public void createExam(SetExam setexam);
	public SetExam showExam(int id);
	public void editExamService(SetExam setexam);
	public List<User> getAllStudents();
	public List<Template> getAllTemplates();
	public void setExam(SetExam setexam);
	public void newExam(SetExam setexam);
	public List<SetExam> getAllExamsStudent(int exam_id);
	public List<Question> getQuestions(int examid);
	public List<SetExam> getDurations(int examid);
	public void putMarkService(SetExam setexam);
	public void putAnswerService(TemplateQuestion template);
}