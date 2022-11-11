package Bai1;

public class CongNhan extends CanBo{
    protected int bac;

    public CongNhan( String hoTen, int namSinh, String gioiTinh, String diaChi, int bac) {
        super( hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan(){}

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }


    public void inputCN(){
        super.input();
        System.out.print("Moi nhap vao cap bac cua cong nhan: ");
        bac = sc.nextInt();
        while (bac <= 0 || bac > 7){
            System.out.print("Moi nhap lai cap bac cua cong nhan(bac/7): ");
            bac = sc.nextInt();
        }
        sc.nextLine();
    }

    public void outputCN(){
        super.output();
        System.out.printf("%-10d\n",bac);
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "bac=" + bac +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
