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
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	private ManagerRepo mr;

	@PostMapping("/add")
	public <S extends Manager> S save(@RequestBody S entity) {
		return mr.save(entity);
	}

	@GetMapping("/get/sort")
	public List<Manager> findAll(Sort sort) {
		return mr.findAll(sort);
	}

	@GetMapping("/get/pages")
	public Page<Manager> findAll(Pageable pageable) {
		return mr.findAll(pageable);
	}

	@GetMapping("/get")
	public List<Manager> findAll() {
		return mr.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<Manager> findById(@PathVariable("id") Integer manager_id) {
		return mr.findById(manager_id);
	}

	@DeleteMapping("/get/{id}")
	public void deleteById(@PathVariable("id") Integer manager_id) {
		mr.deleteById(manager_id);
	}

	@PutMapping("/get/{id}")
	public Manager updateById(@PathVariable("id") Integer manager_id, @RequestBody Manager g) {
		return mr.save(g);
	}

	@GetMapping("/get/pageNo")
	public List<Manager> page(Pageable pa) {
		Page<Manager> p = mr.findAll(pa);
		return p.getContent();
	}
}
