package aktsMakinesi;

import java.util.Scanner;

public class aktsClass {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int akts;
		String harfnotu;
		double harfnotusay�;
		double toplam=0;
		int toplamakts=0;
		System.out.println("L�tfen bu d�nem ka� dersiniz oldu�unu giriniz");
		int derssay�s�=scn.nextInt();
		for(int t=0;t<derssay�s�;t++) {

			System.out.println("Lutfen "+(t+1)+".dersin akts sini giriniz ");
			akts=scn.nextInt();
			System.out.println("Lutfen "+(t+1)+".dersin harf notunu giriniz(AA,BA,BB,CB,CC,DC,DD,FF) ");
			harfnotu=scn.next();
		     if(harfnotu.equalsIgnoreCase("AA"))
					harfnotusay�=Harfnotu.AA.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("BA"))
					harfnotusay�=Harfnotu.BA.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("BB"))
					harfnotusay�=Harfnotu.BB.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("CB"))
					harfnotusay�=Harfnotu.CB.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("CC"))
					harfnotusay�=Harfnotu.CC.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("DC"))
					harfnotusay�=Harfnotu.DC.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("DD"))
					harfnotusay�=Harfnotu.DD.getNumVal();
		     else
					harfnotusay�=Harfnotu.FF.getNumVal();

			
			
		
				
			toplam=toplam+akts(akts,harfnotusay�);
			toplamakts=toplamakts+akts;
			
		}
		double sonuc=toplam/toplamakts;
		System.out.println("ortalaman�z:"+sonuc);
	
		

	}
	public static double akts(int akts,double harfnotu) {
		int toplam;
		return akts*harfnotu;
		

			
		
	}
	

}
