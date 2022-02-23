// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The key vault reference.
 * 
 */
public final class KeyVaultKeyReferenceKeyVaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultKeyReferenceKeyVaultArgs Empty = new KeyVaultKeyReferenceKeyVaultArgs();

    /**
     * The resource id.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public KeyVaultKeyReferenceKeyVaultArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private KeyVaultKeyReferenceKeyVaultArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceKeyVaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceKeyVaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public KeyVaultKeyReferenceKeyVaultArgs build() {
            return new KeyVaultKeyReferenceKeyVaultArgs(id);
        }
    }
}
