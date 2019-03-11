package springmvcjdbc.entities;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class SongMapper implements RowMapper<Song>{

	@Override
	public Song mapRow(ResultSet rs, int rowNum) throws SQLException {
		Song song = new Song();
		song.setId(rs.getInt("id"));
		song.setName(rs.getString("name"));
		song.setArtist(rs.getString("artist"));
		song.setDescription(rs.getString("description"));
		return song;
	}


}
