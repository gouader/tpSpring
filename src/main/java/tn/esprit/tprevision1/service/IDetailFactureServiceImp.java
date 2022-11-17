package tn.esprit.tprevision1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tprevision1.entity.DetailFacture;
import tn.esprit.tprevision1.repository.DetailFactureRepository;

import java.util.List;

@Service
public class IDetailFactureServiceImp implements IDetailFactureService {

    @Autowired
    DetailFactureRepository detailFactureRepository;


    @Override
    public DetailFacture addDetailFacture(DetailFacture d) {
        return detailFactureRepository.save(d);
    }

    @Override
    public void removeDetailFacture(int idDetailFacture) { detailFactureRepository.deleteById((long) idDetailFacture);

    }

    @Override
    public List<DetailFacture> getAllDetailFacture() {
        return detailFactureRepository.findAll();
    }

    @Override
    public DetailFacture getById(int idDetailFacture) {
        return detailFactureRepository.findById((long) idDetailFacture).orElse(null);
    }

    @Override
    public DetailFacture updateDetailFACTURE(DetailFacture d) {
        return detailFactureRepository.save(d);
    }


}

