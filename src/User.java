public class User {

    private String name, login, password;

    User (String name, String login, String password){
        this.name=name;
        this.login=login;
        this.password=password;
    }

    public boolean enter(String login, String password){
        return this.login.equals(login) && this.password.equals(password);
    }

    public String getName(){
        return this.name;
    }

}
