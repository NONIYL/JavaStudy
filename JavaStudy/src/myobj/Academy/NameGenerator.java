package myobj.Academy;

public class NameGenerator {

	public class StunumGenerator {
		// 다른 클래스에서 쓸 필요가 없는 자원들을 private으로 숨겨놓는다
		private String[] lasttNameCandidates = { "김", "이", "박", "신" };
		private String[] firstNameCandidates = { "영", "철", "수", "지", "민", "식", "시" };

		public void setLastNameCandidates(String... lastNames) {
			this.lasttNameCandidates = lastNames;
		}

		public void setFirstNameCandidates(String... firstNamesCandidates) {
			this.lasttNameCandidates = firstNameCandidates;
		}

		// 다른 클래스에서 쓸 필요가 없는 기능들을 private 숨겨놓는다
		private String selectRandomOne(String[] arr) {
			return arr[(int) (Math.random() * arr.length)];
		}

		public String getRandomName2() {
			return selectRandomOne(lasttNameCandidates) 
				+ selectRandomOne(firstNameCandidates)
				+ selectRandomOne(firstNameCandidates);
		}
	}

	public String generator() {
		// TODO Auto-generated method stub
		return null;
	}
}
