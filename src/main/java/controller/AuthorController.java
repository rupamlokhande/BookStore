package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exception.ResourceNotFoundException;
import model.Author;
import repository.AuthorRepository;

@RestController
@RequestMapping("/api")
public class AuthorController {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@GetMapping("/allblogs")
	public List<Author> getAllBlogse(){
		System.out.println("Get all blogs called");
		return authorRepository.findAll();
	}

	@GetMapping("/all")
	public String getAllBlogs(){
        String hello = "hello";
		return hello;
	}
	
	@PostMapping("/saveblogs")
	public Author createBlogs(@RequestBody Author author) {
		System.out.println("save blog details called");
		return authorRepository.save(author);
	}
	
	// @DeleteMapping("/deleteblogs/{id}")
	// public Map<String, Boolean> deleteBlog(@PathVariable(value="id") Long blogId) throws ResourceNotFoundException
	// {
	// 	Blogs blog=blogRepository.findById(blogId).orElseThrow(()-> new ResourceNotFoundException("Blog not found" + blogId));
	// 	blogRepository.delete(blog);
	// 	Map<String, Boolean> response = new HashMap<>();
	// 	response.put("deleted", Boolean.TRUE);
	// 	return response;
	// }
	
	// @PutMapping("/updateblogs/{id}")
	// public ResponseEntity<Blogs> updateBlog(@PathVariable(value="id") Long blogId, @RequestBody Blogs blogDetails) throws ResourceNotFoundException
	// {
	// 	Blogs blog=blogRepository.findById(blogId).orElseThrow(()-> new ResourceNotFoundException("Blog not found" + blogId));
		
	// 	blog.setBlogTitle(blogDetails.getBlogTitle());
	// 	blog.setBlogDescription(blogDetails.getBlogDescription());
	// 	blog.setPostedOn(blogDetails.getPostedOn());
	// 	final Blogs updateBlog = blogRepository.save(blog);
		
	// 	return ResponseEntity.ok(updateBlog);
	// }
}