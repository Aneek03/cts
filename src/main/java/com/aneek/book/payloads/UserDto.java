// 4th
package com.aneek.book.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
// this class is used for Data transfer. createUser function in the
//UserService interface will return the object of UserDto

	// this data will directly exposed to Api's . we will not effect our entity class.
	
	 private int id;
	 private String name;
	 private String email;
	 private String password;
	 private String about;
	 
}
