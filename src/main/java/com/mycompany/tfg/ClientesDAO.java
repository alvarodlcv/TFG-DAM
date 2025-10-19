/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author Álvaro
 */
public class ClientesDAO {
    
    private MongoCollection<Document> collection;

    public ClientesDAO() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("TFG");
        this.collection = database.getCollection("clientes");
    }
    
    public void añadirCliente(Cliente cliente) {
        Document doc = new Document("nombreC", cliente.getNombreC())
                .append("apellido1C", cliente.getApellido1C())
                .append("apellido2C", cliente.getApellido2C())
                .append("telefonoC", cliente.getTelefonoC())
                .append("dniC", cliente.getDniC())
                .append("direccionC", cliente.getDireccionC())
                .append("correoC", cliente.getCorreoC())
                .append("cochesPropC", cliente.getCochesPropC())
                .append("conocisteC", cliente.getConocisteC());

        this.collection.insertOne(doc);

    } 
    
    public void borrarCliente(String dni) {
    Document query = new Document("dniC", dni);
    this.collection.deleteOne(query);
        System.out.println("Cliente borrado con DNI / NIF: " + dni);

        DeleteResult result = this.collection.deleteOne(query);
System.out.println("Número de documentos eliminados: " + result.getDeletedCount());

}

    public void actualizarCampoClienteTelefono(Cliente cliente,int nuevoTelefono) {
    Document filtro = new Document("dniC", cliente.getDniC());
    Document update = new Document("$set", new Document("telefonoC", nuevoTelefono));

    this.collection.updateOne(filtro, update);
    }
    
  public void actualizarCampoClienteDir(Cliente cliente,String nuevaDir) {
    Document filtro = new Document("dniC", cliente.getDniC());
    Document update = new Document("$set", new Document("direccionC", nuevaDir));

    this.collection.updateOne(filtro, update);
    }   
  
  public void actualizarCampoClienteCorreo(Cliente cliente,String nuevoCorreo) {
    Document filtro = new Document("dniC", cliente.getDniC());
    Document update = new Document("$set", new Document("correoC", nuevoCorreo));

    this.collection.updateOne(filtro, update);
    }   
  
  public void actualizarCampoClienteProp(Cliente cliente,int nuevoProp) {
    Document filtro = new Document("dniC", cliente.getDniC());
    Document update = new Document("$set", new Document("cochesPropC", nuevoProp));

    this.collection.updateOne(filtro, update);
    }
   public List<Cliente> buscarCliente(String dni) {
    List<Cliente> clientesEncontrados = new ArrayList<>();

    Document query = new Document("dniC",dni);

    MongoCursor<Document> cursor = this.collection.find(query).iterator();

    try {
        while (cursor.hasNext()) {
            Document doc = cursor.next();
            Cliente cliente = new Cliente();
            cliente.setNombreC(doc.getString("nombreC"));
            cliente.setApellido1C(doc.getString("apellido1C"));
            cliente.setApellido2C(doc.getString("apellido2C"));
            cliente.setTelefonoC(doc.getInteger("telefonoC"));
            cliente.setDniC(doc.getString("dniC"));
            cliente.setDireccionC(doc.getString("direccionC"));
            cliente.setCorreoC(doc.getString("correoC"));
            cliente.setCochesPropC(doc.getInteger("cochesPropC"));
            cliente.setConocisteC(doc.getString("conocisteC"));
            
            clientesEncontrados.add(cliente);
        }
    } finally {
        cursor.close();
    }

    return clientesEncontrados;
}     
    //  return clientesEncontrados;
      
}
 