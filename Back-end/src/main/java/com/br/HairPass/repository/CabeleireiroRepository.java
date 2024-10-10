package com.br.HairPass.repository;

import com.br.HairPass.model.Cabeleireiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabeleireiroRepository extends JpaRepository<Cabeleireiro, Long> {
}
