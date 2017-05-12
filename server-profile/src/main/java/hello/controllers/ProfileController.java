package hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	//I suppose to create a model, but... not today.
	private static final String JSON = "{\"id\": 1,\"job\": \"Eletricista Anuncio\",\"balance\": \"160\",\"address\": {\"street\": \"Rua Frei Caneca\",\"number\": \"12\",\"complement\": \"12\",\"neighborhood\": \"Consolação\",\"city\": \"São Paulo\",\"uf\": \"SP\",\"zip_code\": \"01307-003\"},\"root_category\": \"Reformas e Reparos\",\"breadcrumb\": [\"Reformas e Reparos\",\"Eletricista\"],\"user\": {\"id\": 1,\"name\": \"John Doe\",\"email\": \"johndoe@email.com\",\"cpf\": \"67224131105\"},\"unread_leads\": 0,\"_links\": {\"self\": {\"href\": \"http://localhost:3000/api/profiles/1\"},\"leads\": {\"href\": \"http://localhost:3000/api/profiles/1/leads?period=2017-04-14 17:46:54 -0300\"},\"plan\": {\"href\": \"http://localhost:3000/api/profiles/1/plan\"}}}";
	
	@RequestMapping("/profile")
	public String get() {
		return JSON;
	}
}