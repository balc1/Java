public class Student {
    String name,Stno;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int fizikSozlu = 0;
    int kimyaSozlu = 0;
    int matSozlu = 0;

    Student(String name,String stno,int classes,Course mat,Course fizik, Course kimya){
        this.name = name;
        this.Stno = stno;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya,int matSozlu, int fizikSozlu,int kimyaSozlu){

        if (mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
        if (matSozlu >= 0 && matSozlu <= 100){
            this.matSozlu = matSozlu;
        }
        if (fizikSozlu >= 0 && fizikSozlu <= 100){
            this.fizikSozlu = fizikSozlu;
        }
        if (kimyaSozlu >= 0 && kimyaSozlu <= 100){
            this.kimyaSozlu = kimyaSozlu;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matAvarage = (matSozlu*0.20) + (mat.note*0.80);
        double fizikAvarage = (fizikSozlu*0.20) + (fizik.note*0.80);
        double kimyaAvarage = (kimyaSozlu*0.20) + (kimya.note*0.80);
        this.avarage = (matAvarage + kimyaAvarage + fizikAvarage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + matSozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + fizikSozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + kimyaSozlu);
    }

}





