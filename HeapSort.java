
public class HeapSort {

	public HeapSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heap he = new Heap(11);
		he.insert(5);
		he.insert(6);
		he.insert(2);
		he.insert(3);
		he.insert(9);
		he.insert(8);
		he.insert(7);
		he.insert(4);
		he.insert(6);
		he.insert(1);
		he.insert(2);
		System.out.println("The numbers:56239874612 are change by maxheap into:");
		he.outPut();
	}

}
