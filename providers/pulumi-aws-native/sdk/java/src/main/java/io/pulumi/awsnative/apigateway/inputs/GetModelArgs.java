// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetModelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetModelArgs Empty = new GetModelArgs();

    /**
     * A name for the model. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the model name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The ID of a REST API with which to associate this model.
     * 
     */
    @InputImport(name="restApiId", required=true)
      private final String restApiId;

    public String getRestApiId() {
        return this.restApiId;
    }

    public GetModelArgs(
        String name,
        String restApiId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.restApiId = Objects.requireNonNull(restApiId, "expected parameter 'restApiId' to be non-null");
    }

    private GetModelArgs() {
        this.name = null;
        this.restApiId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String restApiId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.restApiId = defaults.restApiId;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRestApiId(String restApiId) {
            this.restApiId = Objects.requireNonNull(restApiId);
            return this;
        }
        public GetModelArgs build() {
            return new GetModelArgs(name, restApiId);
        }
    }
}
