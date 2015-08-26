package br.khomp.kami.controle;

import br.khomp.kami.entidade.Call;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CallTableModel extends AbstractTableModel{
	
	//constantes p/identificar colunas
	private final int ActionID = 0;
	private final int Channel  = 1;
	private final int Status   = 2;
        private final int vazio    = 3;
	
	
	private final String colunas[]={"ActionID", "Channel (Orig)", "Status", "Channel (Dest)"};
	private final List<Call> dados;//usamos como dados uma lista gen�rica de Empregado
	
	public CallTableModel(List<Call> dados) {
		//seto os dados no construtor
		this.dados = dados;
	}
	
	@Override
	public int getColumnCount() {
		//retorna o total de colunas
		return colunas.length;
	}

	@Override
	public int getRowCount() {
		//retorna o total de linhas na tabela
		return dados.size();
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		//retorna o tipo de dado, para cada coluna
		switch (columnIndex) {
		case ActionID:
                    return String.class;
		case Channel:
                    return String.class;
		case Status:
                    return String.class;
                case vazio:
                    return String.class;
		default:
			throw new IndexOutOfBoundsException("Coluna Invalida!!!");
		}
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return colunas[columnIndex];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//retorna o valor conforme a coluna e linha
		
		//pega o dados corrente da linha
		Call call = dados.get(rowIndex);
		
		//retorna o valor da coluna
		switch (columnIndex) {
		case ActionID:
			return call.getActionID();
		case Channel:
			return call.getChannel();
		case Status:
			return call.getStatus();
		case vazio:
			return call.getVazio();
		default:
			throw new IndexOutOfBoundsException("Coluna Invalida!!!");
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
//		//metodo identifica qual coluna � editavel
//		
//		//s� iremos editar a coluna BENEFICIO, 
//		//que ser� um checkbox por ser boolean
//		if(columnIndex == BENEFICIO)
//			return true;
		
		return false;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
//		Call call=dados.get(rowIndex);
//		
//		if(columnIndex == BENEFICIO){
//			call.setBeneficio(((boolean)aValue));
//		}
	}
	
	/*M�todos abaixo s�o para manipula��o de dados*/
	
	/**
	 * retorna o valor da linha indicada
	 * @param rowIndex
	 * @return
	 */
	public Call getValue(int rowIndex){
		return dados.get(rowIndex);
	}
	
	/**
	 * retorna o indice do objeto
	 * @param call
	 * @return
	 */
	public int indexOf(Call call) {
		return dados.indexOf(call);
	}
	
	/**
	 * add um empregado � lista
	 * @param call
	 */
	public void onAdd(Call call) {
		dados.add(call);
		fireTableRowsInserted(indexOf(call), indexOf(call));
	}
	
	/**
	 * add uma lista de empregados
	 * @param dadosIn
	 */
	public void onAddAll(List<Call> dadosIn) {
		dados.addAll(dadosIn);
		fireTableDataChanged();
	}
	
	/**
	 * remove um registro da lista, atrav�s do indice
	 * @param rowIndex
	 */
	public void onRemove(int rowIndex) {
		dados.remove(rowIndex);
		fireTableRowsDeleted(rowIndex, rowIndex);
	}
	
	/**
	 * remove um registro da lista, atrav�s do objeto
	 * @param call
	 */
	public void onRemove(Call call) {
		dados.remove(call);
		fireTableRowsDeleted(indexOf(call), indexOf(call));
	}
	
	/**
	 * remove todos registros da lista
	 */
	public void onRemoveAll() {
		dados.clear();
		fireTableDataChanged();
	}
	
}
