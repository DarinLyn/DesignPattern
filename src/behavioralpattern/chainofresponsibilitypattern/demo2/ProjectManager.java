package behavioralpattern.chainofresponsibilitypattern.demo2;

public class ProjectManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {

        String str = "";
        if(fee < 500){
            if("Darin".equals(user)){
                str = "request for fee " + fee + " from " + user + " is approved by project manager";
            } else {
                str = "request for fee " + fee + " from " + user + " is rejected by project manager";
            }
        }else {
            if(getSuccessor()!=null){
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }

        return str;
    }


}
