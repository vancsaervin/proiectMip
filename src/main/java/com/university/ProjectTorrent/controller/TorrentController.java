package com.university.ProjectTorrent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.ProjectTorrent.model.Torrent;
import com.university.ProjectTorrent.service.TorrentService;

@RestController
@RequestMapping("/api")
public class TorrentController {
	
	@Autowired
	private TorrentService torrentService;
	
	@GetMapping("/torrent")
	public List<Torrent> get(){
		return torrentService.get();
	}
	
	@PostMapping("/torrent")
	public Torrent save(@RequestBody Torrent torrentObj) {
		torrentService.save(torrentObj);
		return torrentObj;
	}
	
	@GetMapping("/torrent/{id}")
	public Torrent get(@PathVariable int id) {
		Torrent torrentObj = torrentService.get(id);
		if(torrentObj == null) {
			throw new RuntimeException("Employee with id " + id + "is not found.");
		}
		return torrentObj;
	}
	
	@DeleteMapping("/torrent/{id}")
	public String delete(@PathVariable int id) {
		torrentService.delete(id);
		return "Torrent with ID " + id + " has been deleted!";
	}
	
	@PutMapping("/torrent")
	public Torrent update(@RequestBody Torrent torrentObj) {
		torrentService.save(torrentObj);
		return torrentObj;
	}
}
