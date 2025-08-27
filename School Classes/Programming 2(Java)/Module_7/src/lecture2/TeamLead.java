//handler for LeaveApprover interface

package lecture2;

public class TeamLead implements LeaveApprover{
	//instance variables
	private LeaveApprover nextApprover;
	
	//implement interface methods
	@Override
	public void setNextApprover(LeaveApprover nextApprover) {
		this.nextApprover = nextApprover;
	}
	
	@Override
	public void approveLeave(LeaveRequest leaveRequest) {
		if(leaveRequest.getDays() <= 5)
			System.out.println("Leave approved by team lead.");
		else if(nextApprover != null)
			nextApprover.approveLeave(leaveRequest);
		else
			System.out.println("Leave rejected.");
	}

}
