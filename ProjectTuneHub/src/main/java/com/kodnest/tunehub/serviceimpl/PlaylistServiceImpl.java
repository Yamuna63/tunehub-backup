package com.kodnest.tunehub.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.entity.Playlist;
import com.kodnest.tunehub.entity.Song;
import com.kodnest.tunehub.repository.PlaylistRepository;
import com.kodnest.tunehub.service.PlaylistService;


@Service
public class PlaylistServiceImpl implements PlaylistService{

	@Autowired
	PlaylistRepository playlistrepository;
	
	@Override
	public void addplaylist(Playlist playlist) {
		playlistrepository.save(playlist);
	}

	@Override
	public List<Playlist> fetchAllPlaylists() {
		List<Playlist> allplaylist = playlistrepository.findAll();
		return allplaylist;
	}
	
	//To check the duplicate playlist
	
//	public boolean playlistExists(Playlist playlist) {
//		if(playlistrepository.findByPlaylist(playlist)!=null);
//		{
//			return true;
//		}
//		
//	}	
}
