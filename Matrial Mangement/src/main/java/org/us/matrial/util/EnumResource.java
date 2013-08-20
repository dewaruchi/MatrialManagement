package org.us.matrial.util;

public interface EnumResource {

	public enum Lunas {
		LUNAS("Lunas"), HUTANG("Hutang");
		Lunas(String s) {
			status = s;
		}

		private String status;

		public String getStatus() {
			return status;
		}

	}

	public enum Tipe {
		SALES("Sales"), OPERATIONAL("Operational");

		Tipe(String s) {
			status = s;
		}

		private String status;

		public String getStatus() {
			return status;
		}

	}
}
