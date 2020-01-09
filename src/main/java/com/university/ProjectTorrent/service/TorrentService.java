package com.university.ProjectTorrent.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.ProjectTorrent.dao.TorrentDAO;
import com.university.ProjectTorrent.model.Torrent;

@Service
public class TorrentService implements ITorrentService {
	
	@Autowired
	private TorrentDAO torrentDAO;
	
	@Transactional
	@Override
	public List<Torrent> get() {
		return torrentDAO.get();
	}
	
	@Transactional
	@Override
	public Torrent get(int id) {
		return torrentDAO.get(id);
	}
	
	@Transactional
	@Override
	public void save(Torrent torrent) {
		torrentDAO.save(torrent);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		torrentDAO.delete(id);
	}

}
