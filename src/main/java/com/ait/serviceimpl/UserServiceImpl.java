package com.ait.serviceimpl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.dto.SignupForm;
import com.ait.entity.Role;
import com.ait.entity.User;
import com.ait.repo.RoleRepo;
import com.ait.repo.UserRepo;
import com.ait.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepo userrepo;
	
	
	@Override
	public String signUp(SignupForm signupform) {
		User userData = userrepo.findByEmail(signupform.getEmail());
		if(userData!=null) {
			return "email already exists";
		}
		if(signupform.getConfirmPassword().equals(signupform.getPassword())) {
			User user=new User();
			user.setStatus(false);
			
			Role role=new Role();
			role.setRoleId(2);
			
			user.setRole(role);
			
			BeanUtils.copyProperties(signupform, user);
			
			userrepo.save(user);
		   return "successfully registered";
		}
		return "password and confirm password must be same";
	}
}
