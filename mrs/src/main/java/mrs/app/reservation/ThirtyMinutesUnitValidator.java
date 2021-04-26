package mrs.app.reservation;

import java.time.LocalTime;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ThirtyMinutesUnitValidator
		implements ConstraintValidator<ThirtyMinutesUnit, LocalTime>{
	@Override
	public void initialize(ThirtyMinutesUnit constraintAnnotation) {
		
	}
	
	@Override
	public boolean isValid(LocalTime value, ConstraintValidatorContext context) {
		if (value == null) {
			return true;
			// 入力値がnullの場合はこのValidatorではチェックせず、他のルール（@NotNullなど）に移譲する
		}
		return value.getMinute() % 30 == 0;
	}

}
