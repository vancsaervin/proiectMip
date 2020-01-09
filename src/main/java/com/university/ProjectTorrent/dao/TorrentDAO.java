package com.university.ProjectTorrent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.university.ProjectTorrent.model.Torrent;

@Repository
public class TorrentDAO implements ITorrentDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Torrent> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Torrent> query = currentSession.createQuery("from Torrent", Torrent.class);
		List<Torrent> list = query.getResultList();
		return list;
	}

	@Override
	public Torrent get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Torrent torrentObj = currentSession.get(Torrent.class, id);
		return torrentObj;
	}

	@Override
	public void save(Torrent torrent) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(torrent);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Torrent torrentObj = currentSession.get(Torrent.class, id);
		currentSession.delete(torrentObj);
	}

}
