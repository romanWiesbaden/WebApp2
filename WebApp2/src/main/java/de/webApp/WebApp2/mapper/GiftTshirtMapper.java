package de.webApp.WebApp2.mapper;

import de.webApp.WebApp2.dto.GiftTshirtDto;
import de.webApp.WebApp2.model.Address;
import de.webApp.WebApp2.model.GiftTshirt;
import de.webApp.WebApp2.model.TshirtSizeType;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class GiftTshirtMapper {
    ///Gifttshirt DTo aus einem GiftTshirt
    //hier kommt ein objekt aus der datenbank

    public GiftTshirtDto toDto(GiftTshirt giftTshirt){
        //
        if(giftTshirt == null){
            return null;
        }


        // hier wird Dto aus dem Objekt gemacht
        return new GiftTshirtDto(giftTshirt.getTshirtId(), giftTshirt.getTshirtSize(), giftTshirt.address.firstName, giftTshirt.address.lastName,
                giftTshirt.address.street, giftTshirt.address.houseNumber, giftTshirt.address.zipCode, giftTshirt.address.city, giftTshirt.email, giftTshirt.agreement);
    }
    //hier bekommt man Liste von Objekt und bekommen eine Liste von Dto zurück
    public List<GiftTshirtDto> toDtos (List<GiftTshirt> gifts){
        if(gifts == null){
            return null;
        }
        // leere Liste. Und die wird nach und nach gefüllt
        //Wir wissen nicht ob samtliche tshirts die rein kommen in eine DTO umgewandelt werden.
        // Es kann auch ein Objekt kaputt sein.

        var dtoLists = new ArrayList<GiftTshirtDto>();
        //wir haben geprüft in 29 dass in der Liste die Werte sind
        //Liste von gifttshirts umwandeln in Dto

        // hier wird sind bei den einzelnen objekten
        for (var giftTshirt: gifts){
            // ist der objekt in der liste vorhanden
            if(giftTshirt!=null){
                GiftTshirtDto dto = toDto(giftTshirt);
                // hier haben wir unsere Dto gemacht
                //
                dtoLists.add(dto);

            }
        }
        return dtoLists;
    }

    //als rückgabewert bekommen wir ein objekt

    public GiftTshirt toObjekt(GiftTshirtDto dto) {
        if(dto == null){
            return null;
        }
        //gifttshirt objekt wird erstellt
        //muss man prüfen was das ist
        // wenn es null ist, dann ist es ein neues Objekt
        if(dto.getTshirtId() == null){
           Address address = new Address(dto.firstName, dto.lastName,
                    dto.street, dto.houseNumber, dto.zipCode, dto.city);
            GiftTshirt giftTshirtObjekt = new GiftTshirt(dto.getTshirtSize(), address, dto.email, dto.agreement);

        //    TshirtSizeType tshirtSize, Address address, String email, Timestamp agreement)
            return giftTshirtObjekt;

        }
        return null;
        //DTO von der Datenbank
        //Neu erstellte DTO unterscheiden mit id
    }
}

