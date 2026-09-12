
package account;

public class Account {
    private String name; // instance variable
    public Account (String name){
        this.name = name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
