public class BinaryTree {
	Node root;
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	public int getSize() {
			//faz a varredura e retorna a quantidade
			return 1;
	}
	
	public void printPosOrder() {
		System.out.println("\nPost order");
		printPosOrder(root);
	}
	public void printPosOrder(Node x) {
		//Esquerda, Direita, Raiz
		if (x == null) 
			return;
		
			printPosOrder(x.getLeftNode());
			printPosOrder(x.getRightNode());
			System.out.print(x.getData() + " ");

	}
	
	public void printInOrder() {
		System.out.println("\nIn order");
		printInOrder(root);
	}
	
	public void printInOrder(Node x) {
		//Esquerda, Raiz, Direito
		if (x == null) 
			return;
		
			
			printInOrder(x.getLeftNode());
			System.out.print(x.getData() + " ");
			printInOrder(x.getRightNode());
			
		
	
	}
	
	
	public void printPreOrder() {
		System.out.println("Pre order");
		printPreOrder(root);
	}
	
	public void printPreOrder(Node x) {
		//raiz primeiro, Esquerda, Direita
		if (x == null) 
			return;
		
			System.out.print(x.getData() + " ");
			printPreOrder(x.getLeftNode());
			printPreOrder(x.getRightNode());
			
	}

	public int getDegree() {
		return 1;
	}

}
