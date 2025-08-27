//handler for LeaveApprover interface

package lab3;

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
		else if(nextApprover != null) {
			System.out.println("Team lead cannot approve. Passing to Department Manager");
			nextApprover.approveLeave(leaveRequest);
		}
		else
			System.out.println("Leave rejected.");
	}

}
