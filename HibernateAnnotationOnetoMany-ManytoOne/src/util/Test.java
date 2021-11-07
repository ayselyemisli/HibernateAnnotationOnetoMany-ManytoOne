package util;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import entity.Kisi;
import entity.Telefon;

public class Test {

	
	public static void main(String[] args) {
		
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		session.beginTransaction();
		
		Kisi kisi = new Kisi("Aysel","Yemisli"); //kisi_ad,kisi_soyad  kolonlarý
		
		Telefon telefon1= new Telefon("846352876","A faturalý hat");
		Telefon telefon2=new Telefon("988784584","B faturasýz hat");
		
		List<Telefon> telefonlar = new ArrayList();
		
		telefon1.setKisi(kisi);
		telefon2.setKisi(kisi);
		
		telefonlar.add(telefon1);
		telefonlar.add(telefon2);
		
		kisi.setTelefonNumaralari(telefonlar);
		session.save(kisi);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Kayýt edildi :) ");
		
		
	}
}
