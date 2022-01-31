package com.naresh.JavaTrining.Service;

import java.util.List;

import com.naresh.JavaTrining.Model.JavaTriningModel;

public interface JavaTriningService {
	List<JavaTriningModel> getAllStudentsDetails();
	void saveStudent(JavaTriningModel javaTriningModel);
	JavaTriningModel getStudentById(long id);
    void deleteStudentById(long id);
}
