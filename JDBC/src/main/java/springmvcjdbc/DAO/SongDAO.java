package springmvcjdbc.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import springmvcjdbc.entities.Song;
import springmvcjdbc.entities.SongMapper;

@Service
@Repository
public class SongDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;

	public void Save(Song song) {
		String sql = "insert into song value(?,?,?,?)";
		jdbctemplate.update(sql, song.getId(), song.getName(), song.getArtist(), song.getDescription());
	}

	public void delete(int id) {
		String sql = "delete from song where id=?";
		jdbctemplate.update(sql, id);
	}

	public void update(Song song) {
		String sql = "update song set name= ?,artist=?,description=? where id= ?";
		jdbctemplate.update(sql, song.getName(), song.getArtist(), song.getDescription(), song.getId());
	}

	public Song findbyID(int id) {
		String sql = "select * from song where id=?";
		return jdbctemplate.queryForObject(sql, new SongMapper(), id);
	}

	public List<Song> findAll() {
		String sql = "select * from song";
		return jdbctemplate.query(sql, new SongMapper());
	}
}
