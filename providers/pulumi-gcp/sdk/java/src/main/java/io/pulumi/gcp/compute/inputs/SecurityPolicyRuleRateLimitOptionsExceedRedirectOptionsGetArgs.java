// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs Empty = new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs();

    @InputImport(name="target")
      private final @Nullable Input<String> target;

    public Input<String> getTarget() {
        return this.target == null ? Input.empty() : this.target;
    }

    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs(
        @Nullable Input<String> target,
        Input<String> type) {
        this.target = target;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs() {
        this.target = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> target;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder setTarget(@Nullable Input<String> target) {
            this.target = target;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = Input.ofNullable(target);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsGetArgs(target, type);
        }
    }
}
