package cn.fly.yun.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class NewsInfoDomain implements Serializable {

    private static final long serialVersionUID = -2313599120981844477L;
    private Long newsid;

    private String backtitle;

    private String covertype;

    private String newstype;

    private Date publishtime;

    private String fronttitle;

    private String istop;

    private String ishot;

    private String newsfrom;

    private String auther;

    private String linkurl;

    private Date createat;

    private Date modityat;

    private Long createuser;

    private Long modifyuser;

    private String status;

    private String attaid;

    private Integer locale;

    private String content;

    private List<NewsAttachment> coverList ;

    private List<NewsAttachment> picList ;

    /**
     * 是否对该资讯点赞
     */
    private boolean isPraise ;

    /**
     * 资讯被赞次数
     */
    private String praiseNum ;

    public Long getNewsid() {
        return newsid;
    }

    public void setNewsid(Long newsid) {
        this.newsid = newsid;
    }

    public String getBacktitle() {
        return backtitle;
    }

    public void setBacktitle(String backtitle) {
        this.backtitle = backtitle;
    }

    public String getCovertype() {
        return covertype;
    }

    public void setCovertype(String covertype) {
        this.covertype = covertype;
    }

    public String getNewstype() {
        return newstype;
    }

    public void setNewstype(String newstype) {
        this.newstype = newstype;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getFronttitle() {
        return fronttitle;
    }

    public void setFronttitle(String fronttitle) {
        this.fronttitle = fronttitle;
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    public String getNewsfrom() {
        return newsfrom;
    }

    public void setNewsfrom(String newsfrom) {
        this.newsfrom = newsfrom;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public Date getCreateat() {
        return createat;
    }

    public void setCreateat(Date createat) {
        this.createat = createat;
    }

    public Date getModityat() {
        return modityat;
    }

    public void setModityat(Date modityat) {
        this.modityat = modityat;
    }

    public Long getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Long createuser) {
        this.createuser = createuser;
    }

    public Long getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Long modifyuser) {
        this.modifyuser = modifyuser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttaid() {
        return attaid;
    }

    public void setAttaid(String attaid) {
        this.attaid = attaid;
    }

    public Integer getLocale() {
        return locale;
    }

    public void setLocale(Integer locale) {
        this.locale = locale;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<NewsAttachment> getCoverList() {
        return coverList;
    }

    public void setCoverList(List<NewsAttachment> coverList) {
        this.coverList = coverList;
    }

    public List<NewsAttachment> getPicList() {
        return picList;
    }

    public void setPicList(List<NewsAttachment> picList) {
        this.picList = picList;
    }

    public boolean isPraise() {
        return isPraise;
    }

    public void setPraise(boolean praise) {
        isPraise = praise;
    }

    public String getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(String praiseNum) {
        this.praiseNum = praiseNum;
    }
}
