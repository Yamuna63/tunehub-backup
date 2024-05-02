package com.kodnest.tunehub.service;

import java.util.List;

import com.kodnest.tunehub.entity.Playlist;
import com.kodnest.tunehub.entity.Song;



public interface PlaylistService {

	public void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllPlaylists();

//	public boolean playlistExists(Playlist playlist);



}
