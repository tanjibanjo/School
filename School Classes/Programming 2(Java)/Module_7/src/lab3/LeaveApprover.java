//interface for a person to approve leave

package lab3;

public interface LeaveApprover {
	//
	void setNextApprover(LeaveApprover nextApprover);
	void approveLeave(LeaveRequest leaveRequest);

}
