// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the link to a Key Vault.
 * 
 */
public final class KeyVaultReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultReferenceArgs Empty = new KeyVaultReferenceArgs();

    /**
     * Azure resource ID of the Key Vault.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public KeyVaultReferenceArgs(Input<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private KeyVaultReferenceArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }
        public KeyVaultReferenceArgs build() {
            return new KeyVaultReferenceArgs(id);
        }
    }
}
