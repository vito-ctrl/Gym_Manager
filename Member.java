class Member {
	private int id;
	private String name;
	private int age;



	private double weight;


	private double height;

	public Member (int id, String name, int age, double weight, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public int getId(){ return this.id; }

	public String getName(){ return this.name; }

	public int getAge(){ return this.age; }

	public double getWeight(){ return this.weight; }

	public double getHeight(){ return this.height; }
	
	public double CalculateBMI(){
		return this.getWeight() / (this.getHeight() * this.getHeight());
	}

	public String getWeightCategory(){
		double bmi = this.CalculateBMI(); 
		
		if(bmi < 18.5){
			return "under weight";
		}else if(bmi >= 18.5 && bmi <= 24.9){
			return "normal";
		}else if (bmi > 25 && bmi < 29.9){
			return "over weight";
		}else{
			return "obese";
		}
	}

	@Override
	public String toString(){
		return "id : " + this.getId() + "\n" + 
			"name : " + this.getName() + "\n" + 
			"age : " + this.getAge() + "\n" + 
			"weight : " + this.getWeight() + "\n" + 
			"height : " + this.getHeight() + "\n";
	} 

	public static void main(String arg[]){
		Member m1 = new Member(1, "aymane", 21, 80.4, 1.92);
		Member m2 = new Member(2, "l9irch", 19, 70.5, 1.70);
		Member m3 = new Member(3, "achraf", 24, 50, 1.82);

		System.out.println(m1);
		System.out.printf("%.2f%n", m1.CalculateBMI());
		System.out.println(m1.getWeightCategory());

		System.out.println(m2);
		System.out.printf("%.2f%n", m2.CalculateBMI());
		System.out.println(m2.getWeightCategory());

		System.out.println(m3);
		System.out.printf("%.2f%n", m3.CalculateBMI());
		System.out.println(m3.getWeightCategory());
	}
}
