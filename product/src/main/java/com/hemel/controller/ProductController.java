package com.hemel.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemel.model.Product;
import com.hemel.service.ProductService;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
	private ProductService service;

	public ProductController(ProductService service) {
		this.service = service;
	}

	@PostMapping
	public Product saveProduct(@RequestBody Product product) {

		Product savedPro = service.saveProduct(product);

		return savedPro;
	}

	@GetMapping("/{id}")
	public Product getProById(@PathVariable("id") int id) {
		Product proById = service.getProById(id);
		return proById;
	}

	@GetMapping
	public List<Product> getallPro() {
		List<Product> allPro = service.getAllPro();

		return allPro;
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable("id") int id) {
		service.deleteById(id);
	}

	@PutMapping("/{id}")
	public Product updatePro(@PathVariable("id") int id, @RequestBody Product product) {
		Product updated = service.updatePro(id, product);
		return updated;
	}

//	@GetMapping("/{name}")
//	public List<Product> getProByName(@PathVariable String name) {
//		List<Product> proByName = service.getProByName(name);
//
//		return proByName;
//	}

}
