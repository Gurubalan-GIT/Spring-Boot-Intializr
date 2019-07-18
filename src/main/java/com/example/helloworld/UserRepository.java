package com.example.helloworld;

import org.springframework.data.mongodb.repository.MongoRepository;

/*
 * Created Date: Thursday July 18th 2019
 * Author: Gurubalan Harikrishnan
 * Email-ID: gurubalan.work@gmail.com
 * -----
 * Copyright (c) 2019 Gurubalan Harikrishnan
 */
public interface UserRepository extends MongoRepository<Users,String>{

}