
/*

A Hashtable project to practice data structures. Using an Array of LinkedLists that hold HashElements
 to practice Chaining.




*/


public class Hash<k,v> {

	public class hashElement<k,v> {
		k key;
		v value;
				
		public hashElement (k key, v value) {
			this.key = key;
			this.value = value;
						
				}
		}
	
	LinkedList<hashElement<k,v>>[] hashArray;
	int size;
	
	public Hash(int size){
		
		this.size = size;
		
		hashArray = (LinkedList<Hash<k,v>.hashElement<k, v>>[]) new LinkedList[size]; 
		
		for(int x = 0; x < hashArray.length; x++) {
			
			hashArray[x] = new LinkedList<Hash<k,v>.hashElement<k, v>>();
			
		}
		
	}
	
	
	
}
