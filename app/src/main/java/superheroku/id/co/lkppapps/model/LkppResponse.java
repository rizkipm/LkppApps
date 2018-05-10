package superheroku.id.co.lkppapps.model;


import com.google.gson.annotations.SerializedName;


public class LkppResponse{

	@SerializedName("sumber_dana")
	private String sumberDana;

	@SerializedName("akhir_pengadaan")
	private String akhirPengadaan;

	@SerializedName("awal_pengadaan")
	private String awalPengadaan;

	@SerializedName("pagu_rup")
	private int paguRup;

	@SerializedName("detail_lokasi")
	private String detailLokasi;

	@SerializedName("kode_satker_asli")
	private String kodeSatkerAsli;

	@SerializedName("tanggal_terakhir_di_update")
	private long tanggalTerakhirDiUpdate;

	@SerializedName("kldi")
	private String kldi;

	@SerializedName("akhir_pekerjaan")
	private String akhirPekerjaan;

	@SerializedName("mak")
	private String mak;

	@SerializedName("spesifikasi")
	private String spesifikasi;

	@SerializedName("id_satker")
	private int idSatker;

	@SerializedName("awal_pekerjaan")
	private String awalPekerjaan;

	@SerializedName("id_swakelola")
	private Object idSwakelola;

	@SerializedName("status_aktif")
	private String statusAktif;

	@SerializedName("nama_paket")
	private String namaPaket;

	@SerializedName("pradipa")
	private String pradipa;

	@SerializedName("kode_rup")
	private int kodeRup;

	@SerializedName("nama_satker")
	private String namaSatker;

	@SerializedName("jenis_pengadaan")
	private String jenisPengadaan;

	@SerializedName("nama_kpa")
	private String namaKpa;

	@SerializedName("metode_pemilihan")
	private String metodePemilihan;

	@SerializedName("penyedia_didalam_swakelola")
	private String penyediaDidalamSwakelola;

	@SerializedName("volume")
	private String volume;

	@SerializedName("kode_kldi")
	private String kodeKldi;

	@SerializedName("lokasi")
	private String lokasi;

	@SerializedName("tkdn")
	private String tkdn;

	@SerializedName("status_umumkan")
	private String statusUmumkan;

	@SerializedName("jenis")
	private String jenis;

	public void setSumberDana(String sumberDana){
		this.sumberDana = sumberDana;
	}

	public String getSumberDana(){
		return sumberDana;
	}

	public void setAkhirPengadaan(String akhirPengadaan){
		this.akhirPengadaan = akhirPengadaan;
	}

	public String getAkhirPengadaan(){
		return akhirPengadaan;
	}

	public void setAwalPengadaan(String awalPengadaan){
		this.awalPengadaan = awalPengadaan;
	}

	public String getAwalPengadaan(){
		return awalPengadaan;
	}

	public void setPaguRup(int paguRup){
		this.paguRup = paguRup;
	}

	public int getPaguRup(){
		return paguRup;
	}

	public void setDetailLokasi(String detailLokasi){
		this.detailLokasi = detailLokasi;
	}

	public String getDetailLokasi(){
		return detailLokasi;
	}

	public void setKodeSatkerAsli(String kodeSatkerAsli){
		this.kodeSatkerAsli = kodeSatkerAsli;
	}

	public String getKodeSatkerAsli(){
		return kodeSatkerAsli;
	}

	public void setTanggalTerakhirDiUpdate(long tanggalTerakhirDiUpdate){
		this.tanggalTerakhirDiUpdate = tanggalTerakhirDiUpdate;
	}

	public long getTanggalTerakhirDiUpdate(){
		return tanggalTerakhirDiUpdate;
	}

	public void setKldi(String kldi){
		this.kldi = kldi;
	}

	public String getKldi(){
		return kldi;
	}

	public void setAkhirPekerjaan(String akhirPekerjaan){
		this.akhirPekerjaan = akhirPekerjaan;
	}

	public String getAkhirPekerjaan(){
		return akhirPekerjaan;
	}

	public void setMak(String mak){
		this.mak = mak;
	}

	public String getMak(){
		return mak;
	}

	public void setSpesifikasi(String spesifikasi){
		this.spesifikasi = spesifikasi;
	}

	public String getSpesifikasi(){
		return spesifikasi;
	}

	public void setIdSatker(int idSatker){
		this.idSatker = idSatker;
	}

	public int getIdSatker(){
		return idSatker;
	}

	public void setAwalPekerjaan(String awalPekerjaan){
		this.awalPekerjaan = awalPekerjaan;
	}

	public String getAwalPekerjaan(){
		return awalPekerjaan;
	}

