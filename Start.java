
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
		
		System.out.println("Root " + arvoreExemplo.getRoot());  
		raiz.setRightNode(tres);
		tres.setLeftNode(quatro);
			
		Node sete = new Node(7);
		dois.setRightNode(sete);
		Node dez = new Node(10);
		dois.setLeftNode(dez);
				
		Node cinco = new Node(5);
		tres.setRightNode(cinco);
		
		Node seis = new Node(6);
		quatro.setRightNode(seis);
		sete.setRightNode(new Node(9));
		
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

	}
}
