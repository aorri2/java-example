package example.user;

import java.util.Collections;
import java.util.List;

public class JoinUserValidator implements Validator {
    List<UserPolicy> validityPolicyList = Collections.emptyList();

    @Override
    public void checkValidity(User user) {
        validityPolicyList.forEach(vp -> vp.apply(user));
    }
}
