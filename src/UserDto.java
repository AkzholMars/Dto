public class UserDto {
    private String login;
    private int age;
    private String email;
    //private int id;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "UserDto{" +
                "login='" + login + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDto(User user) {
        this.login = user.getLogin();
        this.age = user.getAge();
        this.email = user.getEmail();
        //this.id = user.getId();
    }
}
