// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Link with additional information about a product.
 * 
 */
public final class ProductLinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProductLinkResponse Empty = new ProductLinkResponse();

    /**
     * The description of the link.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * The URI corresponding to the link.
     * 
     */
    @InputImport(name="uri")
      private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public ProductLinkResponse(
        @Nullable String displayName,
        @Nullable String uri) {
        this.displayName = displayName;
        this.uri = uri;
    }

    private ProductLinkResponse() {
        this.displayName = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductLinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductLinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.uri = defaults.uri;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public ProductLinkResponse build() {
            return new ProductLinkResponse(displayName, uri);
        }
    }
}
