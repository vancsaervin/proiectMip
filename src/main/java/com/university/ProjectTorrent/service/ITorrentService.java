package com.university.ProjectTorrent.service;

import java.util.List;

import com.university.ProjectTorrent.model.Torrent;

public interface ITorrentService {
	
	List<Torrent> get();
	
	Torrent get(int id);
	
	void save(Torrent torrent);
	
	void delete(int id);
}
