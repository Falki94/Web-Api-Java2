/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;
}
