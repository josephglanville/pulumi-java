// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Identifies the Azure key vault associated with a Batch account.
 * 
 */
public final class KeyVaultReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultReferenceArgs Empty = new KeyVaultReferenceArgs();

    /**
     * The resource ID of the Azure key vault associated with the Batch account.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * The URL of the Azure key vault associated with the Batch account.
     * 
     */
    @InputImport(name="url", required=true)
      private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public KeyVaultReferenceArgs(
        Input<String> id,
        Input<String> url) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private KeyVaultReferenceArgs() {
        this.id = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.url = defaults.url;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public KeyVaultReferenceArgs build() {
            return new KeyVaultReferenceArgs(id, url);
        }
    }
}
