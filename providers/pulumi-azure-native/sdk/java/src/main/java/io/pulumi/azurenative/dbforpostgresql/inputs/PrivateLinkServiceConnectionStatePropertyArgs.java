// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class PrivateLinkServiceConnectionStatePropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStatePropertyArgs Empty = new PrivateLinkServiceConnectionStatePropertyArgs();

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="description", required=true)
      private final Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status", required=true)
      private final Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }

    public PrivateLinkServiceConnectionStatePropertyArgs(
        Output<String> description,
        Output<String> status) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private PrivateLinkServiceConnectionStatePropertyArgs() {
        this.description = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> description;
        private Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder description(Output<String> description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder description(String description) {
            this.description = Output.of(Objects.requireNonNull(description));
            return this;
        }
        public Builder status(Output<String> status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder status(String status) {
            this.status = Output.of(Objects.requireNonNull(status));
            return this;
        }        public PrivateLinkServiceConnectionStatePropertyArgs build() {
            return new PrivateLinkServiceConnectionStatePropertyArgs(description, status);
        }
    }
}
