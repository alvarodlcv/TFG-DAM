/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tfg;

/**
 *
 * @author Álvaro
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.result.DeleteResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;

public class VehiculoDAO {

    private MongoCollection<Document> collection;

    public VehiculoDAO() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("TFG");
        this.collection = database.getCollection("vehiculos");
    }

    // Método para agregar un vehículo a la colección
    public void agregarVehiculo(Vehiculo vehiculo) {
        Document doc = new Document("marcaV", vehiculo.getMarcaV())
                .append("modeloV", vehiculo.getModeloV())
                .append("añoV", vehiculo.getAñoV())
                .append("kilometrajeV", vehiculo.getKilometrajeV())
                .append("itvV", vehiculo.getItvV())
                .append("colorV", vehiculo.getColorV())
                .append("matriculaV", vehiculo.getMatriculaV())
                .append("propietarioV", vehiculo.getPropietarioV())
                .append("servicioV", vehiculo.getServicioV());

        this.collection.insertOne(doc);
        JOptionPane.showMessageDialog(null, "Guardado con éxito", "Guardado", JOptionPane.INFORMATION_MESSAGE);

    }

    // Método para obtener todos los vehículos
    public void obtenerTodosLosVehiculos() {
        MongoCursor<Document> cursor = this.collection.find().iterator();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                System.out.println(doc.toJson());
            }
        } finally {
            cursor.close();
        }
    }

   public void borrarVehiculo(String matricula, String propietario) {
    Document query = new Document("matriculaV", matricula)
                        .append("propietarioV", propietario);
    this.collection.deleteOne(query);
        System.out.println("Vehículo borrado con matrícula: " + matricula + " y propietario: " + propietario);

        DeleteResult result = this.collection.deleteOne(query);
System.out.println("Número de documentos eliminados: " + result.getDeletedCount());

}
public void actualizarCampoVehiculoMarca(Vehiculo vehiculo,String nuevaMarca) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("marcaV", nuevaMarca));

    this.collection.updateOne(filtro, update);

}

public void actualizarCampoVehiculoModelo(Vehiculo vehiculo,String nuevoModelo) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("modeloV", nuevoModelo));

    this.collection.updateOne(filtro, update);

}

public void actualizarCampoVehiculoAño(Vehiculo vehiculo,String nuevoAño) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("añoV", nuevoAño));

    this.collection.updateOne(filtro, update);

}

public void actualizarCampoVehiculoKilometraje(Vehiculo vehiculo,int nuevoKilometraje) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("kilometrajeV", nuevoKilometraje));

    this.collection.updateOne(filtro, update);
}
 
public void actualizarCampoVehiculoItv(Vehiculo vehiculo,String nuevoItv) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("itvV", nuevoItv));

    this.collection.updateOne(filtro, update);
}


public void actualizarCampoVehiculoColor(Vehiculo vehiculo,String nuevoColor) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("colorV", nuevoColor));

    this.collection.updateOne(filtro, update);
}

public void actualizarCampoVehiculoMatricula(Vehiculo vehiculo,String nuevoMatricula) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("matriculaV", nuevoMatricula));

    this.collection.updateOne(filtro, update);
}
public void actualizarCampoVehiculoPropietario(Vehiculo vehiculo,String nuevoPropietario) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("propietarioV", nuevoPropietario));

    this.collection.updateOne(filtro, update);
}

public void actualizarCampoVehiculoServicio(Vehiculo vehiculo,String nuevoServicio) {
    Document filtro = new Document("matriculaV", vehiculo.getMatriculaV())
                        .append("propietarioV", vehiculo.getPropietarioV());

    Document update = new Document("$set", new Document("servicioV", nuevoServicio));

    this.collection.updateOne(filtro, update);
}

public List<Vehiculo> buscarVehiculo(String matricula, String propietario) {
    List<Vehiculo> vehiculosEncontrados = new ArrayList<>();

    Document query = new Document("matriculaV", matricula)
            .append("propietarioV", propietario);

    MongoCursor<Document> cursor = this.collection.find(query).iterator();

    try {
        while (cursor.hasNext()) {
            Document doc = cursor.next();
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setMarcaV(doc.getString("marcaV"));
            vehiculo.setModeloV(doc.getString("modeloV"));
            vehiculo.setAñoV(doc.getString("añoV"));
            vehiculo.setKilometrajeV(doc.getInteger("kilometrajeV"));
            vehiculo.setItvV(doc.getString("itvV"));
            vehiculo.setColorV(doc.getString("colorV"));
            vehiculo.setMatriculaV(doc.getString("matriculaV"));
            vehiculo.setPropietarioV(doc.getString("propietarioV"));
            vehiculo.setServicioV(doc.getString("servicioV"));

            vehiculosEncontrados.add(vehiculo);
        }
    } finally {
        cursor.close();
    }

    return vehiculosEncontrados;
}
 }