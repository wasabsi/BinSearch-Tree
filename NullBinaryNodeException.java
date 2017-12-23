package edu.cofc.csci230;

/**
 * 
 * Exception used in binary tree / binary search tree 
 * 
 * This exception is thrown when a null binary node, or 
 * a binary node with a null element is added to the 
 * binary tree or binary search tree.
 * 
 */
@SuppressWarnings("serial")
public class NullBinaryNodeException extends Exception {

	public NullBinaryNodeException() {
		super( "Null binary node" );
	}
} // end NullBinaryNodeException class
