package studentsInfo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DataBase[] klasse5A=new DataBase[5];
        klasse5A[0]=new DataBase("student 501", "Math", 501, "5A");
        klasse5A[1]=new DataBase("student 502", "Math", 502, "5A");
        klasse5A[2]=new DataBase("student 503", "Math", 503, "5A");
        klasse5A[3]=new DataBase("student 504", "Math", 504, "5A");
        klasse5A[4]=new DataBase("student 505", "Math", 505, "5A");
        IMessage klasse5=new Klasse_5();


        SecondLanguage[] klasse6A=new SecondLanguage[5];
        klasse6A[0]=new SecondLanguage("student 601", "Kunst", 601, "6A ","Spanisch");
        klasse6A[1]=new SecondLanguage("student 602", "Kunst", 602, "6A ", "Französich");
        klasse6A[2]=new SecondLanguage("student 603", "Kunst", 603, "6A ", "Englisch");
        klasse6A[3]=new SecondLanguage("student 604", "Kunst", 604, "6A ","Japanisch");
        klasse6A[4]=new SecondLanguage("student 605", "Kunst", 605, "6A ","Arabish");
        IMessage klasse6=new Klasse_6();


        for (DataBase c:klasse5A ) {
            System.out.println(c);
        }
        klasse5.msg();

        System.out.println("\n");
        for (DataBase c:klasse6A ) {
            System.out.println(c);
        }
        klasse6.msg();

    }
}
