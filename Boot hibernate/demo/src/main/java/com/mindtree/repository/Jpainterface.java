package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.Userentity;

public interface Jpainterface extends JpaRepository<Userentity,Integer>
{

}
