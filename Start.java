
public class Start {

	public static void main(String[] args) {
		System.out.println("Árvore Binária");
		Node raiz = new Node(1);
		Node dois = new Node(2);
		Node tres = new Node(3);
		Node quatro = new Node(4);
		BinaryTree arvoreExemplo 
		= new BinaryTree(raiz);
		System.out.println("Criou a arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		raiz.setLeftNode(dois);
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		raiz.setRightNode(tres);
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		tres.setLeftNode(quatro);
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
		tres.setRightNode(new Node(5));
		System.out.println("A arvore com:  " + arvoreExemplo.getSize() + " elemento");
		
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
		arvoreExemplo.delete(dois);
		arvoreExemplo.printPreOrder();
	}
}
