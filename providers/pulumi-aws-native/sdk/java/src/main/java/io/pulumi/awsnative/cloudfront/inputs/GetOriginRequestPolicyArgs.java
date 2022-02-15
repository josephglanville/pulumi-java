// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOriginRequestPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOriginRequestPolicyArgs Empty = new GetOriginRequestPolicyArgs();

    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    public GetOriginRequestPolicyArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetOriginRequestPolicyArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public GetOriginRequestPolicyArgs build() {
            return new GetOriginRequestPolicyArgs(id);
        }
    }
}