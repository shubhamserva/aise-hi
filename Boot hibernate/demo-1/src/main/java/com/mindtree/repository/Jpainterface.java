package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.Userentity;

@Repository
public interface Jpainterface extends JpaRepository<Userentity,Integer>
{
	public Userentity findByMid(int mid);

}
