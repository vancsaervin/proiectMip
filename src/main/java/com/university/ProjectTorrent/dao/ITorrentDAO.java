package com.university.ProjectTorrent.dao;

import java.util.List;

import com.university.ProjectTorrent.model.Torrent;

public interface ITorrentDAO {
	
	List<Torrent> get();
	
	Torrent get(int id);
	
	void save(Torrent torrent);
	
	void delete(int id);
}
