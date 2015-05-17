

class Exercise1Test{
	public static void main(String[] args) {
		//ex1.1 tests
		System.out.println("Ex1.1 tests");
		IntegerTreeNode tree = new IntegerTreeNode(50);
		tree.add(25);
		tree.add(26);
		tree.add(77);
		tree.add(91);
		tree.add(13);
		tree.add(44);
		tree.add(56);
		tree.add(77);
		System.out.println("Does tree contain 77? " + tree.contains(77));
		System.out.println("Minimum value in tree? " + tree.getMin());
		System.out.println("Max value in tree? " + tree.getMax());
		System.out.println("");
		
		//ex1.2 tests
		System.out.println("Ex1.2 tests");
		IntegerTreeNode treeB = new IntegerTreeNode(6);
		treeB.add(9);
		treeB.add(5);
		treeB.add(3);
		treeB.add(8);
		treeB.add(11);
		treeB.add(12);
		System.out.println("[" + treeB.toString() + "]");
		System.out.println("[" + treeB.toStringSimple() + "]");
		System.out.println("");
		
		//ex1.3 tests
		System.out.println("Ex 1.3 Tests");
		System.out.println("First tree: " + tree.depth());
		System.out.println("Second Tree: " + treeB.depth());
		IntegerTreeNode treeC = new IntegerTreeNode(6);
		System.out.println("Another tree: " + treeC.depth());
	}	
}