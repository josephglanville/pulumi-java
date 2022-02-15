// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.KeyVaultContractPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamedValueResult {
    private final String displayName;
    private final String id;
    private final @Nullable KeyVaultContractPropertiesResponse keyVault;
    private final String name;
    private final @Nullable Boolean secret;
    private final @Nullable List<String> tags;
    private final String type;
    private final @Nullable String value;

    @OutputCustomType.Constructor({"displayName","id","keyVault","name","secret","tags","type","value"})
    private GetNamedValueResult(
        String displayName,
        String id,
        @Nullable KeyVaultContractPropertiesResponse keyVault,
        String name,
        @Nullable Boolean secret,
        @Nullable List<String> tags,
        String type,
        @Nullable String value) {
        this.displayName = Objects.requireNonNull(displayName);
        this.id = Objects.requireNonNull(id);
        this.keyVault = keyVault;
        this.name = Objects.requireNonNull(name);
        this.secret = secret;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.value = value;
    }

    public String getDisplayName() {
        return this.displayName;
    }
    public String getId() {
        return this.id;
    }
    public Optional<KeyVaultContractPropertiesResponse> getKeyVault() {
        return Optional.ofNullable(this.keyVault);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Boolean> getSecret() {
        return Optional.ofNullable(this.secret);
    }
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamedValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String id;
        private @Nullable KeyVaultContractPropertiesResponse keyVault;
        private String name;
        private @Nullable Boolean secret;
        private @Nullable List<String> tags;
        private String type;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamedValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.keyVault = defaults.keyVault;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKeyVault(@Nullable KeyVaultContractPropertiesResponse keyVault) {
            this.keyVault = keyVault;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecret(@Nullable Boolean secret) {
            this.secret = secret;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public GetNamedValueResult build() {
            return new GetNamedValueResult(displayName, id, keyVault, name, secret, tags, type, value);
        }
    }
}