	public void setIdSwakelola(Object idSwakelola){
		this.idSwakelola = idSwakelola;
	}

	public Object getIdSwakelola(){
		return idSwakelola;
	}

	public void setStatusAktif(String statusAktif){
		this.statusAktif = statusAktif;
	}

	public String getStatusAktif(){
		return statusAktif;
	}

	public void setNamaPaket(String namaPaket){
		this.namaPaket = namaPaket;
	}

	public String getNamaPaket(){
		return namaPaket;
	}

	public void setPradipa(String pradipa){
		this.pradipa = pradipa;
	}

	public String getPradipa(){
		return pradipa;
	}

	public void setKodeRup(int kodeRup){
		this.kodeRup = kodeRup;
	}

	public int getKodeRup(){
		return kodeRup;
	}

	public void setNamaSatker(String namaSatker){
		this.namaSatker = namaSatker;
	}

	public String getNamaSatker(){
		return namaSatker;
	}

	public void setJenisPengadaan(String jenisPengadaan){
		this.jenisPengadaan = jenisPengadaan;
	}

	public String getJenisPengadaan(){
		return jenisPengadaan;
	}

	public void setNamaKpa(String namaKpa){
		this.namaKpa = namaKpa;
	}

	public String getNamaKpa(){
		return namaKpa;
	}

	public void setMetodePemilihan(String metodePemilihan){
		this.metodePemilihan = metodePemilihan;
	}

	public String getMetodePemilihan(){
		return metodePemilihan;
	}

	public void setPenyediaDidalamSwakelola(String penyediaDidalamSwakelola){
		this.penyediaDidalamSwakelola = penyediaDidalamSwakelola;
	}

	public String getPenyediaDidalamSwakelola(){
		return penyediaDidalamSwakelola;
	}

	public void setVolume(String volume){
		this.volume = volume;
	}

	public String getVolume(){
		return volume;
	}

	public void setKodeKldi(String kodeKldi){
		this.kodeKldi = kodeKldi;
	}

	public String getKodeKldi(){
		return kodeKldi;
	}

	public void setLokasi(String lokasi){
		this.lokasi = lokasi;
	}

	public String getLokasi(){
		return lokasi;
	}

	public void setTkdn(String tkdn){
		this.tkdn = tkdn;
	}

	public String getTkdn(){
		return tkdn;
	}

	public void setStatusUmumkan(String statusUmumkan){
		this.statusUmumkan = statusUmumkan;
	}

	public String getStatusUmumkan(){
		return statusUmumkan;
	}

	public void setJenis(String jenis){
		this.jenis = jenis;
	}

	public String getJenis(){
		return jenis;
	}

	@Override
 	public String toString(){
		return 
			"LkppResponse{" + 
			"sumber_dana = '" + sumberDana + '\'' + 
			",akhir_pengadaan = '" + akhirPengadaan + '\'' + 
			",awal_pengadaan = '" + awalPengadaan + '\'' + 
			",pagu_rup = '" + paguRup + '\'' + 
			",detail_lokasi = '" + detailLokasi + '\'' + 
			",kode_satker_asli = '" + kodeSatkerAsli + '\'' + 
			",tanggal_terakhir_di_update = '" + tanggalTerakhirDiUpdate + '\'' + 
			",kldi = '" + kldi + '\'' + 
			",akhir_pekerjaan = '" + akhirPekerjaan + '\'' + 
			",mak = '" + mak + '\'' + 
			",spesifikasi = '" + spesifikasi + '\'' + 
			",id_satker = '" + idSatker + '\'' + 
			",awal_pekerjaan = '" + awalPekerjaan + '\'' + 
			",id_swakelola = '" + idSwakelola + '\'' + 
			",status_aktif = '" + statusAktif + '\'' + 
			",nama_paket = '" + namaPaket + '\'' + 
			",pradipa = '" + pradipa + '\'' + 
			",kode_rup = '" + kodeRup + '\'' + 
			",nama_satker = '" + namaSatker + '\'' + 
			",jenis_pengadaan = '" + jenisPengadaan + '\'' + 
			",nama_kpa = '" + namaKpa + '\'' + 
			",metode_pemilihan = '" + metodePemilihan + '\'' + 
			",penyedia_didalam_swakelola = '" + penyediaDidalamSwakelola + '\'' + 
			",volume = '" + volume + '\'' + 
			",kode_kldi = '" + kodeKldi + '\'' + 
			",lokasi = '" + lokasi + '\'' + 
			",tkdn = '" + tkdn + '\'' + 
			",status_umumkan = '" + statusUmumkan + '\'' + 
			",jenis = '" + jenis + '\'' + 
			"}";
		}
}