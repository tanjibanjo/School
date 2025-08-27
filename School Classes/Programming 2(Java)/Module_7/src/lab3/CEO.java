//************************************************************************
// Author: Lane Pollock
// Date: 2 Dec 2024
// Language: Java
// Assignment: Lab 3: Leave Approval
// Description: CEO class that implements LeaveAprrover to be top of CoR
//************************************************************************


package lab3;

public class CEO implements LeaveApprover {
	//implement interface methods
	@Override
	public void setNextApprover(LeaveApprover nextApprover) {
		//there is no next approver
	}
	
	@Override
	public void approveLeave(LeaveRequest request) {
		if(request.getDays() < 30) //less than 30 days
			System.out.println("Leave approved by the CEO");
		else //over 30 days
			System.out.println("Leave rejected.");
	}
	

}
