
public class Heap {
	private int myarray[];
	private int size;
	private int maxsize;
	
	public Heap() {
		// TODO Auto-generated constructor stub
	}
	
	public Heap(int maxsize) {
		this.maxsize=maxsize;
		this.size=0;
		myarray = new int[this.maxsize + 1];
		
		//this line can avoid the value-1
		myarray[0] = Integer.MAX_VALUE;
	}
	
	
	public int parent(int pos) {
		return pos/2;
	}
	
	public int leftLeaf(int pos) {
		return 2*pos;
	}
	
	public int rightLeaf(int pos) {
		return (2*pos)+1;
	}
	
	public boolean isLeaf(int pos) {
		if((pos>=size/2)&&(pos<=size))
			return true;
		else
			return false;
	}
	
	//change two number
	public void change(int a,int b) {
		int temp;
		temp = myarray[a];
		myarray[a]=myarray[b];
		myarray[b]=temp;
	}
	
	//compare and change
	public void maxHeapify(int pos) {
		if(isLeaf(pos))
			return;
		if((myarray[pos]<myarray[leftLeaf(pos)]) || (myarray[pos]<myarray[rightLeaf(pos)])) {
			if(myarray[leftLeaf(pos)]>myarray[rightLeaf(pos)]) {
				change(pos,leftLeaf(pos));
				maxHeapify(leftLeaf(pos));
			}
			else {
				change(pos,rightLeaf(pos));
				maxHeapify(rightLeaf(pos));
			}
		}
	}
	
	//insert new root into tree
	public void insert(int pos) {
		myarray[++size]=pos;
		int cu = size;
		while(myarray[cu]>myarray[parent(cu)]) {
			change(cu,parent(cu));
			cu=parent(cu);
		}
	}
	
	public void outPut() {
		for(int i=1;i<=size;i++) {
			System.out.print(myarray[i]);
		}
	}
}
