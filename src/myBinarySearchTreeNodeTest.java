import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeNodeTest {
    @Test
    public void test1_size(){
        //Testing size method by passing array of size 6
        int[] A = {8, 3, 5, 7, 2, 9};
        myBinarySearchTreeNode bst = new myBinarySearchTreeNode(A);
        //Test passed
        assertEquals(6, bst.size());
    }
    @Test
    public void test2_height(){
        //Passing sorted array of size 8 to test height method
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        myBinarySearchTreeNode bst = new myBinarySearchTreeNode(A);
        //Test passed
        assertEquals(7, bst.height());
    }
    @Test
    public void test3_depth(){
        //Testing depth method if it returns the accurate result for selected node
        int[] A = {3, 0, 1, 4, 6};
        myBinarySearchTreeNode bst = new myBinarySearchTreeNode(A);
        //Test passed
        assertEquals(2, bst.depth(6));
    }
    @Test
    public void test4_duplicate(){
        //Testing to see if the error message would print if a number already in the tree is inserted.
        int[] A = {1, 2, 3, 4, 5, 6};
        int [] exp = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode bst = new myBinarySearchTreeNode(A);
        bst.insert(4);
        //Test passed
        assertArrayEquals(exp, A);
    }
    @Test
    public void test5_insert(){
        //Inserting a new number into the tree then checking its depth to see if it was inserted in the right place
        int [] A = {1, 2, 3, 4, 5, 6, 8, 9};
        myBinarySearchTreeNode bst = new myBinarySearchTreeNode(A);
        bst.insert(7);
        //Test passed
        assertEquals(7, bst.depth(7));
    }
}