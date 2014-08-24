package test;

import com.bargittachen.BinaryTree;
import com.bargittachen.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BinaryTreeTest {


    @Test
    public void create_tree_with_invalid_inputs(){

        BinaryTreeNode head = BinaryTree.createTreeWithPreInOrders(null,null);
        assertNull(head);
    }

    @Test
    public void create_tree_with_root(){
        int[] preorder = new int[]{1};
        int[] inorder = new int[]{1};
        BinaryTreeNode head = BinaryTree.createTreeWithPreInOrders(preorder,inorder);
        assertEquals(1,head.value);
        assertNull(head.leftChild);
        assertNull(head.rightChild);
    }

    @Test
    public void create_tree_with_left_sub_trees(){
        int[] preorder = new int[]{1,2,3};
        int[] inorder = new int[]{3,2,1};
        BinaryTreeNode head = BinaryTree.createTreeWithPreInOrders(preorder,inorder);
        assertEquals(1, head.value);
        assertEquals(2, head.leftChild.value);
        assertNull(head.rightChild);
        assertEquals(3, head.leftChild.leftChild.value);
        assertNull(head.leftChild.rightChild);
    }

    @Test
    public void create_tree_with_right_sub_trees(){
        int[] preorder = new int[]{1,2,3};
        int[] inorder = new int[]{1,2,3};
        BinaryTreeNode head = BinaryTree.createTreeWithPreInOrders(preorder,inorder);
        assertEquals(1, head.value);
        assertEquals(2, head.rightChild.value);
        assertNull(head.leftChild);
        assertEquals(3, head.rightChild.rightChild.value);
        assertNull(head.rightChild.leftChild);
        assertNull(head.rightChild.rightChild.rightChild);
        assertNull(head.rightChild.rightChild.leftChild);
    }

    @Test
    public void create_tree_with_sub_trees(){
        int[] preorder = new int[]{1,2,4,7,3,5,6,8};
        int[] inorder = new int[]{4,7,2,1,5,3,8,6};
        BinaryTreeNode head = BinaryTree.createTreeWithPreInOrders(preorder,inorder);
        assertEquals(1, head.value);
        assertEquals(2, head.leftChild.value);
        assertNull(head.leftChild.rightChild);
        assertEquals(4, head.leftChild.leftChild.value);
        assertEquals(7, head.leftChild.leftChild.rightChild.value);
        assertNull( head.leftChild.leftChild.leftChild);

        assertEquals(3, head.rightChild.value);
        assertEquals(5, head.rightChild.leftChild.value);
        assertEquals(6, head.rightChild.rightChild.value);
        assertEquals(8, head.rightChild.rightChild.leftChild.value);
    }
}
