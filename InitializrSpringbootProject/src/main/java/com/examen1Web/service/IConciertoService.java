
package com.examen1Web.service;
import com.examen1Web.entity.Conciertos;
import java.util.List;
/**
 *
 * @author jose
 */
public interface IConciertoService {
    public List<Conciertos> getAllConciertos();
    public void saveConcierto(Conciertos concierto);
    public void delete(long id);

}
