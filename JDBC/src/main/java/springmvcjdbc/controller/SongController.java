package springmvcjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvcjdbc.entities.Song;
import springmvcjdbc.service.SongService;

@Controller
public class SongController {

	@Autowired
	private SongService songservice;

	@RequestMapping(value = { "/", "/listsong" })
	public String listSong(Model model) {
		model.addAttribute("listsong", songservice.findAll());
		return "listsong";
	}

	@RequestMapping("/savesong")
	public String InsertSong(Model model) {
		model.addAttribute("song", new Song());
		return "savesong";
	}
	@RequestMapping("/viewsong/{id}")
	public String viewSong(Model model,@PathVariable int id){
		Song song = songservice.findbyID(id);
		model.addAttribute("song", song);
		return "viewsong";
	}
	 @RequestMapping("/updatesong/{id}")
	  public String updateCustomer(@PathVariable int id, Model model) {
	    Song song = songservice.findbyID(id);
	    model.addAttribute("song", song);
	    return "updatesong";
	  }
	 @RequestMapping("/saveSong")
	  public String doSaveSong(@ModelAttribute("Song") Song song, Model model) {
	    songservice.save(song);
	    model.addAttribute("listsong", songservice.findAll());
	    return "listsong";
	  }
	  @RequestMapping("/updateSong")
	  public String doUpdateCustomer(@ModelAttribute("Song") Song song, Model model) {
	    songservice.update(song);
	    model.addAttribute("listsong", songservice.findAll());
	    return "listsong";
	  }
	  
	  @RequestMapping("/songDelete/{id}")
	  public String doDeleteCustomer(@PathVariable int id, Model model) {
	    songservice.delete(id);
	    model.addAttribute("listsong", songservice.findAll());
	    return "listsong";
	  }
}
