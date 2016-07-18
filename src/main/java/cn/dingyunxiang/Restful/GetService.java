package cn.dingyunxiang.Restful;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by dingyunxiang on 16/7/13.
 */
@Path("/GetService")
public class GetService {





    @GET
    @Path("/get")
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Get getGG() {
        Get get = new Get();
        get.setTitle("title");
        get.setSinger("singer");
        get.setId(213);
        return get;
    }


    @GET
    @Path("/getString")
    @Produces(MediaType.APPLICATION_JSON)
    public String getString(){
        return "rest success";
    }

    @POST
    @Path("/post")
    @Produces(MediaType.APPLICATION_JSON)
    public String postSTring(@PathParam("str1") String str1, @PathParam("str2") String str2){

        System.out.println(str1+str2);

        return str1+str2;

    }


}
