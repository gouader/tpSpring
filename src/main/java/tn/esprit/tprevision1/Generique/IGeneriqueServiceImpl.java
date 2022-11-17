package tn.esprit.tprevision1.Generique;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class IGeneriqueServiceImpl<T,ID> implements  IGeneriqueService<T,ID> {

    @Autowired(required = false)
    JpaRepository<T,ID> jpaRepository;


    @Override
    public T add(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public T update(T entity) {
        return jpaRepository.save(entity);
    }

    @Override
    public T getById(ID idEtud) {
        return jpaRepository.findById(idEtud).orElse(null);
    }

    @Override
    public List<T> getAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void remove(ID idEtud) {
        jpaRepository.deleteById(idEtud);
    }
    }


