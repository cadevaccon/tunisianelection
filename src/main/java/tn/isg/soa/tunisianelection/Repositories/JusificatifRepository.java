package tn.isg.soa.tunisianelection.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isg.soa.tunisianelection.Models.Justificatif;


@RepositoryRestResource
public interface JusificatifRepository extends JpaRepository<Justificatif,Long> {


}
