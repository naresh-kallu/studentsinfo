package com.naresh.JavaTrining.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_java_trining")
public class JavaTriningModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "studentName")
	private String studentName;
	@Column(name = "studentCource")
	private String studentCource;
	@Column(name ="studentRollNo"  )
	private long studentRollNo;
	@Column(name = "studentContact")
	private String studentContact;
	@Column(name = "studentEmail")
	private String studentEmail;
	@Column(name = "studentState")
	private String studentState;
	@Column(name = "studentCity")
	private String studentCity;
	@Column(name = "studentDistic")
	private String studentDistic;
	@Column(name = "studentMandal")
	private String studentMandal;
	@Column(name = "studentPincode")
	private String studentPincode;
	@Column(name = "studentFee")
	private String studentFee;
	
	@Column(name = "instutieName")
	private String instutieName;
	
	@Column(name = "trinerId")
	private long trinerId;
	@Column(name = "trinerName")
	private String trinerName;
	@Column(name = "trinerSubject")
	private String trinerSubject;
	@Column(name = "trinerFee")
	private String trinerFee;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCource() {
		return studentCource;
	}
	public void setStudentCource(String studentCource) {
		this.studentCource = studentCource;
	}
	public long getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(long studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public String getStudentContact() {
		return studentContact;
	}
	public void setStudentContact(String studentContact) {
		this.studentContact = studentContact;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentDistic() {
		return studentDistic;
	}
	public void setStudentDistic(String studentDistic) {
		this.studentDistic = studentDistic;
	}
	public String getStudentMandal() {
		return studentMandal;
	}
	public void setStudentMandal(String studentMandal) {
		this.studentMandal = studentMandal;
	}
	public String getStudentPincode() {
		return studentPincode;
	}
	public void setStudentPincode(String studentPincode) {
		this.studentPincode = studentPincode;
	}
	public String getStudentFee() {
		return studentFee;
	}
	public void setStudentFee(String studentFee) {
		this.studentFee = studentFee;
	}
	public String getInstutieName() {
		return instutieName;
	}
	public void setInstutieName(String instutieName) {
		this.instutieName = instutieName;
	}
	public long getTrinerId() {
		return trinerId;
	}
	public void setTrinerId(long trinerId) {
		this.trinerId = trinerId;
	}
	public String getTrinerName() {
		return trinerName;
	}
	public void setTrinerName(String trinerName) {
		this.trinerName = trinerName;
	}
	public String getTrinerSubject() {
		return trinerSubject;
	}
	public void setTrinerSubject(String trinerSubject) {
		this.trinerSubject = trinerSubject;
	}
	public String getTrinerFee() {
		return trinerFee;
	}
	public void setTrinerFee(String trinerFee) {
		this.trinerFee = trinerFee;
	}
	
	
	
	
	
}
