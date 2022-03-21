// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCredentialsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCredentialsArgs Empty = new GetCredentialsArgs();

    @Import(name="registryId", required=true)
      private final String registryId;

    public String getRegistryId() {
        return this.registryId;
    }

    public GetCredentialsArgs(String registryId) {
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private GetCredentialsArgs() {
        this.registryId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryId = defaults.registryId;
        }

        public Builder registryId(String registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }        public GetCredentialsArgs build() {
            return new GetCredentialsArgs(registryId);
        }
    }
}
