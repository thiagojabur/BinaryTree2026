
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
		raiz.setRightNode(tres);
		
		tres.setLeftNode(quatro);
		tres.setRightNode(new Node(5));
		
		quatro.setRightNode(new Node(6));
		
		arvoreExemplo.printPreOrder();
		arvoreExemplo.printPosOrder();
		arvoreExemplo.printInOrder();
	}
}
