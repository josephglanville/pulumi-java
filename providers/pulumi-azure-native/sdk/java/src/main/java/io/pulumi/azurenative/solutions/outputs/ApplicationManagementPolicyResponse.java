// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationManagementPolicyResponse {
    private final @Nullable String mode;

    @OutputCustomType.Constructor({"mode"})
    private ApplicationManagementPolicyResponse(@Nullable String mode) {
        this.mode = mode;
    }

    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationManagementPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationManagementPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public ApplicationManagementPolicyResponse build() {
            return new ApplicationManagementPolicyResponse(mode);
        }
    }
}
