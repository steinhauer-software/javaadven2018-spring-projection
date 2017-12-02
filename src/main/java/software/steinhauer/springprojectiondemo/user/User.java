package software.steinhauer.springprojectiondemo.user;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@EqualsAndHashCode(doNotUseGetters = true)
@ToString(doNotUseGetters = true)
public class User implements Serializable {

	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq")
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "user_seq")
	private Long id;

	@Basic
	private String username;

	@Basic
	private String password;
}
