package lichking.security.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAPI {

	@GetMapping("/api/user")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public ResponseEntity<String> getUserInfo() {
		return ResponseEntity.ok("Hello USER ");
	}
	
	
	@GetMapping("/api/admin/user")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public ResponseEntity<String> getUserAdminInfo() {
		return ResponseEntity.ok("Hello ADMIN");
	}
}
