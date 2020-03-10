import java.math.*;

public class AVLTree {
		
	Node root;

	

	
	public void insertIter(int value) {
		Node curr;
		Node nodeIns = new Node(value);
		
		if (root == null) {
		
			root = nodeIns;
			return;
			
			
		}
		
		else {
			curr = root;
			Node temp ;
			
		
			while (true) {  
				temp = curr ;
				
				if (nodeIns.data < curr.data) { 
					
					curr = curr.left;
					
					if (curr == null) {
						temp.left = nodeIns;
						break;
					}
		
					
				}
				else   {
					curr = curr.right;
					
					if (curr == null) {
						temp.right = nodeIns;
						break;
					}

				}
				
				
			
			}
			
		}
		return;
	}
	
	public void deleteIter(int delete) {
		
		Node curr = this.root;
		Node temp;
		if ( root == null)
			return;
		while(curr.data != delete) {
			
		if( curr.data < delete)
			curr = curr.right;
		if(curr.data > delete)
			curr = curr.left;
		if (curr == null )
			break;
		}
		
		if (curr.data == delete) {
	
			curr = curr.right;
			root = root.left;
			temp = root.right;
			while(curr.left != null) {
				curr = curr.left;
			
			}
			curr = temp;

			
		}
		

	
			
		
}
	public Node findNextIter(int value) {
		Node curr = this.root;
	
		Node Next = null;
		int findNext = 0;
		int i = value + 1;
		
			while (true) {
	
				if (curr == null) {
					i++;
					if( findNext == 0)
						break;
					continue;
				}
				if( curr.data == i) {
					return Next = curr;
				}
				
				if(curr.data <  i) {
					curr = curr.right;
					Next = curr;
	
					continue;
				
				}
				
				if(curr.data >  i) {
					findNext = 1;
					curr = curr.left;
					if (curr == null)
						return Next;
					Next = curr;
				}
					
				
		}
			
	
		return Next;
}

	public Node findPrevIter(int value) {
		Node curr = this.root;
	
		Node Next = null;
		int findPrev = 0;
		int i = value - 1;
		
			while (true) {
	
				if (curr == null) {
					i++;
					if( findPrev == 0)
						break;
					continue;
				}
				if( curr.data == i) {
					return Next = curr;
				}
				
				if(curr.data <  i) {
					findPrev = 1;
					Next = curr;
					curr = curr.right;
					if (curr == null)
						return Next;
	
					continue;
				
				}
				
				if(curr.data >  i) {
				
					curr = curr.left;

					Next = curr;
				}
					
				
		}
			
	
		return Next;
}
	

		
		
	
	
	public Node findMinIter() {
		
		Node Min = new Node();
		Min = this.root;
		while (Min.left != null) {
			Min = Min.left;
		}
		return Min;
	}
	public Node findMaxIter() {
		
		Node Max = new Node();
		Max = this.root;
		while (Max.right != null) {
			Max = Max.right;
		}
		return Max;
	}
			
	

	
	public static void main (String[] args) {
		


		
		AVLTree tree = new AVLTree();


		tree.insertIter(5);

		tree.insertIter(1);

		tree.insertIter(20);
	
		tree.insertIter(15);


		tree.deleteIter(15);
		int x = tree.findMaxIter().data;
		System.out.println(x);

		
	} 
		


}
