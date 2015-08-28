import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.apache.catalina.User;

import customTools.DBUtil;
import fourthweb.Post;

 

public class UserDB {

public static void insert(Post user) {
EntityManager em = DBUtil.getEmFactory().createEntityManager();
EntityTransaction trans = em.getTransaction();
trans.begin(); 
try {
em.persist(user);
trans.commit();
} catch (Exception e) {
System.out.println(e);
trans.rollback();
} finally {
em.close();
}
}

public static void update(Post user) {
EntityManager em = DBUtil.getEmFactory().createEntityManager();
EntityTransaction trans = em.getTransaction();
trans.begin(); 
try {
em.merge(user);
trans.commit();
} catch (Exception e) {
System.out.println(e);
trans.rollback();
} finally {
em.close();
}
}

public static void delete(Post user) {
EntityManager em = DBUtil.getEmFactory().createEntityManager();
EntityTransaction trans = em.getTransaction();
trans.begin(); 
try {
em.remove(em.merge(user));
trans.commit();
} catch (Exception e) {
System.out.println(e);
trans.rollback();
} finally {
em.close();
} 
}



    public static List<Post> selectUnprocessedInvoices() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT p from Post p" ;
                      
        TypedQuery<Post> q = em.createQuery(qString, Post.class);

        List<Post> post;
        try {
            post = q.getResultList();
            if (post == null || post.isEmpty())
                post = null;
        } finally {
            em.close();
        }
        return post;
    }






}