/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 *
 * @author Maciek
 */
@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface CarRepository extends JpaRepository<Car, Long> {

}
