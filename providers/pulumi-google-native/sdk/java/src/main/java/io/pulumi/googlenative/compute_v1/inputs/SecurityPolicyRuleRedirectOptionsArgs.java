// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.SecurityPolicyRuleRedirectOptionsType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRedirectOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRedirectOptionsArgs Empty = new SecurityPolicyRuleRedirectOptionsArgs();

    /**
     * Target for the redirect action. This is required if the type is EXTERNAL_302 and cannot be specified for GOOGLE_RECAPTCHA.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> getTarget() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    /**
     * Type of the redirect action.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<SecurityPolicyRuleRedirectOptionsType> type;

    public Output<SecurityPolicyRuleRedirectOptionsType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public SecurityPolicyRuleRedirectOptionsArgs(
        @Nullable Output<String> target,
        @Nullable Output<SecurityPolicyRuleRedirectOptionsType> type) {
        this.target = target;
        this.type = type;
    }

    private SecurityPolicyRuleRedirectOptionsArgs() {
        this.target = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> target;
        private @Nullable Output<SecurityPolicyRuleRedirectOptionsType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRedirectOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }
        public Builder type(@Nullable Output<SecurityPolicyRuleRedirectOptionsType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable SecurityPolicyRuleRedirectOptionsType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public SecurityPolicyRuleRedirectOptionsArgs build() {
            return new SecurityPolicyRuleRedirectOptionsArgs(target, type);
        }
    }
}
