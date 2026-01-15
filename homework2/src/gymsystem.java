interface memberfeecalculator {
    double calculatefinalFee();
}
class normalmember implements memberfeecalculator {
    private double monthFee;
    private int months;
    private double zhekou;
    
    public normalmember(double monthFee, int months, double zhekou) {
        this.monthFee = monthFee;
        this.months = months;
        this.zhekou = zhekou;
    }

    @Override
    public double calculatefinalFee() {
        return monthFee * months * zhekou;
    }
}
class yearmember implements memberfeecalculator {
    private double yearFee;
    private double butie;
    private double zhekou;
    
    public yearmember(double yearFee, double butie, double zhekou) {
        this.yearFee = yearFee;
        this.butie = butie;
        this.zhekou = zhekou;
    }

    @Override
    public double calculatefinalFee() {
        return (yearFee - butie) * zhekou;
    }
}
class timemember implements memberfeecalculator {
    private double timeFee;
    private int times;
    
    public timemember(double timeFee, int times) {
        this.timeFee = timeFee;
        this.times = times;
    }

    @Override
    public double calculatefinalFee() {
        return timeFee * times;
    }
}
public class gymsystem {
    public static void main(String[] args) {
        memberfeecalculator member1;
        memberfeecalculator member2;
        memberfeecalculator member3;

        member1 = new normalmember(150.0, 6, 0.95);
        member2 = new yearmember(1800.0, 200.0, 0.8);
        member3 = new timemember(30.0, 20);

        System.out.println("Normal Member Final Fee: " + member1.calculatefinalFee());
        System.out.println("Year Member Final Fee: " + member2.calculatefinalFee());
        System.out.println("Time Member Final Fee: " + member3.calculatefinalFee());
    }
}
