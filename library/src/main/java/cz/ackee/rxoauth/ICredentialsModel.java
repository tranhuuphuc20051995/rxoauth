package cz.ackee.rxoauth;

/**
 * Model for credentials
 * Created by David Bilik[david.bilik@ackee.cz] on {05/08/16}
 **/
public interface ICredentialsModel {

    public String getAccessToken();

    public String getRefreshToken();
}
