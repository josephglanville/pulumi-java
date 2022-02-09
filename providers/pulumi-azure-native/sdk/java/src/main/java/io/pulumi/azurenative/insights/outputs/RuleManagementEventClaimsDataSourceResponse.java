// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleManagementEventClaimsDataSourceResponse {
    private final @Nullable String emailAddress;

    @OutputCustomType.Constructor({"emailAddress"})
    private RuleManagementEventClaimsDataSourceResponse(@Nullable String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Optional<String> getEmailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventClaimsDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String emailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventClaimsDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
        }

        public Builder setEmailAddress(@Nullable String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public RuleManagementEventClaimsDataSourceResponse build() {
            return new RuleManagementEventClaimsDataSourceResponse(emailAddress);
        }
    }
}
