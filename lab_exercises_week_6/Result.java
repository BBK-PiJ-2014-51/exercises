public enum Result{
	HIT(){
		public void announce(){
			System.out.println("Well Done! You hit the target!");
		}
	},
	FAIL_LEFT(){
		public void announce(){
			System.out.println("You missed! The Target is to the right!");
		}
	}
	,
	FAIL_RIGHT(){
		public void announce(){
			System.out.println("You missed! The Target is to the left!");
		}
	}
	,
	FAIL_HIGH(){
		public void announce(){
			System.out.println("You missed! You're too high!");
		}
	}
	,
	FAIL_LOW(){
		public void announce(){
			System.out.println("You missed! You're too low!");
		}
	}
	, 
	
	FAIL_SHORT(){
		public void announce(){
			System.out.println("You missed! You're too short!");
		}
	}
	, 
	FAIL_LONG(){
		public void announce(){
			System.out.println("You missed! Too far!");
		}
	}
	, 
	OUT_OF_RANGE(){
		public void announce(){
			System.out.println("You missed! You're  off the radar!");
		}
	};

	public void announce() {
		
		
	}


}