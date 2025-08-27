package lecture2;

public class HRManager implements LeaveApprover{
	//instance variables
		private LeaveApprover nextApprover;
		
		//implement interface methods
		@Override
		public void setNextApprover(LeaveApprover nextApprover) {
			this.nextApprover = nextApprover;
		}
		
		@Override
		public void approveLeave(LeaveRequest leaveRequest) {
			if(leaveRequest.getDays() <= 15)
				System.out.println("Leave approved by HR.");
			else if(nextApprover != null)
				nextApprover.approveLeave(leaveRequest);
			else
				System.out.println("Leave rejected.");
		}

}
