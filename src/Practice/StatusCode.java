package Practice;

public class StatusCode {
    public static void main(String[] args) {

        int code=400;   String Status="";

        String status1=(code==200)?"OK":(code==201)?"Created":(code==202)?"Accepted"
                :(code==301)?"Moved Permanently":(code==303)?"See Other"
                :(code==304)?"Not Modified":(code==307)?"Temporary Redirect"
                :(code==400)?"Bad Request":(code==401)?"Unauthorized"
                :(code==403)?"Forbidden":(code==404)?"Not Found"
                :(code==410)?"Gone":(code==500)?"Internal Server Error"
                :"Service Unavalibale";

        System.out.println(status1);

    }
}
