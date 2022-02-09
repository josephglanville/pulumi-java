// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CmkKeyVaultPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CmkKeyVaultPropertiesArgs Empty = new CmkKeyVaultPropertiesArgs();

    @InputImport(name="keyUri")
    private final @Nullable Input<String> keyUri;

    public Input<String> getKeyUri() {
        return this.keyUri == null ? Input.empty() : this.keyUri;
    }

    public CmkKeyVaultPropertiesArgs(@Nullable Input<String> keyUri) {
        this.keyUri = keyUri;
    }

    private CmkKeyVaultPropertiesArgs() {
        this.keyUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CmkKeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyUri;

        public Builder() {
    	      // Empty
        }

        public Builder(CmkKeyVaultPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUri = defaults.keyUri;
        }

        public Builder setKeyUri(@Nullable Input<String> keyUri) {
            this.keyUri = keyUri;
            return this;
        }

        public Builder setKeyUri(@Nullable String keyUri) {
            this.keyUri = Input.ofNullable(keyUri);
            return this;
        }

        public CmkKeyVaultPropertiesArgs build() {
            return new CmkKeyVaultPropertiesArgs(keyUri);
        }
    }
}
