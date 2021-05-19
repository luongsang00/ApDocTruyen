package object;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class TruyenTranh {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String tenTruyen;
    private String tenChap;
    private String LinkAnh;
    /*
    {
    "tenTruyen":"",
    "tenChap":"",
    "linkAnh":""
    }
    */
    public TruyenTranh(){}
    public TruyenTranh(JSONObject o)throws JSONException
    {
        tenTruyen = o.getString("tenTruyen");
        tenChap = o.getString("tenChap");
        LinkAnh =o.getString("linkAnh");

    }
    public TruyenTranh(String tenTruyen, String tenChap, String linkAnh) {
        this.tenTruyen = tenTruyen;
        this.tenChap = tenChap;
        LinkAnh = linkAnh;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        this.tenTruyen = tenTruyen;
    }

    public String getTenChap() {
        return tenChap;
    }

    public void setTenChap(String tenChap) {
        this.tenChap = tenChap;
    }

    public String getLinkAnh() {
        return LinkAnh;
    }

    public void setLinkAnh(String linkAnh) {
        LinkAnh = linkAnh;
    }
}
