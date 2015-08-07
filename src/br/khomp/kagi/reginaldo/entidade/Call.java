package br.khomp.kagi.reginaldo.entidade;


public class Call {
	private String actionID;
	private String channel;
	private String status;
	private String vazio;	
	
	public Call() {
		//inicializando variaveis
		this.actionID = "";
		this.channel  = "";
		this.status   = "";
		this.vazio    = "";		
	}

	/**
	 * @return the ActionID
	 */
	public String getActionID() {
		return actionID;
	}

	/**
	 * @param actionID the ActionID to set
	 */
	public void setActionID(String actionID) {
		this.actionID = actionID;
	}

	/**
	 * @return the Channel
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * @param channel the Channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * @return the Status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the Status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the vazio
	 */
	public String getVazio() {
		return vazio;
	}

	/**
	 * @param vazio the Vazio to set
	 */
	public void setVazio(String vazio) {
		this.vazio = vazio;
	}	
	
}
