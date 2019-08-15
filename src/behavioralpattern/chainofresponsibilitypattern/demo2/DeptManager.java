package behavioralpattern.chainofresponsibilitypattern.demo2;

public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";
        if(fee < 1000){
            if("Darin".equals(user)){
                str = "request for fee " + fee + " from " + user + " is approved by department manager";
            } else {
                str = "request for fee " + fee + " from " + user + " is rejected by department manager";
            }
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }
}
