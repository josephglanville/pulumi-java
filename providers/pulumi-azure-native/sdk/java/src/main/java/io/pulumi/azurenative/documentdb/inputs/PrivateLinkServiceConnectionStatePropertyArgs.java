// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection State of the Private Endpoint Connection.
 * 
 */
public final class PrivateLinkServiceConnectionStatePropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceConnectionStatePropertyArgs Empty = new PrivateLinkServiceConnectionStatePropertyArgs();

    /**
     * The private link service connection description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The private link service connection status.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public PrivateLinkServiceConnectionStatePropertyArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> status) {
        this.description = description;
        this.status = status;
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
        private @Nullable Output<String> description;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionStatePropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.status = defaults.status;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public PrivateLinkServiceConnectionStatePropertyArgs build() {
            return new PrivateLinkServiceConnectionStatePropertyArgs(description, status);
        }
    }
}
