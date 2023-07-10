package studentsInfo;

public class SecondLanguage extends DataBase{
    private String secondLanguage;

    public SecondLanguage(String name, String division, int studentId, String classId, String secondLanguage) {
        super(name, division, studentId, classId);
        this.secondLanguage=secondLanguage;
    }


    public String getSecondLanguage() {
        return secondLanguage;
    }

    public void setSecondLanguage(String secondLanguage) {
        this.secondLanguage = secondLanguage;
    }

    @Override
    public String toString(){
        return "Name: "+getName()+", Division: "+getDivision()+", Student ID: "+getStudentId()+
                ", Klasse ID: "+getClassId()+"Second Language: "+secondLanguage;
    }
}
