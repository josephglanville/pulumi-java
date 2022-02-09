// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedAccessSignatureAuthorizationRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final SharedAccessSignatureAuthorizationRuleResponse Empty = new SharedAccessSignatureAuthorizationRuleResponse();

    @InputImport(name="keyName", required=true)
    private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    @InputImport(name="primaryKey")
    private final @Nullable String primaryKey;

    public Optional<String> getPrimaryKey() {
        return this.primaryKey == null ? Optional.empty() : Optional.ofNullable(this.primaryKey);
    }

    @InputImport(name="rights", required=true)
    private final String rights;

    public String getRights() {
        return this.rights;
    }

    @InputImport(name="secondaryKey")
    private final @Nullable String secondaryKey;

    public Optional<String> getSecondaryKey() {
        return this.secondaryKey == null ? Optional.empty() : Optional.ofNullable(this.secondaryKey);
    }

    public SharedAccessSignatureAuthorizationRuleResponse(
        String keyName,
        @Nullable String primaryKey,
        String rights,
        @Nullable String secondaryKey) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.primaryKey = primaryKey;
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
        this.secondaryKey = secondaryKey;
    }

    private SharedAccessSignatureAuthorizationRuleResponse() {
        this.keyName = null;
        this.primaryKey = null;
        this.rights = null;
        this.secondaryKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessSignatureAuthorizationRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private @Nullable String primaryKey;
        private String rights;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessSignatureAuthorizationRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryKey = defaults.primaryKey;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setRights(String rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public SharedAccessSignatureAuthorizationRuleResponse build() {
            return new SharedAccessSignatureAuthorizationRuleResponse(keyName, primaryKey, rights, secondaryKey);
        }
    }
}
