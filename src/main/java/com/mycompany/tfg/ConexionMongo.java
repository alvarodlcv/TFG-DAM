/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tfg;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class ConexionMongo {

    private MongoClient mongoClient;
    private MongoDatabase database;

    public ConexionMongo() {
        this.mongoClient = MongoClients.create("mongodb://localhost:27017");
        this.database = mongoClient.getDatabase("TFG");
    }

    public MongoDatabase getDatabase() {
        return this.database;
    }
}

