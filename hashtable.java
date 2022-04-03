package project169;
public class hashtable {
	    private hashNode[]buckets;
	    private int size;
	    private int numofbuckets;
	    public hashtable() {
	        this(10);
	    }
	    public hashtable(int capacity) {
	        this.numofbuckets=capacity;
	        this.buckets=new hashNode[numofbuckets];
	        this.size=0;
	    }
	    private class hashNode{
	        private Integer key;
	        private String value;
	        private hashNode next;
	        public hashNode(Integer key,String value) {
	            this.key=key;
	            this.value=value;
	        }
	    }
	    public int getindex(int key) {
	        return key%numofbuckets;
	    }
	    public void put(Integer key,String value) {
	        if(key==null ||value==null) {
	            throw new IllegalArgumentException("key or value is null !!");
	        }
	        int index=getindex(key);
	        hashNode head=buckets[index];

	        while(head!=null) {
	            if(head.key.equals(key)) {
	                head.value=value;
	                return;
	            }
	            head=head.next;
	        }
	        size++;
	        head=buckets[index];
	        hashNode node=new hashNode(key,value);
	        node.next=head;
	        buckets[index]=node;
	    }
	    public String get(Integer key) {
	        if(key==null) {
	            throw new IllegalArgumentException("key is null !!");
	        }
	        int index=getindex(key);
	        hashNode head=buckets[index];
	        while(head!=null) {
	            if(head.key.equals(key)) {
	                return head.value;
	            }
	            head=head.next;
	        }
	        return null;
	    }
	    public String remove(Integer key) {
	        if(key==null) {
	            throw new IllegalArgumentException("key is null !!");
	        }
	        int index= getindex(key);
	        hashNode previous=null;
	        hashNode head=buckets[index];
	        while(head!=null) {
	            if(head.key.equals(key)) {
	                break;
	            }
	            previous=head;
	            head=head.next;
	        }
	        if(head==null) {
	            return null;
	        }
	        size--;
	        if(previous!=null) {
	            previous.next=head.next;
	        }else {
	            buckets[index]=head.next;
	        }
	        return head.value;
	    }
	    public static void main(String[] args) {
	        hashtable a=new hashtable (13);
	        a.put(1, "rama");
	        a.put(2, "rama");
	        a.put(3, "rama");
	        a.put(4, "rama");
	        a.put(5, "rama");
	        a.put(6, "rama");
	        a.put(7, "rama");
	        a.put(8, "rama");
	        a.put(9, "rama");
	        a.put(10, "rama");
	        a.put(11, "rama");
	        a.put(13, "rama");
	        a.put(26, "rama");

	        System.out.print(a.get(1));
	    }
	}
}
