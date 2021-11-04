package com.usa.edu.co.ciclo3.repository.crud;

import java.util.Date;
import java.util.List;
import com.usa.edu.co.ciclo3.model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository <Reservation,Integer> {
    public List<Reservation> findAllByStatus (String status);
    public List<Reservation> findAllByStartDateAfterAndStartDateBefore (Date dateOne, Date dateTwo);

    @Query("SELECT c.client, COUNT(c.client) from Reservation AS c group by c.client ORDER BY COUNT(c.client)DESC")
    public List<Object[]> countTotalReservationsByClient();
}
