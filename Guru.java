public class Guru {
    private int id;
    private String nidn;
    private String namaLengkap;
    private String npm;
    private String pendidikanterakhir;
    private String tanggalLahir;
    private String Jeniskelamin;
    private String status;
    private String notelp;


    public Guru() {
    }

    public Guru(int id, String nidn, String namaLengkap, String npm, String pendidikanterakhir, String tanggalLahir, String jeniskelamin, String status, String notelp) {
        this.id = id;
        this.nidn = nidn;
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.pendidikanterakhir = pendidikanterakhir;
        this.tanggalLahir = tanggalLahir;
        Jeniskelamin = jeniskelamin;
        this.status = status;
        this.notelp = notelp;
    }

    public Guru(int id, String nidn) {
        this.id = id;
        this.nidn = nidn;
    }

    public void mengajar(){
        System.out.println("Guru mengajar");
    }

    public void menampilakanData(){

    }

    public void melakukanPenelitian(){

    }

    public void mengajukankenaikanJabatanFungsional(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidm(String nidn) {
        this.nidn = nidn;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getPendidikanterakhir() {
        return pendidikanterakhir;
    }

    public void setPendidikanterakhir(String pendidikanterakhir) {
        this.pendidikanterakhir = pendidikanterakhir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJeniskelamin() {
        return Jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        Jeniskelamin = jeniskelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
    }
}
