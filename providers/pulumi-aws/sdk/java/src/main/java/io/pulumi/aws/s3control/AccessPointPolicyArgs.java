// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AccessPointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPointPolicyArgs Empty = new AccessPointPolicyArgs();

    /**
     * The ARN of the access point that you want to associate with the specified policy.
     * 
     */
    @Import(name="accessPointArn", required=true)
      private final Output<String> accessPointArn;

    public Output<String> getAccessPointArn() {
        return this.accessPointArn;
    }

    /**
     * The policy that you want to apply to the specified access point.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public AccessPointPolicyArgs(
        Output<String> accessPointArn,
        Output<String> policy) {
        this.accessPointArn = Objects.requireNonNull(accessPointArn, "expected parameter 'accessPointArn' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private AccessPointPolicyArgs() {
        this.accessPointArn = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessPointArn;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPointArn = defaults.accessPointArn;
    	      this.policy = defaults.policy;
        }

        public Builder accessPointArn(Output<String> accessPointArn) {
            this.accessPointArn = Objects.requireNonNull(accessPointArn);
            return this;
        }
        public Builder accessPointArn(String accessPointArn) {
            this.accessPointArn = Output.of(Objects.requireNonNull(accessPointArn));
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public AccessPointPolicyArgs build() {
            return new AccessPointPolicyArgs(accessPointArn, policy);
        }
    }
}
