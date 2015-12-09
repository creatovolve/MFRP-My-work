package com.cogaip.model;

public class UserTO {

		
		private int id;
		private String firstName;
		private String lastName;
		private String gender;
		private String email;
		private String dateOfBirth;
		

		public UserTO() {
			super();
		}
		
		public UserTO(int id, String firstName, String lastName, String gender,
				String email, String dateOfBirth) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.email = email;
			this.dateOfBirth = dateOfBirth;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		
		
		
	}


