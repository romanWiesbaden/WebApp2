package de.webApp.WebApp2.controller;


import de.webApp.WebApp2.dto.ClientDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    // private final ClientService clientService;
    @GetMapping("/client")
    public ResponseEntity<ClientDto> getClient() {
        ClientDto mockedClt = new ClientDto("1", "Roman", "Horielov", "Wiesbaden", "roman@gmail.com", "X", "GREEN");
        return new ResponseEntity<>(mockedClt, HttpStatus.OK);
    }


//@GetMapping("/client")
//    public String helloWorld(){
//        return "Hello World";
//}
}