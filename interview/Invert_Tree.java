package interview;
import java.util.*;
public class Invert_Tree
{

        public static void invertTree(int[] tree) {
            if (tree == null || tree.length == 0) {
                return; // Empty or null tree
            }
            int depth=1
            for (int i = 0; 2 * i + 1 < tree.length; i++)
            {
                int temp = tree[2 * i + 1];           // Store left child
                tree[2 * i + 1] = tree[2 * i + 2];  // Move right child to left
                tree[2 * i + 2] = temp;           // Move original left child to right
            }
        }


        public static void main(String[] args) {
            int t[] = {4, 2, 7, 1, 3, 6, 9};
            System.out.println("Original tree: " + Arrays.toString(t));
            invertTree(t);
            System.out.println("Inverted tree: " + Arrays.toString(t));
        }
    }


