package second_spring.second_spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class DummyController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@PostMapping("/bye")
	public String bye() {
		return "Bye Bye";
	}

	@DeleteMapping("/bye")
	public String delete() {
		return "Delete";
	}

	@GetMapping("/math")
	public int square(@RequestParam int number) {
		return number * number;
	}

	@GetMapping("/name")
	public String name(@RequestParam String name1, String name2) {
		return "My name is " + name1 + ". I am the son of " + name2;
	}

	@GetMapping("/done")
	public String returnSomething() {
		return "Ki Obostha Batija, Kaje Monojog Daw.";
	}
}