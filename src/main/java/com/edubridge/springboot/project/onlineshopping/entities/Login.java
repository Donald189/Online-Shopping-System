package com.edubridge.springboot.project.onlineshopping.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "logIn")
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	private String userName;
	
	private String password;
	
	@OneToOne
	private User user;
	
	public Login() {}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(loginId, password, user, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return loginId == other.loginId && Objects.equals(password, other.password) && Objects.equals(user, other.user)
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", userName=" + userName + ", password=" + password + ", user=" + user
				+ "]";
	}
	
	

}
