public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int yılZam = 0;

    public Employee(String name,int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public int tax(){
        if(salary >= 1000){
            int tax = salary / 100;
            return (tax * 3);
        }else{
            return  0;
        }
    }

    public int bonus(){
        if(this.workHours > 40){
            int bonus = this.workHours - 40;
            int bonusMoney = bonus * 30;
            return bonusMoney;
        }
        else return 0;
    }

    void kidem(){
        int zam = 0;
        int yıl = 2021 - hireYear;
        if(yıl < 10){
            zam = (this.salary / 100) * 5;
        } else if (yıl > 9 && yıl < 20) {
            zam = (this.salary / 100) * 10;
        } else if (yıl > 19) {
            zam = (this.salary / 100) * 15;
        }
        System.out.println(zam);
        this.yılZam += zam;
    }
    public int hesap(){
        return ((bonus() - tax()) + yılZam + salary);
    }

    void empInfo(){
        System.out.println("Adı \t\t\t:"+this.name);
        System.out.println("Maaşı \t\t\t:"+this.salary);
        System.out.println("Çalışma saati \t:"+this.workHours);
        System.out.println("Başlangıç yılı \t:" + this.hireYear);
        System.out.print("Vergi \t\t\t:" + tax());
        System.out.println();
        System.out.print("Bonus \t\t\t:" + bonus());
        System.out.println();
        System.out.print("Yıl zammı \t\t:");kidem();
        System.out.println("Veri ve bonus ile maaş \t:"+ ((bonus() - tax()) + salary) );
        System.out.println("Toplam maaş \t:" + hesap());
    }


}
