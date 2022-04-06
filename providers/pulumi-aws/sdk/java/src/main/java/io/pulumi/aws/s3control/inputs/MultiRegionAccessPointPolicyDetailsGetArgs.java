// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class MultiRegionAccessPointPolicyDetailsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointPolicyDetailsGetArgs Empty = new MultiRegionAccessPointPolicyDetailsGetArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * A valid JSON document that specifies the policy that you want to associate with this Multi-Region Access Point. Once applied, the policy can be edited, but not deleted. For more information, see the documentation on [Multi-Region Access Point Permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/MultiRegionAccessPointPermissions.html).
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public MultiRegionAccessPointPolicyDetailsGetArgs(
        Output<String> name,
        Output<String> policy) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private MultiRegionAccessPointPolicyDetailsGetArgs() {
        this.name = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointPolicyDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointPolicyDetailsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public MultiRegionAccessPointPolicyDetailsGetArgs build() {
            return new MultiRegionAccessPointPolicyDetailsGetArgs(name, policy);
        }
    }
}