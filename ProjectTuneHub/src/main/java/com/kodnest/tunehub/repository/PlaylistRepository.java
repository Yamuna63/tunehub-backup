package com.kodnest.tunehub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.entity.Playlist;
import com.kodnest.tunehub.entity.Song;


public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

//	public Object findByPlaylist(Playlist playlist);


}
