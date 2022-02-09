// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayApiMetadataPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayApiMetadataPropertiesResponse Empty = new GatewayApiMetadataPropertiesResponse();

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="documentation")
    private final @Nullable String documentation;

    public Optional<String> getDocumentation() {
        return this.documentation == null ? Optional.empty() : Optional.ofNullable(this.documentation);
    }

    @InputImport(name="serverUrl")
    private final @Nullable String serverUrl;

    public Optional<String> getServerUrl() {
        return this.serverUrl == null ? Optional.empty() : Optional.ofNullable(this.serverUrl);
    }

    @InputImport(name="title")
    private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    @InputImport(name="version")
    private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public GatewayApiMetadataPropertiesResponse(
        @Nullable String description,
        @Nullable String documentation,
        @Nullable String serverUrl,
        @Nullable String title,
        @Nullable String version) {
        this.description = description;
        this.documentation = documentation;
        this.serverUrl = serverUrl;
        this.title = title;
        this.version = version;
    }

    private GatewayApiMetadataPropertiesResponse() {
        this.description = null;
        this.documentation = null;
        this.serverUrl = null;
        this.title = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayApiMetadataPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String documentation;
        private @Nullable String serverUrl;
        private @Nullable String title;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayApiMetadataPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.documentation = defaults.documentation;
    	      this.serverUrl = defaults.serverUrl;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDocumentation(@Nullable String documentation) {
            this.documentation = documentation;
            return this;
        }

        public Builder setServerUrl(@Nullable String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GatewayApiMetadataPropertiesResponse build() {
            return new GatewayApiMetadataPropertiesResponse(description, documentation, serverUrl, title, version);
        }
    }
}
