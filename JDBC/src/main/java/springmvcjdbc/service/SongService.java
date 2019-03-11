package springmvcjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvcjdbc.DAO.SongDAO;
import springmvcjdbc.entities.Song;

@Service
@Transactional
public class SongService {

	@Autowired
	private SongDAO songdao;

	public List<Song> findAll() {
		return songdao.findAll();
	}

	public Song findbyID(int id) {
		return songdao.findbyID(id);
	}

	public void save(Song song) {
		songdao.Save(song);
	}

	public void update(Song song) {
		songdao.update(song);
	}

	public void delete(int id) {
		songdao.delete(id);
	}
}
