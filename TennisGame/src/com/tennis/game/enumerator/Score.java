package com.tennis.game.enumerator;

public enum Score {
	LOVE{
		@Override
		public String getDescription(){
			return "love";
		}
	},
	FIFTEEN{
		@Override
		public String getDescription(){
			return "fifteen";
		}
	},
	THIRTY{
		@Override
		public String getDescription(){
			return "thirty";
		}
	},
	FORTY{
		@Override
		public String getDescription(){
			return "forty";
		}
	},
	DEUCE{
		@Override
		public String getDescription(){
			return "deuce";
		}
	},
	ADVANTAGE{
		@Override
		public String getDescription(){
			return "advantage";
		}
	}
	;

	
	
	public String getDescription() {
		return null;
	}
}
