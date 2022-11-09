public class SymbolTable{ //first question: still a bit 
						//shakey on syntax of comparable and compare to... insight?

	//node object 
	node(k,v){ //k extendends comparable k?
		k key; 
		v val; 
		Node left; 
		Node right;
		
	}
	//puts specified value in symbol table 
	public void put(value v, key k){
		root = put(root,v,k)
	}
	
	//recursive put method callled 
	private node put(node n, value v, key k){
		if (n == null) return new Node(v,k); //exit case 
		int cmp = k.compareTo(n.k); 
		
		if (cmp < 0){
			n.left = put(n.left, v, k); 
		}
		else{ 
			if(cmp > 0){
				n.right = put(n.right, v, k); 
			}
			else
				n.v = v; 
		}
		return n;
	}
	
	
	// get method 
	public value get(key k){
		return get(root, k);
	}
	
	//recursive part of get method 
	private value get(node n, key k){
		if(n == null) 
			return null; 
		int cmp = k.compareTo(n.k); 
		if(cmp < 0) return get(n.left, k); 
		if(cmp > 0) return get(n.right, k); 
		return n.value; 
	}
	
	//floor method 
	public key floor(key k){
		node x = floor(root,key); 
		if(x == null) return null; 
		return x.key; 
	} 
	
	//recursive part of floor method 
	private node floor(node x, key k){
		if(x == null) return null; 
		int cmp = k.compareTo(x.key); 
		if(cmp == 0) return x; 
		if(cmp < 0) return floor(x.left, k); 
		node t = floor(x.right, k); 
		if(t != null) return t; 
		return x; 
	}

}