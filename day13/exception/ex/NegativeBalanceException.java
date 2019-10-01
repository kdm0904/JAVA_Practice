package org.day13.exception.ex;

public class NegativeBalanceException extends RuntimeException {

public void Negative() {
	System.out.println("인출금이 잔액보다 많습니다");
}

}
