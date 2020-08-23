package me.quicksourceserver;

public class AccountType {

	private AccountTypes rankType;

	public AccountType(AccountTypes rankType) {
		this.rankType = rankType;
	}

	public AccountTypes getRankType() {
		return rankType;
	}

	public void setAccountType(AccountTypes rankType) {
		this.rankType = rankType;
	}

	public enum AccountTypes {

		TEACHER("teacher"),
		STUDENT("student");

		private final String key;

		AccountTypes(String key) {
			this.key = key;
		}

		public String getKey() {
			return key;
		}
	}
}
