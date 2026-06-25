
public class Start {

	public static void main(String[] args) {
		System.out.println("Árvore Binária");
		Node raiz = new Node(1);
		Node dois = new Node(2);
		Node tres = new Node(3);
		Node quatro = new Node(4);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);
				
		raiz.setRightNode(dois);
		
		System.out.println("Root " + arvoreExemplo.getRoot());  
		dois.setRightNode(tres);
		dois.setLeftNode(new Node(20));
		Node sete = new Node(7);
		tres.setRightNode(sete);
		sete.setLeftNode(quatro);

		
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		System.out.println("É estritamente Binária " + arvoreExemplo.isStrictBinaryTree());
		
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
			
		System.out.println("Altura da árvore: " + arvoreExemplo.getHeight());
		
		System.out.println("Altura da subárvore 2: " + arvoreExemplo.getHeight(dois));
		System.out.println("Altura da subárvore 3: " + arvoreExemplo.getHeight(tres));

		System.out.print("Arvore é balanceada? ");
		System.out.println(arvoreExemplo.isBalanced());
	    
		System.out.print("Arvore é Perfeitamente balanceada? ");
		System.out.println(arvoreExemplo.isPerfectBalanced());

		System.out.println("É ABB?" + arvoreExemplo.isBinarySearchTree());
	}
}
