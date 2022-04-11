// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.apigateway.inputs.ClientCertificateTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientCertificateArgs Empty = new ClientCertificateArgs();

    /**
     * A description of the client certificate.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the client certificate.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ClientCertificateTagArgs>> tags;

    public Output<List<ClientCertificateTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ClientCertificateArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<ClientCertificateTagArgs>> tags) {
        this.description = description;
        this.tags = tags;
    }

    private ClientCertificateArgs() {
        this.description = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<ClientCertificateTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder tags(@Nullable Output<List<ClientCertificateTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ClientCertificateTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ClientCertificateTagArgs... tags) {
            return tags(List.of(tags));
        }        public ClientCertificateArgs build() {
            return new ClientCertificateArgs(description, tags);
        }
    }
}
