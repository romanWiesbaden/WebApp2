package de.webApp.WebApp2.controller;


import de.webApp.WebApp2.dto.GiftTshirtDto;
import de.webApp.WebApp2.mapper.GiftTshirtMapper;
import de.webApp.WebApp2.model.GiftTshirt;
import de.webApp.WebApp2.service.GiftTshirtService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gifttshirt")
public class GifttshirtController {
    private final GiftTshirtService giftTshirtService;
    private final GiftTshirtMapper giftTshirtMapper;


    public GifttshirtController(GiftTshirtService giftTshirtService, GiftTshirtMapper giftTshirtMapper) {
        this.giftTshirtService = giftTshirtService;
        this.giftTshirtMapper = giftTshirtMapper;
    }


    //Speichern //Create Use case 1
    //tippt die daten ein und schickt es uns ins backend
    // front end versteht nur dto, weil er es nur von uns bekommt
    //dto vom front end mussen wir umwandeln und ein objekt machen
    //wir geben eine responsentity mit dto zurück
    // aus dem objekt in 36 gift= giftTshirtService.create(gift);  wieder eine dto machen
    // und wir schicken sie wieder an fron end zürück oder dahin, wo request herkam.
    @PostMapping("erstellen")
    public ResponseEntity<GiftTshirtDto> create(@RequestBody GiftTshirtDto dto){
        GiftTshirt gift = giftTshirtMapper.toObjekt(dto);
        //Speichern über den Service
        //ein Objekt hat keine Id
        // wir speichern und kriegen mit der id  ein Objekt zurück
        // objekt ist in der datenbank gespeichert
        //jetzt müssen wir ein normales Objekt (von dem Service gekriegt haben,müssen wir in die dto umwandeln
        //
        gift= giftTshirtService.create(gift);
// wir machen aus dem objekt eine dto
        GiftTshirtDto dto2 = giftTshirtMapper.toDto(gift);


        //Dto wird ans front end verschickt
        return ResponseEntity.ok(dto2);


    }

    //Suche Use case 2 und 3, liefert ein Ergebnis
    // Antwort von dem Server
    @GetMapping("/suche")
    public ResponseEntity<GiftTshirtDto> findBy(@PathVariable String firstName, @PathVariable String lastName ){
      // es wird unser service gerufen mit unseren paramteren und bekommen unser gifttshirt zurück oder nicht
      GiftTshirt giftTshirt =giftTshirtService.findByData(firstName, lastName);
        //unsere Suche hat hier ein Ergebnis geliefert
        // wir müssen es in eine Variable packen
        // Wenn wir ein Ergebniss haben liefern wir ein DTO zurück
        // Wenn wir nichst finden , lieferen wir eine Fehlermeldung

        if(giftTshirt == null){
            //Objekt muss zusammengebaut und abgeschickt werden
            return ResponseEntity.notFound().build();
        }
        //Dto schicken wir jetzt zurück
        //Aus gift tschit objekt machen wir ein Dto
        GiftTshirtDto dto = giftTshirtMapper.toDto(giftTshirt);

        //jetzt müssen wir ein normales Objekt (von dem Service gekriegt haben,müssen wir in die dto umwandeln
        //Dto wird ans front end
        return ResponseEntity.ok(dto);
    }

    //Änderung Use Case 2

    //Löschen Use case 3
    @GetMapping("/delete")
    public ResponseEntity delete(@PathVariable Integer id ){
        //1)prüfen ob der id da ist,
        //geben wir die responsentity zurück
        //2) Objekt löschen
        if(id == null)
            return ResponseEntity.badRequest().build();
        boolean result = giftTshirtService.delete(id);
        if(result)
            // wenn das Ergebniss erfolgtreich ist
            return ResponseEntity.ok().build();
        else return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();

    }

    //Auswertung oder Suche, die mehrere Ergebnisse liefert Use Case 4

}