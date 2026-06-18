
public class BinaryTree {
	Node root;
	
	
	public BinaryTree(Node root) {
		this.root = root;
	}
	
	public int getSize() {
		return getSize(root);
	}
	
	public int getSize(Node x) {
		//faz a varredura e retorna a quantidade
		if (x == null) 
			return 0;
			
		return 1 + getSize(x.getLeftNode())
				+ getSize(x.getRightNode()); 
			
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
		System.out.println("Tentando apagar " + nodeToDelete.getData() + " " +
				nodeToDelete.getLeftNode() + " " +
				nodeToDelete.getRightNode()
				);
		//se tem dois filhos
		if ((nodeToDelete.getLeftNode()!= null) && (nodeToDelete.getRightNode()!= null )) {
			System.out.println("Nessa versão - Não é possível apagar nós com 2 filhos");
		}
		//se só tem um filho
		if (getSize(nodeToDelete) == 2) {
			//pai tem que ligar no filho dele na perna certa
			Node child;
			if (nodeToDelete.getLeftNode() != null)
				child = nodeToDelete.getLeftNode();
			else
				child = nodeToDelete.getRightNode();
			
			//se tiver tentando apagar a raiz
			//o filho será a nova raiz e sai do método
			if (nodeToDelete == root) {
				child.dadNode = null;
				root = child;
				return;
			}
			
			if (nodeToDelete.dadNode.getLeftNode() == nodeToDelete)
				nodeToDelete.dadNode.setLeftNode(child);
			else
				nodeToDelete.dadNode.setRightNode(child);
			
			child.setDadNode(nodeToDelete.dadNode);	
		}
			
		
		//se não tem filho
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
	
	//- verificar se é estritamente binária (se tem 0 ou dois filhos função recursiva 
	public boolean isStrictBinaryTree() {
		return isStrictBinaryTree(root);
	}
	public boolean isStrictBinaryTree(Node x) {
		if (x.getLeftNode()!= null && x.getRightNode()!= null)
			return true;
		
		if (x.getLeftNode()== null && x.getRightNode()== null)
			return true;
		
		if (x.getLeftNode()== null && x.getRightNode()!= null)
			return false;
		
		if (x.getLeftNode()!= null && x.getRightNode()== null)
			return false;
		
		return (isStrictBinaryTree(x.getLeftNode())
				&& isStrictBinaryTree(x.getRightNode()));
	}
	public int getRoot() {
		return root.data;
	}
	
	public int depth (Node x) {
		  // calculo da profundidade do no x
		  if(x == root) 
		    return 0;
		  
		  return 1 + depth(x.dadNode);
	}
	
	public int getHeight () {
		return getHeight(root); 
	}
	//encontra altura da árvore
	//Se v é um no externo, então a altura de v  é 0.
	//Caso contrário, a altura de v é um mais a altura máxima dos filhos de v.
	//A altura total de uma árvore T é definida como a altura da raiz de T.

	
	public int getHeight (Node aux) {
	    if (aux == null) {
	        return -1;
	    } else 
	    	return Math.max(getHeight(aux.getLeftNode()), 
	    			getHeight(aux.getRightNode()))+1;  
	}

	public boolean isBalanced() {
		return isBalanced(root);
	}
	
	private boolean isBalanced(Node v) {
		if (v == null) 
			return true;
		
		int bf = getHeight(v.getLeftNode()) - getHeight(v.getRightNode());
		
		return (Math.abs(bf)) <= 1 
				&& isBalanced(v.getLeftNode()) 
				&& isBalanced(v.getRightNode());
	}
	/*
	public boolean isBalanced(Node aux) {
		//condiçao de parada
		if (aux == null) 
			return true;
				
		//alturas de duas subárvores diferem de, no máximo em módulo, 1 
		if (Math.abs(getHeight(aux.getLeftNode()) - getHeight(aux.getRightNode())) >1) 
			return false;
		
		//chamar ela mesma
		return (isBalanced(aux.getLeftNode()) 
		&& isBalanced(aux.getRightNode()));
		
	}
	*/

}
