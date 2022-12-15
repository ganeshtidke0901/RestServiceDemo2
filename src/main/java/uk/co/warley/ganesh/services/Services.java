package uk.co.warley.ganesh.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.co.warley.ganesh.app.model.Product;

import javax.websocket.server.PathParam;

@RestController
public class Services {
	/**
	 * This method simply says Hello
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, path = "/say/hello")
	public String helloWorld() {
		return "Hello Everyone" +
				"\nWelcome to the SpringBoot World! " +
				"\nThanks" +
				"\nGanesh";
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, path = "/createrecord")
	public String createRecord(@RequestBody Product product) {
		return "Successfully created record"+product.toString();
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, path = "/createrecord-201")
	public ResponseEntity<String> createRecordWith201Code(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body("Successfully created  record"+product.toString());
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, path = "/updaterecord-200")
	public String updateRecordWith200(@RequestBody Product product) {
		return "Successfully updated  record"+product.toString();
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, path = "/updaterecord-201")
	public ResponseEntity<String> updateRecordWith201(@RequestBody Product product) {
		return ResponseEntity.status(HttpStatus.CREATED).body("Successfully updated  record"+product.toString());
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/getRecord")
	public String getRecord() {
		int i=0;
		try {
			int result=20/i;
		}catch (Exception e){
			throw new NullPointerException("This is demo exception- in real scenario exception should not be shown user");
		}
		return "{\n" +
				"    \"id\":7854,\n" +
				"    \"name\": \"Ganesh\",\n" +
				"    \"price\": 400.44\n" +
				"}";
	}


	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/fullname")
	public String getFullNameWithQueryParam(@RequestParam("firstname") String firstName,@RequestParam("lastname") String lastName) {
		return "First Name:"+firstName+" Last name:"+lastName;
	}


	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, path = "/fullname/{firstname}/{lastname}")
	public String getFullNameWithPathParam(@PathVariable("firstname") String firstName,@PathVariable("lastname") String lastName) {
		return "First Name:"+firstName+" Last name:"+lastName;
	}
}	
