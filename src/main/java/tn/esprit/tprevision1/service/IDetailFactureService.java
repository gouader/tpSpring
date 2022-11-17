package tn.esprit.tprevision1.service;

import tn.esprit.tprevision1.entity.DetailFacture;

import java.util.List;

public interface IDetailFactureService {
    DetailFacture addDetailFacture(DetailFacture d);

    void removeDetailFacture(int idDetailFacture);

    List<DetailFacture> getAllDetailFacture();

    DetailFacture getById(int idDetailFacture);

    DetailFacture updateDetailFACTURE(DetailFacture d);
}
