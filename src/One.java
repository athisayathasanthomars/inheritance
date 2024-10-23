class parent {
	protected String parent_name="ganeswary";
	protected String name;
	void child1_activity(){
		System.out.println("i can cook for child");
	}
} 

class child extends parent {
	String name="jon";
	void child2_activity(){
		System.out.println("i can sing in school");
	}

}
class child2 extends parent{
	String name="bosco";
	void child2_activity(){
		System.out.println("i can play vollyball");
	}
	public static void main(String[] args) {
		child obj_child=new child();
		child2 obj_child2=new child2();
		System.out.println("parent name-"+obj_child.parent_name);
		System.out.println("child 1-"+obj_child.name);
		obj_child.child1_activity();
		System.out.println("child 2-"+obj_child2.name);
		obj_child2.child2_activity();
	}
}
class grandchild extends child2 {
	String name = "alan";

	void child2_activity() {
		System.out.println("i can play");
	}

	public static void main(String[] args) {
		child obj_child = new child();
		child2 obj_child2 = new child2();
		grandchild obj_grand_child=new grandchild();
		System.out.println("parent-"+obj_child.parent_name);

		System.out.println("i am child 1-"+obj_child.name);
		obj_child.child1_activity();

		System.out.println("i am child 2-"+obj_child2.name);
		obj_child2.child1_activity();

		System.out.println("grand child of child 2-" + obj_grand_child.name);
		obj_grand_child.child2_activity();
	}
}
