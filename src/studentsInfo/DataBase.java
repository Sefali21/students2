package studentsInfo;

public class DataBase {
    private String name;
    private String division;
    private int studentId;
    private String classId;
    public DataBase(String name, String division, int studentId, String classId){
        this.name=name;
        this.division=division;
        this.studentId=studentId;
        this.classId=classId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    @Override
    public String toString(){
        return "Name: "+name+", Division: "+division+", Student ID: "+studentId+", Klasse ID: "+classId;
    }
}

