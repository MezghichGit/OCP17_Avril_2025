package Day6_QCM;

public class Lion {
	
	public void info() {
		display();
	}
	
	public static void display() {}
	class Cub {
	}

	static class Den {
		public static int x;
	}

	static void rest() {
		//Cub a = Lion.new Cub();
		Cub a = new Lion().new Cub();
		//Lion.Cub b = new Lion().Cub();
		Lion.Cub b = new Lion().new Cub();
		Lion.Cub c = new Lion().new Cub();
		var d = new Den();
		//var e = Lion.new Cub();
		Lion.Den.x = 10;
		//Lion.Den f = new Lion.Den();
		Lion.Den f =  Lion.new Den();
	}
}
