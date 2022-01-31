package com.naresh.JavaTrining.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.naresh.JavaTrining.Dao.JavaTriningRepository;
import com.naresh.JavaTrining.Model.*;

@Service
public class JavaTriningServiceImpl implements JavaTriningService {
	@Autowired
	JavaTriningRepository javaTriningRepository;
	@Override
	public List<JavaTriningModel> getAllStudentsDetails() {
		
		return javaTriningRepository.findAll();
	}
	@Override
	public void saveStudent(JavaTriningModel javaTriningModel) {
		this.javaTriningRepository.save(javaTriningModel);
		
	}
	@Override
	public JavaTriningModel getStudentById(long id) {
		Optional<JavaTriningModel> optional=javaTriningRepository.findById(id);
		JavaTriningModel javaTriningModel=null;
		if(optional.isPresent()) {
			javaTriningModel=optional.get();
		}else {
			throw new RuntimeException("Student not found id::"+id);
		}
		return javaTriningModel;
	}
	@Override
	public void deleteStudentById(long id) {
		this.javaTriningRepository.deleteById(id);
		
	}
	

}
