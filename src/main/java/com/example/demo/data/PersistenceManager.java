//package com.example.demo.data;
//
//import com.azure.storage.blob.BlobClient;
//import com.azure.storage.blob.BlobContainerClient;
//import com.azure.storage.blob.BlobContainerClientBuilder;
//import com.example.demo.domain.Person;
//
//import java.io.*;
//
//public class PersistenceManager {
//    private final static String ENDPOINT = "https://ipassherkansing.blob.core.windows.net/";
//    private final static String SASTOKEN = "?sv=2021-06-08&ss=bfqt&srt=sco&sp=rwdlacupitfx&se=2022-09-30T15:39:24Z&st=2022-06-27T07:39:24Z&spr=https&sig=PAZOKvJTL5%2B1jgavB73lwIOuVd8VcfG2iGpS2Uuxrf0%3D";
//    private final static String CONTAINER = "blobContainer";
//
//    private static BlobContainerClient blobContainer = new BlobContainerClientBuilder()
//            .endpoint(ENDPOINT)
//            .sasToken(SASTOKEN)
//            .containerName(CONTAINER)
//            .buildClient();
//
//    public static void savePersonsToAzure() throws IOException, ClassNotFoundException {
//        if(!blobContainer.exists())
//            blobContainer.create();
//
//            BlobClient blobClient = blobContainer.getBlobClient("person_blob");
//
//            ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ObjectOutputStream oos = new ObjectOutputStream(baos);
//            oos.writeObject(Person.getPerson());
//
//            byte[] bytez = baos.toByteArray();
//
//            ByteArrayInputStream bais = new ByteArrayInputStream(bytez);
//            blobClient.upload(bais, bytez.length, true);
//
//            oos.close();
//            bais.close();
//    }
//
//    public static void loadPersonsToAzure() throws IOException, ClassNotFoundException {
//        if(blobContainer.exists()){
//            BlobClient blobClient = blobContainer.getBlobClient("person_blob");
//
//            if(blobClient.exists()){
//                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//                blobClient.download(baos);
//
//                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//                ObjectInputStream ois = new ObjectInputStream(bais);
//
//                Object loadedObj = ois.readObject();
//                if(loadedObj instanceof Person){
//                    Person loadedPerson = (Person)loadedObj;
//                    Person.setPerson( loadedPerson);
//                }
//
//                baos.close();
//                ois.close();
//            }
//        }
//    }
//}
