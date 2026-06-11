public class BinaryTree {
	Node root;
	
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public int getSize() {
		return getSize(root, 0)-1;
	}
	
	public int getSize(Node x, int sizeAux) {
		//faz a varredura e retorna a quantidade
		if (x == null) 
			return 1;
			
		return (getSize(x.getLeftNode(), sizeAux)
				+ getSize(x.getRightNode(), sizeAux)); 
			
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

	
	public void listExternalNodes() {
		listExternalNodes(root);
	}
	
	public void listExternalNodes(Node x) {
		//raiz primeiro, Esquerda, Direita
		if (x == null) 
			return;
		
			if (x.getLeftNode() == null && x.getRightNode() == null )
				System.out.print(x.getData() + " ");
			
			listExternalNodes(x.getLeftNode());
			listExternalNodes(x.getRightNode());
			
	}
	
	public void listInternalNodes() {
		listInternalNodes(root);
	}
	
	public void listInternalNodes(Node x) {
		//raiz primeiro, Esquerda, Direita
		if (x == null) 
			return;
		
			if (x.getLeftNode() != null || x.getRightNode() != null )
				System.out.print(x.getData() + " ");
			
			listInternalNodes(x.getLeftNode());
			listInternalNodes(x.getRightNode());
			
	}
	
	public void delete(Node nodeToDelete) {
		if (nodeToDelete.isExternal()) {
			//achar o pai dele 
			
			//ver se ele é nó esquerdo ou direito
			if (nodeToDelete.getDadNode().getLeftNode()==nodeToDelete)	
				nodeToDelete.getDadNode().setLeftNode(null);
			else
				nodeToDelete.getDadNode().setRightNode(null);
			
		}
	}
	
	public boolean search(int valueToSearch) {
		
		return search(valueToSearch, root, false);
	}
	
	

	public boolean search(int valueToSearch, Node auxNode, boolean flag) {
		if (flag == true) 
			return true;
		
		if (auxNode == null) 
			return false;
		
		if (auxNode.getData() == valueToSearch) {
			flag = true;
			return flag;
		}
			if (flag == true) {
				return true;
			} else {
				return 
						(search(valueToSearch, auxNode.getLeftNode(), flag)
								||
				         search(valueToSearch, auxNode.getRightNode(), flag)
				         );
			}	
	}
}
