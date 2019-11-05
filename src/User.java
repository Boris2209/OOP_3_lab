public class User {

    String name, login, password;

    User (String name, String login, String password){
        this.name=name;
        this.login=login;
        this.password=password;
    }

    public boolean enter(String login, String password){
        if(this.login.equals(login) && this.password.equals(password)){
            return true;
        }
        return false;
    }

    public String getName(){
        return this.name;
    }
}
