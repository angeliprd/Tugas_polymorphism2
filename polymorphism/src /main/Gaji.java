public class Gaji extends Pegawai {
    private double salary; //gaji tahunan
    Integer x = 2;

    public Gaji (String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary (double newSalary){
        if (newSalary >= 0.0){
            salary = newSalary;
        }
    }
    @Override //polimorfisme
    public void mailCheck(){
        //System.out.println(x);
        System.out.println("Memeriksa kelas gaji dalam surat ");
        System.out.println("Surat tertuju untuk " + getName() + " dengan gaji " + salary);
    }
    public double computePay(){
        System.out.println("menghitung pembayaran gaji untuk " + getName());
        return salary/52;
    }
}