package de.webApp.WebApp2.service;

import de.webApp.WebApp2.model.GiftTshirt;
import de.webApp.WebApp2.repository.GiftTshirtRepository;
import org.springframework.stereotype.Service;

@Service
public class GiftTshirtService {
    private final GiftTshirtRepository giftTshirtRepository;

    public GiftTshirtService(GiftTshirtRepository giftTshirtRepository) {
        this.giftTshirtRepository = giftTshirtRepository;
    }
//Man bekommt den kompletten Datensatz zurück
    public GiftTshirt findByData(String firstName, String lastName) {
        return null;
    }
//jetzt müssen wir über repository speichern
    //Speichert Objekt ohne id und gibt ein Objekt mit id zurück
    public GiftTshirt create(GiftTshirt gift) {
        return giftTshirtRepository.save(gift);

    }

    public boolean delete(Integer id) {
         giftTshirtRepository.deleteById(id);
         //hier wird geprüft, ob ein objekt mit der bestimmter id exetiert
        // wenn es was gibt liefert true zurück
        //ergebniss was zurück kommt, negiert man und gibt man zurück
        return !giftTshirtRepository.existsById(id);

    }
}
