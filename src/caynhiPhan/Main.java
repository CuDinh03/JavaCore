package caynhiPhan;

public class Main {
    public static void main(String[] args) {

        BST<String> tree = new BST<>();
        tree.insert("Cu");
        tree.insert("Viet");
        tree.insert("Tu");
        tree.insert("Son");
        tree.insert("Loc");
        tree.insert("Toan");
        tree.insert("An");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
