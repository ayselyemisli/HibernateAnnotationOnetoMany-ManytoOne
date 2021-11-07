package entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_kisi", catalog = "mydatabase") // tablo ad� ==> tbl_kisi database ad� ==>mydatabase
public class Kisi implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // id otomatik artan
	@Column(name = "kisi_id")
	private Integer kisiId;
	@Column(name = "kisi_ad")
	private String kisiAd;
	@Column(name = "kisi_soyad")
	private String kisiSoyad;

	// Burada ili�ki kuraca��z
	// Listede tutal�m telefonlar�
	@OneToMany(mappedBy = "kisi", cascade = CascadeType.ALL) // Bir ki�inin birden fazla telefon numaras� olabilir
	private List<Telefon> telefonNumaralari;

	// Bo� constructor
	public Kisi() {

	}
	// parametreli const

	public Kisi(String kisiAd, String kisiSoyad) {

		this.kisiAd = kisiAd;
		this.kisiSoyad = kisiSoyad;
	}
	
	
	//gettter ve setter 

	public Integer getKisiId() {
		return kisiId;
	}

	public void setKisiId(Integer kisiId) {
		this.kisiId = kisiId;
	}

	public String getKisiAd() {
		return kisiAd;
	}

	public void setKisiAd(String kisiAd) {
		this.kisiAd = kisiAd;
	}

	public String getKisiSoyad() {
		return kisiSoyad;
	}

	public void setKisiSoyad(String kisiSoyad) {
		this.kisiSoyad = kisiSoyad;
	}

	public List<Telefon> getTelefonNumaralari() {
		return telefonNumaralari;
	}

	public void setTelefonNumaralari(List<Telefon> telefonNumaralari) {
		this.telefonNumaralari = telefonNumaralari;
	}
	
	

}
