package com.priIt;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoConnection {
	public static void main(String[] args) {

// Creating a Mongo client 
		MongoClient mongo = new MongoClient("localhost", 27017);

// Accessing the database 
		MongoDatabase database = mongo.getDatabase("admin");

// Retrieving a collection 
		MongoCollection<Document> collection = database.getCollection("EmployeeDtls");
		System.out.println("Collection sampleCollection selected successfully");

// Getting the iterable object 
		FindIterable<Document> iterDoc = collection.find();

// Getting the iterator 
		Iterator it = iterDoc.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
