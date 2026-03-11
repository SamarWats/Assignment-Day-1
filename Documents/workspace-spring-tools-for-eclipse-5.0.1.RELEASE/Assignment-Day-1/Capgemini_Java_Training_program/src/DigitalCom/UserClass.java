package DigitalCom;

public class UserClass implements IValidate {

    private String userid;
    private String password;


    public void addUser(String userid, String password) {
        this.userid = userid;
        this.password = password;
        System.out.println("User Registered Successfully!");
    }


    @Override
    public boolean IsAuthenticated(String userid, String password) {
    	// it compares the given userId and Password 
        return this.userid.equals(userid) && this.password.equals(password);
    }

    @Override
    public String toString() {
        return "User [userid=" + userid + "]";
    }
}