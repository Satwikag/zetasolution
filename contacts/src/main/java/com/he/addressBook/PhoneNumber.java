package com.he.addressBook;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) throws Exception {
		if (label == null || label.isEmpty() || label.length() > 255 || !onlyLettersSpaces(label)) {
			throw new IllegalArgumentException("label has not valid content.");
		}
		//String regex = "\\d{10}";
		if(phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("phoneNumber is not valid number");
		}
		this.label = label;
		this.phoneNumber = phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
	public static boolean onlyLettersSpaces(String label) {
		for (int i = 0; i < label.length(); i++) {
			char ch = label.charAt(i);
			if (Character.isLetter(ch) || ch == ' ') {
				continue;
			}
			return false;
		}
		return true;
	}
}
