package service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TwitterEntity;

/**
 * Session Bean implementation class TwitterEJB
 */
@Stateless
@LocalBean
public class TwitterEJB {

   @PersistenceContext
   private EntityManager StoreToDB;
    public TwitterEJB() {
        // TODO Auto-generated constructor stub
    }
    
    public void addNew(TwitterEntity twitterEntity) {
    	System.out.println("=======Writing tweets to the DB============");
    	StoreToDB.persist(twitterEntity);
    	
    }
    
    public List<TwitterEntity> getMyTweets(){
    	
		return new ArrayList<TwitterEntity> (StoreToDB.createQuery("Select s from tweets_tbl AS s", TwitterEntity.class).getResultList());
    	
    }

}
