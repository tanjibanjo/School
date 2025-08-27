//driver to test out the leaveApprover classes

package lecture2;

public class CoRDriver {

	public static void main(String[] args) {
		// local variables
		LeaveApprover teamLead = new TeamLead();
		LeaveApprover deptManager = new DepartmentManager();
		LeaveApprover hrManager = new HRManager();
		
		//set up the chain of responsibility
		teamLead.setNextApprover(deptManager);
		deptManager.setNextApprover(hrManager);
		
		//create a leave request and test different values
		LeaveRequest leaveRequest = new LeaveRequest(16);
		
		//send the leave request for approval
		teamLead.approveLeave(leaveRequest);

	}

}
