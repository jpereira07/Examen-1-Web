
package com.examen1Web.service;

import com.examen1Web.entity.Conciertos;
import java.util.List;
import org.springframework.stereotype.Service;
import com.examen1Web.repository.ConciertosRepository;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author jose
 */

@Service
public class ConciertoService implements IConciertoService {

    @Autowired
    private ConciertosRepository conciertosRepository;
    
    @Override
    public List<Conciertos> getAllConciertos() {
        return (List<Conciertos>)conciertosRepository.findAll();
    }

    @Override
    public void saveConcierto(Conciertos concierto) {
        conciertosRepository.save(concierto);
    }

    @Override
    public void delete(long id) {
        conciertosRepository.deleteById(id);
    }
    
}
