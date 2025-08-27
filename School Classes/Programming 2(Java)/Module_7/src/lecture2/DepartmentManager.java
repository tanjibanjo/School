//department manager position

package lecture2;

public class DepartmentManager implements LeaveApprover{
	//instance variables
		private LeaveApprover nextApprover;
		
		//implement interface methods
		@Override
		public void setNextApprover(LeaveApprover nextApprover) {
			this.nextApprover = nextApprover;
		}
		
		@Override
		public void approveLeave(LeaveRequest leaveRequest) {
			if(leaveRequest.getDays() <= 10)
				System.out.println("Leave approved by deprtment manager.");
			else if(nextApprover != null)
				nextApprover.approveLeave(leaveRequest);
			else
				System.out.println("Leave rejected.");
		}

}
