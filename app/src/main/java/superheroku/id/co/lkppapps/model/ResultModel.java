
package superheroku.id.co.lkppapps.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultModel {

    @SerializedName("tanggal_terakhir_di_update")
    @Expose
    private Integer tanggalTerakhirDiUpdate;
    @SerializedName("kode_kldi")
    @Expose
    private String kodeKldi;
    @SerializedName("id_satker")
    @Expose
    private Integer idSatker;
    @SerializedName("kode_satker_asli")
    @Expose
    private String kodeSatkerAsli;
    @SerializedName("jenis")
    @Expose
    private String jenis;
    @SerializedName("kldi")
    @Expose
    private String kldi;
    @SerializedName("kode_rup")
    @Expose
    private Integer kodeRup;
    @SerializedName("nama_satker")
    @Expose
    private String namaSatker;
    @SerializedName("nama_paket")
    @Expose
    private String namaPaket;
    @SerializedName("volume")
    @Expose
    private String volume;
    @SerializedName("pagu_rup")
    @Expose
    private Integer paguRup;
    @SerializedName("mak")
    @Expose
    private String mak;
    @SerializedName("lokasi")
    @Expose
    private String lokasi;
    @SerializedName("detail_lokasi")
    @Expose
    private String detailLokasi;
    @SerializedName("sumber_dana")
    @Expose
    private String sumberDana;
    @SerializedName("metode_pemilihan")
    @Expose
    private String metodePemilihan;
    @SerializedName("jenis_pengadaan")
    @Expose
    private String jenisPengadaan;
    @SerializedName("awal_pengadaan")
    @Expose
    private String awalPengadaan;
    @SerializedName("akhir_pengadaan")
    @Expose
    private String akhirPengadaan;
    @SerializedName("awal_pekerjaan")
    @Expose
    private String awalPekerjaan;
    @SerializedName("akhir_pekerjaan")
    @Expose
    private String akhirPekerjaan;
    @SerializedName("spesifikasi")
    @Expose
    private String spesifikasi;
    @SerializedName("penyedia_didalam_swakelola")
    @Expose
    private String penyediaDidalamSwakelola;
    @SerializedName("id_swakelola")
    @Expose
    private Object idSwakelola;
    @SerializedName("tkdn")
    @Expose
    private String tkdn;
    @SerializedName("pradipa")
    @Expose
    private String pradipa;
    @SerializedName("status_aktif")
    @Expose
    private String statusAktif;
    @SerializedName("status_umumkan")
    @Expose
    private String statusUmumkan;
    @SerializedName("nama_kpa")
    @Expose
    private String namaKpa;

    public Integer getTanggalTerakhirDiUpdate() {
        return tanggalTerakhirDiUpdate;
    }

    public void setTanggalTerakhirDiUpdate(Integer tanggalTerakhirDiUpdate) {
        this.tanggalTerakhirDiUpdate = tanggalTerakhirDiUpdate;
    }

    public String getKodeKldi() {
        return kodeKldi;
    }

    public void setKodeKldi(String kodeKldi) {
        this.kodeKldi = kodeKldi;
    }

    public Integer getIdSatker() {
        return idSatker;
    }

    public void setIdSatker(Integer idSatker) {
        this.idSatker = idSatker;
    }

    public String getKodeSatkerAsli() {
        return kodeSatkerAsli;
    }

    public void setKodeSatkerAsli(String kodeSatkerAsli) {
        this.kodeSatkerAsli = kodeSatkerAsli;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getKldi() {
        return kldi;
    }

    public void setKldi(String kldi) {
        this.kldi = kldi;
    }

    public Integer getKodeRup() {
        return kodeRup;
    }

    public void setKodeRup(Integer kodeRup) {
        this.kodeRup = kodeRup;
    }

    public String getNamaSatker() {
        return namaSatker;
    }

    public void setNamaSatker(String namaSatker) {
        this.namaSatker = namaSatker;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public void setNamaPaket(String namaPaket) {
        this.namaPaket = namaPaket;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getPaguRup() {
        return paguRup;
    }

    public void setPaguRup(Integer paguRup) {
        this.paguRup = paguRup;
    }

    public String getMak() {
        return mak;
    }

    public void setMak(String mak) {
        this.mak = mak;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDetailLokasi() {
        return detailLokasi;
    }

    public void setDetailLokasi(String detailLokasi) {
        this.detailLokasi = detailLokasi;
    }

    public String getSumberDana() {
        return sumberDana;
    }

    public void setSumberDana(String sumberDana) {
        this.sumberDana = sumberDana;
    }

    public String getMetodePemilihan() {
        return metodePemilihan;
    }

    public void setMetodePemilihan(String metodePemilihan) {
        this.metodePemilihan = metodePemilihan;
    }

    public String getJenisPengadaan() {
        return jenisPengadaan;
    }

    public void setJenisPengadaan(String jenisPengadaan) {
        this.jenisPengadaan = jenisPengadaan;
    }

    public String getAwalPengadaan() {
        return awalPengadaan;
    }

    public void setAwalPengadaan(String awalPengadaan) {
        this.awalPengadaan = awalPengadaan;
    }

    public String getAkhirPengadaan() {
        return akhirPengadaan;
    }

    public void setAkhirPengadaan(String akhirPengadaan) {
        this.akhirPengadaan = akhirPengadaan;
    }

    public String getAwalPekerjaan() {
        return awalPekerjaan;
    }

    public void setAwalPekerjaan(String awalPekerjaan) {
        this.awalPekerjaan = awalPekerjaan;
    }

    public String getAkhirPekerjaan() {
        return akhirPekerjaan;
    }

    public void setAkhirPekerjaan(String akhirPekerjaan) {
        this.akhirPekerjaan = akhirPekerjaan;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getPenyediaDidalamSwakelola() {
        return penyediaDidalamSwakelola;
    }

    public void setPenyediaDidalamSwakelola(String penyediaDidalamSwakelola) {
        this.penyediaDidalamSwakelola = penyediaDidalamSwakelola;
    }

    public Object getIdSwakelola() {
        return idSwakelola;
    }

    public void setIdSwakelola(Object idSwakelola) {
        this.idSwakelola = idSwakelola;
    }

    public String getTkdn() {
        return tkdn;
    }

    public void setTkdn(String tkdn) {
        this.tkdn = tkdn;
    }

    public String getPradipa() {
        return pradipa;
    }

    public void setPradipa(String pradipa) {
        this.pradipa = pradipa;
    }

    public String getStatusAktif() {
        return statusAktif;
    }

    public void setStatusAktif(String statusAktif) {
        this.statusAktif = statusAktif;
    }

    public String getStatusUmumkan() {
        return statusUmumkan;
    }

    public void setStatusUmumkan(String statusUmumkan) {
        this.statusUmumkan = statusUmumkan;
    }

    public String getNamaKpa() {
        return namaKpa;
    }

    public void setNamaKpa(String namaKpa) {
        this.namaKpa = namaKpa;
    }

}
