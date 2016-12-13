/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenaciouspanda.jobstretch;

import com.tenaciouspanda.jobstretch.database.Business;
import com.tenaciouspanda.jobstretch.database.DBconnection;
import com.tenaciouspanda.jobstretch.database.User;
import com.tenaciouspanda.jobstretch.database.StaticConnection;
import java.util.Date;
/**
 * Performs actions on behalf of a user. A user logs into one session.
 * The session performs the business logic on behalf of the user.
 * 
 * @author Simon
 */
public class Session {
    protected User currentUser;
    private Object selected = null;
    
    /**
     * Authenticate the user on the system.
     * Sets the current user for the session
     * 
     * @param username username of user
     * @param password password of user
     * @return true if successful
     */
    public boolean authenticate(String username, String password){
        int returned = DBconnection.checkLoginCred(username, password);
        if(     returned != DBconnection.RESULT_CONNECT_FAILED &&
                returned != DBconnection.RESULT_EXIST) {
            currentUser = new User(returned);
            currentUser.setContacts();
            return true;
        }
        return false;
    }
    /**
     * check auth status
     * 
     * @return true if authenticated
     */
    public boolean isAuthenticated(){
        return currentUser != null;
    }

    /**
     * Register user on system
     * @param user - username
     * @param pass password
     * @param fname first name
     * @param lname last name
     * @param city
     * @param street
     * @param state
     * @param zip
     * @param occu occupation
     * @param bus business
     * @param sum summary
     * @param startDate
     * @param endDate
     * @param employed true if is employed
     * @return true if successful
     */
    public boolean register(
            String user, 
            String pass, 
            String fname, 
            String lname, 
            String city, 
            String street, 
            String state, 
            int zip, 
            String occu, 
            String bus, 
            String sum, 
            String startDate, 
            String endDate, 
            boolean employed){
        int result = DBconnection.createAccount(
                user, pass,
                fname, lname,
                city, street, state, zip,
                occu, bus,
                sum,
                startDate, endDate,
                employed);
        
        return (result == DBconnection.RESULT_OK);
    }

    /**
     * Logout current user from session
     */
    public void logout() {
        this.currentUser = null;
        StaticConnection.closeConnection();
    }
    
    /**
     * Search users in database by firstname and lastname
     * @param fname first name
     * @param lname last name
     * @return list of Users found
     */
    public User[] searchUsers(String fname, String lname){
         return DBconnection.searchUser(fname, lname);
     }
    /**
     * Search users who are connected to the current user
     * @param queryString
     * @return 
     */
    public User[] searchConnectedUser(String queryString){
        return DBconnection.searchConnectedUser(
                currentUser.getUserID(), queryString);
    }
    /**
     * Search users who are not connected to the current user
     * @param fname
     * @param lname
     * @return 
     */
    public User[] searchUnconnectedUser(String fname, String lname){
        return DBconnection.searchUnconnectedUser(
                currentUser.getUserID(), fname, lname);
    }

    /**
     * Add an existing user as a connection of the current user
     * @param newUser 
     */
    public void addConnection(User newUser) {
        DBconnection.addContact(currentUser.getUserID(), newUser.getUserID());
    }
    
    /**
     * Add a new connection for the user of someone not in the system
     * 
     * @param fname
     * @param lname
     * @param city
     * @param street
     * @param state
     * @param zip
     * @param occu
     * @param bus
     * @param start
     * @param end
     * @param employed 
     */
    public boolean addNewConnection(
            String fname, String lname,
            String city, String street, String state, int zip,
            String occu,
            String bus,
            Date start, Date end,
            boolean employed) {
        return DBconnection.addNonexistantContact(currentUser.getUserID(),
            fname, lname,
            city, street, state, zip,
            occu,
            bus,
            start, end,
            employed);
    }

    /**
     * Gets the current user
     * @return the current user
     */
    public User getCurrentUser() {
        return currentUser;
    }

    /**
     * Select an object to consider
     * 
     * @param o either a Business or a User
     */
    public void select(Object o) {
        selected = o;
    }

    /**
     * Retrieve the currently selected value
     * @return the selected item
     */
    public Object getSelected() {
        return selected;
    }

    /**
     * Search database for businesses with querystring in name
     * @param query
     * @return list of matching businesses
     */
    public Business[] searchBusinesses(String query) {
        return DBconnection.searchBusinesses(query);
    }
    
    /**
     * Create a new business
     * @param bn business name
     * @param i industry
     * @param f founded date
     * @param w web url
     * @param s summary
     * @return 0 if successful
     */
    public int addNewBusiness(String bn, String i, Date f, String w, String s) {
        return DBconnection.addNewBusiness(bn, i, f, w, s);
    }

    /**
     * add location for company
     * @param businessName
     * @param street
     * @param city
     * @param state
     * @param zip
     * @return true if successful
     */
    public boolean addCompanyLocation(String businessName, String street, String city, String state,  int zip) {
        return DBconnection.addBusinessLocation(businessName, street, city, state, zip);
    }
}
