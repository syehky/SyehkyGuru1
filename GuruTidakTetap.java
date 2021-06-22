public class GuruTidakTetap extends Guru{
    private String nidk;
    private String homeBase;
    private String pekerjaanUtama;


    public void melamar(){

    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public String getHomeBase() {
        return homeBase;
    }

    public void setHomeBase(String homeBase) {
        this.homeBase = homeBase;
    }

    public String getPekerjaanUtama() {
        return pekerjaanUtama;
    }

    public void setPekerjaanUtama(String pekerjaanUtama) {
        this.pekerjaanUtama = pekerjaanUtama;
    }



    @Override
    public void mengajar() {
       System.out.println("Mengajar Online");
    }

    @Override
    public void menampilakanData() {
        System.out.println("Menampilkan Data Materi");
    }


}
