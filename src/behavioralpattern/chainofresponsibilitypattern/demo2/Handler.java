package behavioralpattern.chainofresponsibilitypattern.demo2;

public abstract class Handler {

    /**
     * next object to process the request
     */
    protected Handler successor = null;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * process fee request
     * @param user  applicant
     * @param fee   request amount
     * @return  result
     */
    public abstract String handleFeeRequest(String user, double fee);
}
