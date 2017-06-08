
public class candidate {
int id;
int wardNo;
String CName;


public candidate(int id, int wno, String name){
	this.id=id;
	this.wardNo=wno;
	this.CName=name;
}


String getName(){
	return CName;
}

int getid(){
	return id;
}

}
