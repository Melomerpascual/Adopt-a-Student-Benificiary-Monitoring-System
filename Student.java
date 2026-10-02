class Student extends Person{
private String college;
private String program;
private String section;
private String year;

Student(String lastname,String firstname,String middlename,String username,String password,int age,int contactnumber,String college ,String program,String section,String year){
super( lastname,firstname,middlename,username,password,age,contactnumber);
this.college=college;
this.program=program;
this.section=section;
this.year=year;
}
 





}