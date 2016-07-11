package ua.in.dergachovda.tree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        CustomBinaryTree tree = new CustomBinaryTree();
        tree.addNode(2, "Dog");
        tree.addNode(3, "Turtle");
        tree.addNode(1, "Cat");
        tree.addNode(5, "Duck");
        tree.addNode(12, "Cat");
        tree.addNode(7, "Cat");

        System.out.println(tree.getNode(5));
    }


}
