package tn.isg.soa.tunisianelection.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isg.soa.tunisianelection.Models.Formation;


@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long> {
}
