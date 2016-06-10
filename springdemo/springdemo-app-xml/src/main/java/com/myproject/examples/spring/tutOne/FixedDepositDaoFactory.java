/**
 * 
 */
package com.myproject.examples.spring.tutOne;

/**
 * @author shiva koduri
 *
 */
public class FixedDepositDaoFactory {
	
	public FixedDepositDaoFactory() {
    }
	
    public static FixedDepositDao getFixedDepositDao(String daoType) {
        FixedDepositDao fixedDepositDao = null;
    	
        if("jdbc".equalsIgnoreCase(daoType)) {
        		System.out.println("Creating FixedDepositDao");
        		if(fixedDepositDao == null) {
            		fixedDepositDao = new FixedDepositDao();
        		}
        }
        return fixedDepositDao;
    }	

}
