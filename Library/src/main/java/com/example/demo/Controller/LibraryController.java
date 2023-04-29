package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.LibraryService;
import com.example.demo.model.Library;




@RestController
@RequestMapping
public class LibraryController {
	  @Autowired
	  LibraryService libraryService;
	
	@GetMapping("/get")
	public List<Library> getDetails()
	{
		return libraryService.getDetails();
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id) {
		return libraryService.deleteDetails(id);
	}

	@PostMapping("/post")
	public Library postDetails(@RequestBody Library x)
	{
		return libraryService.postDetails(x);
	}
	
	@PutMapping("/put/{id}")
	public Library updateCourseDetails(@RequestBody Library x)
	{
		return libraryService.updateCourseDetails(x);
	}
	
	@GetMapping("/sort/{field}")
	public List<Library>sortStudent(@PathVariable String field)
	{
		return libraryService.sortStudent(field);
	}
	@GetMapping("/sortdesc/{field}")
	public List<Library>sortStudentdesc(@PathVariable String field)
	{
		return libraryService.sortStudentdesc(field);
	}
	
	@GetMapping("/page/{offset}/{pagesize}")
	public List<Library>pageStudent(@PathVariable int offset,@PathVariable int pagesize )
	{
		return libraryService.pageStudent(offset,pagesize);
	}
	
	@GetMapping("/value")
	public List<Library>sortpage(@RequestParam int offset,@RequestParam int pagesize,@RequestParam String field)
	{
		return libraryService.sortpage(offset,pagesize,field);
	}

}
