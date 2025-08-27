//interface for a person to approve leave

package lecture2;

public interface LeaveApprover {
	//
	void setNextApprover(LeaveApprover nextApprover);
	void approveLeave(LeaveRequest leaveRequest);

}
