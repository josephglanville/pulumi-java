// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImportPipelineSourcePropertiesResponse {
    private final String keyVaultUri;
    private final @Nullable String type;
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"keyVaultUri","type","uri"})
    private ImportPipelineSourcePropertiesResponse(
        String keyVaultUri,
        @Nullable String type,
        @Nullable String uri) {
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
        this.type = type;
        this.uri = uri;
    }

    public String getKeyVaultUri() {
        return this.keyVaultUri;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImportPipelineSourcePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyVaultUri;
        private @Nullable String type;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ImportPipelineSourcePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setKeyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public ImportPipelineSourcePropertiesResponse build() {
            return new ImportPipelineSourcePropertiesResponse(keyVaultUri, type, uri);
        }
    }
}
