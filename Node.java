import java.util.ArrayList;	
public class Node {
	public int data; 
	Node dadNode, leftNode, rightNode;
	
	public Node getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
		if (leftNode != null) leftNode.setDadNode(this);
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
		if (rightNode != null)
			rightNode.setDadNode(this);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public Node(int data) {
		this.data = data;
	}
	public Node getDadNode() {
		return dadNode;
	}
	public void setDadNode(Node dadNode) {
		this.dadNode = dadNode;
	}

	public boolean isInternal() {
		return (leftNode != null || 
				rightNode != null);
	}
	public boolean isExternal() {
		return !isInternal();
	}
	
	public String toString() {
		return data + "";
	}
	


}
