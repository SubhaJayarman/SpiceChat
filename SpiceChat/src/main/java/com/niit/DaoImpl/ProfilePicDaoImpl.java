package com.niit.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Dao.ProfilePicDao;
import com.niit.models.ProfilePic;
@Repository
@Transactional
public class ProfilePicDaoImpl implements ProfilePicDao {

	@Autowired
	private SessionFactory sessionFactory;
	public void uploadProfilePicture(ProfilePic profilePicture) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture);
	}

	public ProfilePic getProfilePicture(String email) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		ProfilePic profilePicture=(ProfilePic) session.get(ProfilePic.class, email);
		return profilePicture;
	}

}