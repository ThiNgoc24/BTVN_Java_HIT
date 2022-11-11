package Bai1;

public class NhanVien extends CanBo{
    protected String congViec;

    public NhanVien( String hoTen, int namSinh, String gioiTinh, String diaChi, String congViec) {
        super( hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public NhanVien(){}

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    public void inputNV(){
        super.input();
        System.out.print("Moi nhap cong viec: ");
        congViec = sc.nextLine();
    }

    public void outputNV(){
        super.output();
        System.out.printf("%-10s\n",congViec);
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "congViec='" + congViec + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
