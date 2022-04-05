package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;


import entity.InstructorDetail;
import util.HibernateUtil;

public class InstructorDetailDao {
	public void saveInstructorDetail(InstructorDetail instructorDetail) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(instructorDetail);
			transaction.commit();
		}catch(Exception e)
		{
			if(transaction!=null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
