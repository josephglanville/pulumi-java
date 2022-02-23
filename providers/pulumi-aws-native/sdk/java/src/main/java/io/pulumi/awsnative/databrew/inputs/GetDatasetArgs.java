// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDatasetArgs Empty = new GetDatasetArgs();

    /**
     * Dataset name
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetDatasetArgs(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetDatasetArgs() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetDatasetArgs build() {
            return new GetDatasetArgs(name);
        }
    }
}
