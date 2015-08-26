/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.khomp.kami.khompabstract;

/**
 *
 * @author khomp
 */
public class AbstractDialBegin extends AbstractEvent {
    private String accountcode;
    private String calleridname;
    private String calleridnum;
    private String channel;
    private String channelstate;
    private String channelstatedesc;
    private String connectedlinename;
    private String connectedlinenum;
    private String context;
    private String dialstring;
    private String destcalleridname;
    private String event;
    private String exten;
    private String language;
    private String privilege;
    private String priority;
    private String uniqueid;
    private String destchannel;
    private String destchannelstate;
    private String destaccountcode;
    private String destcontext;
    private String destpriority;
    private String destconnectedlinename;
    private String destlanguage;
    private String destconnectedlinenum;
    private String destexten;
    private String destchannelstatedesc;
    private String destcalleridnum;
    private String destuniqueid;
    
    public AbstractDialBegin(Object source) {
        super(source);
    }

    /**
     * @return the accountcode
     */
    public String getAccountcode() {
        return accountcode;
    }

    /**
     * @param accountcode the accountcode to set
     */
    public void setAccountcode(String accountcode) {
        this.accountcode = accountcode;
    }

    /**
     * @return the calleridname
     */
    public String getCalleridname() {
        return calleridname;
    }

    /**
     * @param calleridname the calleridname to set
     */
    public void setCalleridname(String calleridname) {
        this.calleridname = calleridname;
    }

    /**
     * @return the calleridnum
     */
    public String getCalleridnum() {
        return calleridnum;
    }

    /**
     * @param calleridnum the calleridnum to set
     */
    public void setCalleridnum(String calleridnum) {
        this.calleridnum = calleridnum;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the channelstate
     */
    public String getChannelstate() {
        return channelstate;
    }

    /**
     * @param channelstate the channelstate to set
     */
    public void setChannelstate(String channelstate) {
        this.channelstate = channelstate;
    }

    /**
     * @return the channelstatedesc
     */
    public String getChannelstatedesc() {
        return channelstatedesc;
    }

    /**
     * @param channelstatedesc the channelstatedesc to set
     */
    public void setChannelstatedesc(String channelstatedesc) {
        this.channelstatedesc = channelstatedesc;
    }

    /**
     * @return the connectedlinename
     */
    public String getConnectedlinename() {
        return connectedlinename;
    }

    /**
     * @param connectedlinename the connectedlinename to set
     */
    public void setConnectedlinename(String connectedlinename) {
        this.connectedlinename = connectedlinename;
    }

    /**
     * @return the connectedlinenum
     */
    public String getConnectedlinenum() {
        return connectedlinenum;
    }

    /**
     * @param connectedlinenum the connectedlinenum to set
     */
    public void setConnectedlinenum(String connectedlinenum) {
        this.connectedlinenum = connectedlinenum;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the dialstring
     */
    public String getDialstring() {
        return dialstring;
    }

    /**
     * @param dialstring the dialstring to set
     */
    public void setDialstring(String dialstring) {
        this.dialstring = dialstring;
    }

    /**
     * @return the destcalleridname
     */
    public String getDestcalleridname() {
        return destcalleridname;
    }

    /**
     * @param destcalleridname the destcalleridname to set
     */
    public void setDestcalleridname(String destcalleridname) {
        this.destcalleridname = destcalleridname;
    }

    /**
     * @return the event
     */
    public String getEvent() {
        return event;
    }

    /**
     * @param event the event to set
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * @return the exten
     */
    public String getExten() {
        return exten;
    }

    /**
     * @param exten the exten to set
     */
    public void setExten(String exten) {
        this.exten = exten;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    /**
     * @param privilege the privilege to set
     */
    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    /**
     * @return the priority
     */
    public String getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * @return the uniqueid
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * @param uniqueid the uniqueid to set
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    /**
     * @return the destchannel
     */
    public String getDestchannel() {
        return destchannel;
    }

    /**
     * @param destchannel the destchannel to set
     */
    public void setDestchannel(String destchannel) {
        this.destchannel = destchannel;
    }

    /**
     * @return the destchannelstate
     */
    public String getDestchannelstate() {
        return destchannelstate;
    }

    /**
     * @param destchannelstate the destchannelstate to set
     */
    public void setDestchannelstate(String destchannelstate) {
        this.destchannelstate = destchannelstate;
    }

    /**
     * @return the destaccountcode
     */
    public String getDestaccountcode() {
        return destaccountcode;
    }

    /**
     * @param destaccountcode the destaccountcode to set
     */
    public void setDestaccountcode(String destaccountcode) {
        this.destaccountcode = destaccountcode;
    }

    /**
     * @return the destcontext
     */
    public String getDestcontext() {
        return destcontext;
    }

    /**
     * @param destcontext the destcontext to set
     */
    public void setDestcontext(String destcontext) {
        this.destcontext = destcontext;
    }

    /**
     * @return the destpriority
     */
    public String getDestpriority() {
        return destpriority;
    }

    /**
     * @param destpriority the destpriority to set
     */
    public void setDestpriority(String destpriority) {
        this.destpriority = destpriority;
    }

    /**
     * @return the destconnectedlinename
     */
    public String getDestconnectedlinename() {
        return destconnectedlinename;
    }

    /**
     * @param destconnectedlinename the destconnectedlinename to set
     */
    public void setDestconnectedlinename(String destconnectedlinename) {
        this.destconnectedlinename = destconnectedlinename;
    }

    /**
     * @return the destlanguage
     */
    public String getDestlanguage() {
        return destlanguage;
    }

    /**
     * @param destlanguage the destlanguage to set
     */
    public void setDestlanguage(String destlanguage) {
        this.destlanguage = destlanguage;
    }

    /**
     * @return the destconnectedlinenum
     */
    public String getDestconnectedlinenum() {
        return destconnectedlinenum;
    }

    /**
     * @param destconnectedlinenum the destconnectedlinenum to set
     */
    public void setDestconnectedlinenum(String destconnectedlinenum) {
        this.destconnectedlinenum = destconnectedlinenum;
    }

    /**
     * @return the destexten
     */
    public String getDestexten() {
        return destexten;
    }

    /**
     * @param destexten the destexten to set
     */
    public void setDestexten(String destexten) {
        this.destexten = destexten;
    }

    /**
     * @return the destchannelstatedesc
     */
    public String getDestchannelstatedesc() {
        return destchannelstatedesc;
    }

    /**
     * @param destchannelstatedesc the destchannelstatedesc to set
     */
    public void setDestchannelstatedesc(String destchannelstatedesc) {
        this.destchannelstatedesc = destchannelstatedesc;
    }

    /**
     * @return the destcalleridnum
     */
    public String getDestcalleridnum() {
        return destcalleridnum;
    }

    /**
     * @param destcalleridnum the destcalleridnum to set
     */
    public void setDestcalleridnum(String destcalleridnum) {
        this.destcalleridnum = destcalleridnum;
    }

    /**
     * @return the destuniqueid
     */
    public String getDestuniqueid() {
        return destuniqueid;
    }

    /**
     * @param destuniqueid the destuniqueid to set
     */
    public void setDestuniqueid(String destuniqueid) {
        this.destuniqueid = destuniqueid;
    }

      
}
