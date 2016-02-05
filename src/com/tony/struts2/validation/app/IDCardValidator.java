package com.tony.struts2.validation.app;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

public class IDCardValidator extends FieldValidatorSupport {

	@Override
	public void validate(Object object) throws ValidationException {

		//1.Gain field's name and value
		String fieldName = getFieldName();
		Object value = this.getFieldValue(fieldName, object);
		System.out.println(fieldName);
		System.out.println((String)value);
		
		//2.Validate
		IDCard idCard = new IDCard();
		boolean result = idCard.Verify((String)value);
		
		
		//3. If it is failed, then
		
		if(result == false){
			
			
			addFieldError(fieldName, object);
			
		}
		
		
	}

}
