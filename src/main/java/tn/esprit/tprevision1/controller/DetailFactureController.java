package tn.esprit.tprevision1.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tprevision1.Generique.IGeneriqueService;
import tn.esprit.tprevision1.entity.DetailFacture;
import tn.esprit.tprevision1.service.IDetailFactureService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/detailFacture")
public class DetailFactureController {
    @Autowired(required = false)
    IDetailFactureService iDetailFactureService;


    @PostMapping("/add")
    public DetailFacture addDetailFacture(@RequestBody DetailFacture d){
        return iDetailFactureService.addDetailFacture(d);
    }

    @DeleteMapping("/remove/{idDetailFacture}")
    public void removeDetailFacture(@PathVariable int idDetailFacture){ iDetailFactureService.removeDetailFacture(idDetailFacture); }

    @GetMapping("/alldetailFacture")
    public List<DetailFacture>FindAllDetailFacture(){return iDetailFactureService.getAllDetailFacture();}

    @GetMapping("/deatilFacturebyid/{idDetailFacture}")
    public DetailFacture FindDetailFactureById(@PathVariable int idDetailFacture){return iDetailFactureService.getById(idDetailFacture);}

    @PutMapping("/updateDetailFacture")
    public DetailFacture updateDetailFacture(@RequestBody DetailFacture d){return iDetailFactureService.updateDetailFACTURE(d);}

}
