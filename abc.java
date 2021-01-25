class Server{
String a;
Server(String a){
	System.out.println("I am "+a);
}
}
class Client{
String b;
Client(String b){
	System.out.println("I am "+b);
}

}
class Utility{
String c;
Utility(String c){
	System.out.println("I am "+c);
}
public static void main(String[] args) {
	Server s=new Server("Server");
	Client c=new Client("Client");
	Utility u=new Utility("Utility");


}
}