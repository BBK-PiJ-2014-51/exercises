class Exercise3{
	public static void main(String[] args) {
		System.out.println("Ex3.2 tests");
		IntSortedList tree = new TreeIntSortedList(50);
		tree.add(25);
		tree.add(26);
		tree.add(77);
		tree.add(91);
		tree.add(13);
		tree.add(44);
		tree.add(56);
		tree.add(77);
		System.out.println(tree.toString());
		System.out.println("");
		System.out.println("Ex3.3 tests");
		IntSortedList list = new ListIntSortedList(50);
		list.add(25);
		list.add(26);
		list.add(77);
		list.add(91);
		list.add(13);
		list.add(44);
		list.add(56);
		list.add(77);
		System.out.println(list.toString());
		System.out.println("");
	}
}