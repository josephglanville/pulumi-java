// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTenantConfigurationResult {
    private final @Nullable Boolean enforcePrivateMarkdownStorage;
    private final String id;
    private final String name;
    private final String type;

    @OutputCustomType.Constructor({"enforcePrivateMarkdownStorage","id","name","type"})
    private GetTenantConfigurationResult(
        @Nullable Boolean enforcePrivateMarkdownStorage,
        String id,
        String name,
        String type) {
        this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Boolean> getEnforcePrivateMarkdownStorage() {
        return Optional.ofNullable(this.enforcePrivateMarkdownStorage);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enforcePrivateMarkdownStorage;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTenantConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enforcePrivateMarkdownStorage = defaults.enforcePrivateMarkdownStorage;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setEnforcePrivateMarkdownStorage(@Nullable Boolean enforcePrivateMarkdownStorage) {
            this.enforcePrivateMarkdownStorage = enforcePrivateMarkdownStorage;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetTenantConfigurationResult build() {
            return new GetTenantConfigurationResult(enforcePrivateMarkdownStorage, id, name, type);
        }
    }
}