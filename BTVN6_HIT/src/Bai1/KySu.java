package Bai1;

public class KySu extends CanBo{
    protected String ngangDaoTao;

    public KySu( String hoTen, int namSinh, String gioiTinh, String diaChi, String ngangDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.ngangDaoTao = ngangDaoTao;
    }

    public KySu(){

    }

    public String getNgangDaoTao() {
        return ngangDaoTao;
    }

    public void setNgangDaoTao(String ngangDaoTao) {
        this.ngangDaoTao = ngangDaoTao;
    }

    public void inputKS(){
        super.input();
        System.out.print("Moi nhap vao nganh dao tao: ");
        ngangDaoTao = sc.nextLine();
    }

    public void outputKS(){
        super.output();
        System.out.printf("%-10s\n",ngangDaoTao);
    }

    @Override
    public String toString() {
        return "KySu{" +
                "ngangDaoTao='" + ngangDaoTao + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
