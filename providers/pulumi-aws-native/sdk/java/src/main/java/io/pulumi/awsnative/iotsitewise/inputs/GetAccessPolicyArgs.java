// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccessPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAccessPolicyArgs Empty = new GetAccessPolicyArgs();

    /**
     * The ID of the access policy.
     * 
     */
    @Import(name="accessPolicyId", required=true)
      private final String accessPolicyId;

    public String getAccessPolicyId() {
        return this.accessPolicyId;
    }

    public GetAccessPolicyArgs(String accessPolicyId) {
        this.accessPolicyId = Objects.requireNonNull(accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
    }

    private GetAccessPolicyArgs() {
        this.accessPolicyId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPolicyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicyId = defaults.accessPolicyId;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            this.accessPolicyId = Objects.requireNonNull(accessPolicyId);
            return this;
        }        public GetAccessPolicyArgs build() {
            return new GetAccessPolicyArgs(accessPolicyId);
        }
    }
}
