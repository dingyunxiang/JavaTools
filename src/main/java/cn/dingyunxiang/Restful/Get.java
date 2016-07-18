package cn.dingyunxiang.Restful;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by dingyunxiang on 16/7/13.
 */


@XmlRootElement(name = "get")
public class Get {



    Integer id;

    String title;

    String singer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }


    @Override
    public String toString() {
        return "Get{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
