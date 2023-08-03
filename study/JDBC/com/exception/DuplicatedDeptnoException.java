package com.exception;

// 사용자 정의 예외 클래스 ==> 예외 발생시 try~catch 또는 throws에 사용 가능
public class DuplicatedDeptnoException extends Exception {

	public DuplicatedDeptnoException(String message) {
		super(message);
	}
}
