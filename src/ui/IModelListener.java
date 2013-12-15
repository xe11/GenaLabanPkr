package ui;

import org.json.simple.JSONObject;

import controller.AuthorizedProfile;
import controller.Profile;

public interface IModelListener {
	public void transferDataTable(int idTabel, Profile[] profiles, int bank, int diller, int activeProfile );
	
	public void errorContinueGame();
	
	public void confirmationRestration();
	public void errorRegistration();
	
	public void confirmationAuthorization(AuthorizedProfile profile);
	public void errorAuthorization();
	
	public void transferMoneyInformation();
	
	
	public void newPlayer(Profile profile);
}
