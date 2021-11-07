package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_telefon", catalog = "mydatabase")
public class Telefon implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tel_id")
	private int telefonId;

	@Column(name = "tel_no")
	private String telefonNo;

	@Column(name = "tel_detay")
	private String telefonDetay;

	// Burada iliþkiyi kuracaðýz
	@ManyToOne(optional = false) // optionel-false kisi referansý olmadan telefon kaydý yapýlaz.Kisiye baðlý :)
	@JoinColumn(name = "kisi_id")
	private Kisi kisi;

	// Boþ constructor
	public Telefon() {

	}

	// Parametreli cons.
	public Telefon(String telefonNo, String telefonDetay) {

		this.telefonNo = telefonNo;
		this.telefonDetay = telefonDetay;
	}

	// GETTER VE SETTER

	public int getTelefonId() {
		return telefonId;
	}

	public void setTelefonId(int telefonId) {
		this.telefonId = telefonId;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public String getTelefonDetay() {
		return telefonDetay;
	}

	public void setTelefonDetay(String telefonDetay) {
		this.telefonDetay = telefonDetay;
	}

	public Kisi getKisi() {
		return kisi;
	}

	public void setKisi(Kisi kisi) {
		this.kisi = kisi;
	}

}
