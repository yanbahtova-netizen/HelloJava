//package javaCore3;
//
//public class BankClient {
//
//}
//interface BankWorker {
//    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;
//}
//class Bank implements BankWorker {
//    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
//        if(какое-то условие, что все ок) {
//            return true;
//        } else if(какая-то залупа){
//            return false;
//        } else if(у клиента должна быть плохая кредитная история, я хз как это написать) {
//            throw new BadCreditHistoryException("Проблемы с банковской историей");
//        } else if(и тут тоже) {
//            throw new ProblemWithLawException();
//        }
//        return false;
//    }
//}
//
//class Test {
//    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
//        try {
//            return bankWorker.checkClientForCredit(bankClient);
//        } catch (BadCreditHistoryException e) {
//            System.out.println(e.getMessage());
//            return false;
//        } catch (ProblemWithLawException e) {
//            return false;
//        }
//    }
//}
//
//class BadCreditHistoryException extends Exception {
//    // мб не здесь нужно это сообщение ставить не знаю
//    public BadCreditHistoryException(String message) {
//        super(message);
//    }
//}
//
//class ProblemWithLawException extends Exception {
//}