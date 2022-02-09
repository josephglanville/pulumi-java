// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JwtClaimChecksArgs extends io.pulumi.resources.ResourceArgs {

    public static final JwtClaimChecksArgs Empty = new JwtClaimChecksArgs();

    @InputImport(name="allowedClientApplications")
    private final @Nullable Input<List<String>> allowedClientApplications;

    public Input<List<String>> getAllowedClientApplications() {
        return this.allowedClientApplications == null ? Input.empty() : this.allowedClientApplications;
    }

    @InputImport(name="allowedGroups")
    private final @Nullable Input<List<String>> allowedGroups;

    public Input<List<String>> getAllowedGroups() {
        return this.allowedGroups == null ? Input.empty() : this.allowedGroups;
    }

    public JwtClaimChecksArgs(
        @Nullable Input<List<String>> allowedClientApplications,
        @Nullable Input<List<String>> allowedGroups) {
        this.allowedClientApplications = allowedClientApplications;
        this.allowedGroups = allowedGroups;
    }

    private JwtClaimChecksArgs() {
        this.allowedClientApplications = Input.empty();
        this.allowedGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtClaimChecksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedClientApplications;
        private @Nullable Input<List<String>> allowedGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtClaimChecksArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedClientApplications = defaults.allowedClientApplications;
    	      this.allowedGroups = defaults.allowedGroups;
        }

        public Builder setAllowedClientApplications(@Nullable Input<List<String>> allowedClientApplications) {
            this.allowedClientApplications = allowedClientApplications;
            return this;
        }

        public Builder setAllowedClientApplications(@Nullable List<String> allowedClientApplications) {
            this.allowedClientApplications = Input.ofNullable(allowedClientApplications);
            return this;
        }

        public Builder setAllowedGroups(@Nullable Input<List<String>> allowedGroups) {
            this.allowedGroups = allowedGroups;
            return this;
        }

        public Builder setAllowedGroups(@Nullable List<String> allowedGroups) {
            this.allowedGroups = Input.ofNullable(allowedGroups);
            return this;
        }

        public JwtClaimChecksArgs build() {
            return new JwtClaimChecksArgs(allowedClientApplications, allowedGroups);
        }
    }
}
