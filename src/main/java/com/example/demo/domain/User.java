package com.example.demo.domain;



public class User {

private Integer id;

private String username;

private Integer age;

private String password;



public String getPassworld() {
	return password;
}



public void setPassworld(String passworld) {
	this.password = passworld;
}



public Integer getId() {

return id;

}



public void setId(Integer id) {

this.id = id;

}










public Integer getAge() {

return age;

}



public String getUsername() {
	return username;
}



public void setUsername(String username) {
	this.username = username;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public void setAge(Integer age) {

this.age = age;

}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "username:"+this.getUsername()+"password:"+this.getPassword()+"id"+this.getId()+"age"+this.getAge();
	}


}

