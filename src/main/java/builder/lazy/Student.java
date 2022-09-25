package builder.lazy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String cnp;
    private String name;
    private String email;
    private String phoneNumber;
}
