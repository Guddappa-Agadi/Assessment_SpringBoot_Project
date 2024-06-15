package com.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController {

	@Autowired
	private GuestRepo gr;

	@PostMapping("/add")
	public <S extends Guest> S save(@RequestBody S entity) {
		return gr.save(entity);
	}

	@GetMapping("/get/sort")
	public List<Guest> findAll(Sort sort) {
		return gr.findAll(sort);
	}

	@GetMapping("/get/pages")
	public Page<Guest> findAll(Pageable pageable) {
		return gr.findAll(pageable);
	}

	@GetMapping("/get")
	public List<Guest> findAll() {
		return gr.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<Guest> findById(@PathVariable("id") Integer guest_id) {
		return gr.findById(guest_id);
	}

	@DeleteMapping("/get/{id}")
	public void deleteById(Integer guestid) {
		gr.deleteById(guestid);
	}
	@PutMapping("/get/{id}")
	public Guest updateById(@PathVariable("id") Integer guest_id, @RequestBody Guest g) {
		return gr.save(g);
	}
	@GetMapping("/get/pageNo")
	public List<Guest> page(Pageable pa){
		Page<Guest> p = gr.findAll(pa);
		return p.getContent();
	}
}
