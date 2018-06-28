package football_app;

class FootballPlayer {
	private double size;
	private int number;
	private String name;
	private String haircolor;
	private String role;

	public FootballPlayer(double size, int number, String name, String haircolor, String role) {
		this.size = size;
		this.number = number;
		this.name = name;
		this.haircolor = haircolor;
		this.role = role;
	}

	public void returnValues() {
		System.out.println(number);
		System.out.println(size);
		System.out.println(name);
		System.out.println(haircolor);
		System.out.println(role);
	}
	
	public double getSize() {
		return this.size;
	}

	public String getName () {
		// TODO Auto-generated method stub
		return name;
	}

}
