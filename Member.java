class Member {
	private int id;




	private String name;
	private int age;
	private int weight;
	private int height;

	public Member (int id, String name, int age, int weight, int height) {
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

	public int getHeight(){ return this.height; }
	
//	public String info(){
//		return "id : " + this.getId() + "\n" + 
//			"name : " + this.getName() + "\n" + 
//			"age : " + this.getAge() + "\n" + 
//			"weight : " + this.getWeight() + "\n" + 
//			"height : " + this.getHeight() + "\n";
//	} 

	public static void main(String arg[]){
		Member m = new Member(1, "aymane", 21, 80, 192);

		System.out.println(m.info());
	}
}
