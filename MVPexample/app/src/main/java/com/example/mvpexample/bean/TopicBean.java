package com.example.mvpexample.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wuzhuojun on 2016/8/3 0003.
 */
public class TopicBean implements Serializable {
    private int board_id;
    private String board_name;
    private int topic_id;
    private String type;
    private String title;
    private int user_id;
    private String user_nick_name;
    private String last_reply_date;
    private int vote;
    private int hot;
    private int hits;
    private int replies;
    private int essence;
    private int top;
    private int status;
    private String user_icon;
    private int recommend_add;
    private int recommend_sub;
    private String userTitle;
    private int displayorder;
    private String publish_date;
    private String publish_date_convert;
    private String highlight;
    private String mobileSign;
    private String pid;
    private String last_reply_date_convert;
    private int recommends;
    private int heats;
    private String subject;
    private String pic_path;
    private String ratio;
    private String userAvatar;
    private int gender;
    private int recommendAdd;
    private int isHasRecommendAdd;
    private String sourceWebUrl;
    /**
     * type : verify1
     * title : 核心粉丝
     * status : 1
     */

    private List<VerifylistBean> verifylist;
    /**
     * image : http://beta.www.coolxap.com/forum.php?mod=image&aid=618518&size=100x100&key=f74bd44b1c2cc4ba&type=1
     */

    private List<AllPicBean> all_pic;
    private List<?> imageList;

    public int getBoard_id() {
        return board_id;
    }

    public void setBoard_id(int board_id) {
        this.board_id = board_id;
    }

    public String getBoard_name() {
        return board_name;
    }

    public void setBoard_name(String board_name) {
        this.board_name = board_name;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_nick_name() {
        return user_nick_name;
    }

    public void setUser_nick_name(String user_nick_name) {
        this.user_nick_name = user_nick_name;
    }

    public String getLast_reply_date() {
        return last_reply_date;
    }

    public void setLast_reply_date(String last_reply_date) {
        this.last_reply_date = last_reply_date;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getReplies() {
        return replies;
    }

    public void setReplies(int replies) {
        this.replies = replies;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public int getRecommend_add() {
        return recommend_add;
    }

    public void setRecommend_add(int recommend_add) {
        this.recommend_add = recommend_add;
    }

    public int getRecommend_sub() {
        return recommend_sub;
    }

    public void setRecommend_sub(int recommend_sub) {
        this.recommend_sub = recommend_sub;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public int getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(int displayorder) {
        this.displayorder = displayorder;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getPublish_date_convert() {
        return publish_date_convert;
    }

    public void setPublish_date_convert(String publish_date_convert) {
        this.publish_date_convert = publish_date_convert;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getMobileSign() {
        return mobileSign;
    }

    public void setMobileSign(String mobileSign) {
        this.mobileSign = mobileSign;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getLast_reply_date_convert() {
        return last_reply_date_convert;
    }

    public void setLast_reply_date_convert(String last_reply_date_convert) {
        this.last_reply_date_convert = last_reply_date_convert;
    }

    public int getRecommends() {
        return recommends;
    }

    public void setRecommends(int recommends) {
        this.recommends = recommends;
    }

    public int getHeats() {
        return heats;
    }

    public void setHeats(int heats) {
        this.heats = heats;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getRecommendAdd() {
        return recommendAdd;
    }

    public void setRecommendAdd(int recommendAdd) {
        this.recommendAdd = recommendAdd;
    }

    public int getIsHasRecommendAdd() {
        return isHasRecommendAdd;
    }

    public void setIsHasRecommendAdd(int isHasRecommendAdd) {
        this.isHasRecommendAdd = isHasRecommendAdd;
    }

    public String getSourceWebUrl() {
        return sourceWebUrl;
    }

    public void setSourceWebUrl(String sourceWebUrl) {
        this.sourceWebUrl = sourceWebUrl;
    }

    public List<VerifylistBean> getVerifylist() {
        return verifylist;
    }

    public void setVerifylist(List<VerifylistBean> verifylist) {
        this.verifylist = verifylist;
    }

    public List<AllPicBean> getAll_pic() {
        return all_pic;
    }

    public void setAll_pic(List<AllPicBean> all_pic) {
        this.all_pic = all_pic;
    }

    public List<?> getImageList() {
        return imageList;
    }

    public void setImageList(List<?> imageList) {
        this.imageList = imageList;
    }

    public static class VerifylistBean {
        private String type;
        private String title;
        private int status;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    public static class AllPicBean {
        private String image;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}