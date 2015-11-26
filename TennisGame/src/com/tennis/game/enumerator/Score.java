package com.tennis.game.enumerator;

public enum Score {
	LOVE{
		@Override
		public int getIntValue() {
			return 0;
		}
		@Override
		public String getDescription(){
			return "love";
		}
	},
	FIFTEEN{
		@Override
		public int getIntValue() {
			return 15;
		}
		@Override
		public String getDescription(){
			return "fifteen";
		}
	},
	THIRTY{
		@Override
		public int getIntValue() {
			return 30;
		}
		@Override
		public String getDescription(){
			return "thirty";
		}
	},
	FORTY{
		@Override
		public int getIntValue() {
			return 40;
		}
		@Override
		public String getDescription(){
			return "forty";
		}
	}
	;

	
	
	public String getDescription() {
		return null;
	}
	public int getIntValue(){
		return -1;
	}
}
