package org.example.configuration;

import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.Connection;

public class HibernateSessionFactory {

  public HibernateSessionFactory(@Qualifier("h2Connection") Connection h2Connection) {

  }

}
