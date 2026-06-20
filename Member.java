class Member {
	private int id;
	private String name;
	private int age;
	private int weight;


	private double height;

	public Member (int id, String name, int age, int weight, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public int getId(){ return this.id; }

	public String getName(){ return this.name; }

	public int getAge(){ return this.age; }

	public int getWeight(){ return this.weight; }

	public double getHeight(){ return this.height; }
	
	public double BMI(){
		return this.getWeight() / (this.getHeight() * this.getHeight());
	}

	public String MemberWeightRange(){
		if(this.BMI() < 18.5){
			return "under weight";
		}else if(this.BMI() >= 18.5 && this.BMI() < 24.9){
			return "normal";
		}else{
			return "dome";
		}
	}

	public String MemberInfo(){
		return "id : " + this.getId() + "\n" + 
			"name : " + this.getName() + "\n" + 
			"age : " + this.getAge() + "\n" + 
			"weight : " + this.getWeight() + "\n" + 
			"height : " + this.getHeight() + "\n";
	} 

	public static void main(String arg[]){
		Member m = new Member(1, "aymane", 21, 80, 1.92);

		System.out.println(m.MemberInfo());
		System.out.printf("%.2f%n", m.BMI());
		System.out.println(m.MemberWeightRange());
	}
}
