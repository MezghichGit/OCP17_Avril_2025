package day1_12042025.day2_13042025.heritage.classeAbstraite;

public class MoyenTransport implements Moto,Voiture{
	@Override
	public void deplacer() {
		System.out.println("Depalcement sur n roues");
	}
}
