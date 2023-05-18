package veriyapilarivize;

public class Uygulama {
		
	static Node head = null;
	static Node tail = null;
	static Node temp = null;
	public static void balonPozisyonuBul(int m, int n) {
		
		for (int i=1;i<=n;i++) {
			if (head == null) {//liste oluşmamışsa
				Node newNode = new Node(i);
				head = newNode;
				tail = newNode;
			}
			else {
				Node newNode = new Node(i);
				tail.next =newNode;
				tail=newNode;
			}
		}
		tail.next=head;//liste oluştuktan sonra son elemanı head'e bağlar
		
