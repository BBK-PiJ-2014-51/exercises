class Exercise2{
	public static void main(String[] args) {
		//ex2.1 tests
				System.out.println("Ex2.2 tests");
				IntSet tree = new TreeIntSet(50);
				tree.add(25);
				tree.add(26);
				tree.add(77);
				tree.add(91);
				tree.add(13);
				tree.add(44);
				tree.add(56);
				tree.add(77);
				tree.containsVerbose(26);
				tree.containsVerbose(77);
				System.out.println(tree.toString());
				System.out.println("");
				System.out.println("Ex2.3 tests");
				IntSet list = new ListIntSet(50);
				list.add(25);
				list.add(26);
				list.add(77);
				list.add(91);
				list.add(13);
				list.add(44);
				list.add(56);
				list.add(77);
				list.containsVerbose(26);
				list.containsVerbose(77);
				System.out.println(list.toString());
				System.out.println("");
	}
}