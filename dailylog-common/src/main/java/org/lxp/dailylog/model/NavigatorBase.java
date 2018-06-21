package org.lxp.dailylog.model;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

public class NavigatorBase {
    private Long seqid;

    @ApiModelProperty(value = "site name")
    private String name;

    @ApiModelProperty(value = "site link")
    private String url;

    @ApiModelProperty(value = "site title used for a label")
    private String title;

    @ApiModelProperty(value = "record creation time")
    private Date createtime;

    public Long getSeqid() {
        return seqid;
    }

    public void setSeqid(Long seqid) {
        this.seqid = seqid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("NavigatorBase [seqid=").append(seqid).append(", name=").append(name).append(", url=")
                .append(url).append(", title=").append(title).append(", createtime=").append(createtime).append("]");
        return builder.toString();
    }
}