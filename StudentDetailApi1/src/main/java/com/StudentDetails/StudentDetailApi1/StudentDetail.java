package com.StudentDetails.StudentDetailApi1;

public class StudentDetail
{
    private String StudentName;
    private String RollNo;
    private String Uid;
    private String Department;

    public StudentDetail()
    {
    }

    public StudentDetail(String studentName, String rollNo, String uid, String department)
    {
        StudentName = studentName;
        RollNo = rollNo;
        Uid = uid;
        Department = department;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = rollNo;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
