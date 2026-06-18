
public class Start {

	public static void main(String[] args) {
		System.out.println("Árvore Binária");
		Node raiz = new Node(1);
		Node dois = new Node(2);
		Node tres = new Node(3);
		Node quatro = new Node(4);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);
		
		raiz.setLeftNode(dois);
		arvoreExemplo.delete(raiz);
		
		System.out.println("Root " + arvoreExemplo.getRoot());  
		dois.setRightNode(tres);
		tres.setLeftNode(quatro);
		System.out.println(arvoreExemplo.isStrictBinaryTree());
		arvoreExemplo.printPreOrder();
		
		System.out.println("Profundidade de 2: " + arvoreExemplo.depth(dois));
		System.out.println("Profundidade de 3: " + arvoreExemplo.depth(tres));
		System.out.println("Profundidade de 4: " + arvoreExemplo.depth(quatro));
		
		/*
		 
		
		
		tres.setRightNode(new Node(5));
		
		quatro.setRightNode(new Node(6));
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		arvoreExemplo.printPreOrder();
		arvoreExemplo.printPosOrder();
		arvoreExemplo.printInOrder();
		System.out.println("\nNúmero de elementos: ");
		System.out.println(arvoreExemplo.getSize());
	
		System.out.println("Folhas");
		arvoreExemplo.listExternalNodes();
		System.out.println("\nNós Internos");
		arvoreExemplo.listInternalNodes();
		
		System.out.println(arvoreExemplo.search(1));
		arvoreExemplo.delete(raiz);
		
		arvoreExemplo.delete(dois);
		arvoreExemplo.delete(quatro);
	*/
		
	}
}
