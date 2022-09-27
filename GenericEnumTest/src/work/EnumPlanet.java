package work;

public class EnumPlanet {
	public enum Planet{
		수성(2439), 금성(6052),
		지구(6371), 화성(3390),
		목성(69911), 토성(58232),
		천왕성(25362), 해왕성(24622);
		
		private double str;

		Planet(double str) {
			this.str = str;
		}

		public double getStr() {
			return str;
		}
	} 

	public static void main(String[] args) {
		Planet[] area = Planet.values();
		for (int i = 0; i < area.length; i++) {
			System.out.println(area[i].name() + ": " + (4 * Math.PI * area[i].getStr() * area[i].getStr() + "㎢"));
		}
	}
}