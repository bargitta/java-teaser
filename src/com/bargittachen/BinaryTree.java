package com.bargittachen;


public class BinaryTree {
    public static BinaryTreeNode createTreeWithPreInOrders(int[] preorder, int[] inorder){
        if(preorder == null || inorder == null || preorder.length != inorder.length)
            return null;
        return createTree(preorder,0,preorder.length - 1,inorder,0,inorder.length - 1);
    }

    public static BinaryTreeNode createTree(int[] preorder, int preStartIndex, int preEndIndex, int[] inorder, int inStartIndex, int inEndIndex){

        if(preStartIndex > preEndIndex || inStartIndex > inEndIndex)
            return null;
        int headVal = preorder[preStartIndex];
        BinaryTreeNode head = new BinaryTreeNode(headVal);
        int startIndex = findIndex(inorder, headVal, inStartIndex, inEndIndex);
        int leftInStartIndex = inStartIndex;
        int leftInEndIndex = startIndex - 1;
        int leftRange = leftInEndIndex - leftInStartIndex + 1;

        int rightInStartIndex = startIndex + 1;
        int rightInEndIndex = inEndIndex;


        int leftPreStartIndex = preStartIndex + 1;
        int leftPreEndIndex = leftPreStartIndex + leftRange - 1;

        int rightPreStartIndex = leftPreEndIndex + 1;
        int rightPreEndIndex = preEndIndex;

        if(leftPreStartIndex > leftPreEndIndex)
        {
            head.leftChild = null;
        }else {
            head.leftChild = createTree(preorder, leftPreStartIndex, leftPreEndIndex, inorder, leftInStartIndex, leftInEndIndex);
        }
        if(rightPreStartIndex > rightPreEndIndex){
            head.rightChild = null;
        }else {
            head.rightChild = createTree(preorder, rightPreStartIndex, rightPreEndIndex, inorder, rightInStartIndex, rightInEndIndex);
        }
        return head;
    }

    private static int findIndex(int[] inorder, int headVal, int startIndex, int endIndex) {
        for(int i = startIndex; i <=  endIndex; i++){
            if(inorder[i] == headVal)
                return i;
        }
        throw new IllegalArgumentException();
    }
}
