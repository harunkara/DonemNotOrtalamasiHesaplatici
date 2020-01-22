package aktsMakinesi;

import java.util.Scanner;

public class aktsClass {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int akts;
		String harfnotu;
		double harfnotusayý;
		double toplam=0;
		int toplamakts=0;
		System.out.println("Lütfen bu dönem kaç dersiniz olduðunu giriniz");
		int derssayýsý=scn.nextInt();
		for(int t=0;t<derssayýsý;t++) {

			System.out.println("Lutfen "+(t+1)+".dersin akts sini giriniz ");
			akts=scn.nextInt();
			System.out.println("Lutfen "+(t+1)+".dersin harf notunu giriniz(AA,BA,BB,CB,CC,DC,DD,FF) ");
			harfnotu=scn.next();
		     if(harfnotu.equalsIgnoreCase("AA"))
					harfnotusayý=Harfnotu.AA.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("BA"))
					harfnotusayý=Harfnotu.BA.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("BB"))
					harfnotusayý=Harfnotu.BB.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("CB"))
					harfnotusayý=Harfnotu.CB.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("CC"))
					harfnotusayý=Harfnotu.CC.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("DC"))
					harfnotusayý=Harfnotu.DC.getNumVal();
		   	 else if(harfnotu.equalsIgnoreCase("DD"))
					harfnotusayý=Harfnotu.DD.getNumVal();
		     else
					harfnotusayý=Harfnotu.FF.getNumVal();

			
			
		
				
			toplam=toplam+akts(akts,harfnotusayý);
			toplamakts=toplamakts+akts;
			
		}
		double sonuc=toplam/toplamakts;
		System.out.println("ortalamanýz:"+sonuc);
	
		

	}
	public static double akts(int akts,double harfnotu) {
		int toplam;
		return akts*harfnotu;
		

			
		
	}
	

}
