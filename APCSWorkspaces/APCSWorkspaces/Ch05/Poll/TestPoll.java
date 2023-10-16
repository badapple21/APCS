public class TestPoll {
    public static void main(String[] args){
        PollDisplayPanel votingMachine = new PollDisplayPanel("tami", "Brian", "Liz");
        votingMachine.vote1();
        votingMachine.vote2();
        votingMachine.vote2();
        System.out.println(votingMachine);
    }
}
