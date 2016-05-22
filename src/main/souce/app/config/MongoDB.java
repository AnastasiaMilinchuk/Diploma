package app.config;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by click on 5/20/2016.
 */
public class MongoDB {
    MongoClient mongo;

    public MongoDB(){
        try {
            mongo = new MongoClient( "localhost" , 27017 );
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public MongoClient getClient(){
        return mongo;
    }

    public DB getBlogDB(){
        return mongo.getDB("blog");
    }

    public DBCollection getUserTable(){
        return  getBlogDB().getCollection("users");
    }
}
