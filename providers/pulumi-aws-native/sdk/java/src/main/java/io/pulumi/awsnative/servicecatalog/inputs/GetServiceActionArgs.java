// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceActionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceActionArgs Empty = new GetServiceActionArgs();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    public GetServiceActionArgs(String id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private GetServiceActionArgs() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetServiceActionArgs build() {
            return new GetServiceActionArgs(id);
        }
    }
}
