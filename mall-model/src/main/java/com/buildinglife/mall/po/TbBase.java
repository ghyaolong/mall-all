package com.buildinglife.mall.po;

import javax.persistence.*;

@Table(name = "tb_base")
public class TbBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "web_name")
    private String webName;

    @Column(name = "key_word")
    private String keyWord;

    private String description;

    @Column(name = "source_path")
    private String sourcePath;

    @Column(name = "upload_path")
    private String uploadPath;

    private String copyright;

    @Column(name = "count_code")
    private String countCode;

    @Column(name = "has_log_notice")
    private Integer hasLogNotice;

    @Column(name = "log_notice")
    private String logNotice;

    @Column(name = "has_all_notice")
    private Integer hasAllNotice;

    @Column(name = "all_notice")
    private String allNotice;

    private String notice;

    @Column(name = "update_log")
    private String updateLog;

    @Column(name = "front_url")
    private String frontUrl;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return web_name
     */
    public String getWebName() {
        return webName;
    }

    /**
     * @param webName
     */
    public void setWebName(String webName) {
        this.webName = webName;
    }

    /**
     * @return key_word
     */
    public String getKeyWord() {
        return keyWord;
    }

    /**
     * @param keyWord
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return source_path
     */
    public String getSourcePath() {
        return sourcePath;
    }

    /**
     * @param sourcePath
     */
    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    /**
     * @return upload_path
     */
    public String getUploadPath() {
        return uploadPath;
    }

    /**
     * @param uploadPath
     */
    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    /**
     * @return copyright
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * @param copyright
     */
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    /**
     * @return count_code
     */
    public String getCountCode() {
        return countCode;
    }

    /**
     * @param countCode
     */
    public void setCountCode(String countCode) {
        this.countCode = countCode;
    }

    /**
     * @return has_log_notice
     */
    public Integer getHasLogNotice() {
        return hasLogNotice;
    }

    /**
     * @param hasLogNotice
     */
    public void setHasLogNotice(Integer hasLogNotice) {
        this.hasLogNotice = hasLogNotice;
    }

    /**
     * @return log_notice
     */
    public String getLogNotice() {
        return logNotice;
    }

    /**
     * @param logNotice
     */
    public void setLogNotice(String logNotice) {
        this.logNotice = logNotice;
    }

    /**
     * @return has_all_notice
     */
    public Integer getHasAllNotice() {
        return hasAllNotice;
    }

    /**
     * @param hasAllNotice
     */
    public void setHasAllNotice(Integer hasAllNotice) {
        this.hasAllNotice = hasAllNotice;
    }

    /**
     * @return all_notice
     */
    public String getAllNotice() {
        return allNotice;
    }

    /**
     * @param allNotice
     */
    public void setAllNotice(String allNotice) {
        this.allNotice = allNotice;
    }

    /**
     * @return notice
     */
    public String getNotice() {
        return notice;
    }

    /**
     * @param notice
     */
    public void setNotice(String notice) {
        this.notice = notice;
    }

    /**
     * @return update_log
     */
    public String getUpdateLog() {
        return updateLog;
    }

    /**
     * @param updateLog
     */
    public void setUpdateLog(String updateLog) {
        this.updateLog = updateLog;
    }

    /**
     * @return front_url
     */
    public String getFrontUrl() {
        return frontUrl;
    }

    /**
     * @param frontUrl
     */
    public void setFrontUrl(String frontUrl) {
        this.frontUrl = frontUrl;
    }
}