// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserAccessRightResponse {
    private final String accessType;
    private final String userId;

    @OutputCustomType.Constructor({"accessType","userId"})
    private UserAccessRightResponse(
        String accessType,
        String userId) {
        this.accessType = Objects.requireNonNull(accessType);
        this.userId = Objects.requireNonNull(userId);
    }

    public String getAccessType() {
        return this.accessType;
    }
    public String getUserId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.userId = defaults.userId;
        }

        public Builder setAccessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public UserAccessRightResponse build() {
            return new UserAccessRightResponse(accessType, userId);
        }
    }
}
