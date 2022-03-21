// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * API metadata property for Spring Cloud Gateway
 * 
 */
public final class GatewayApiMetadataPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayApiMetadataPropertiesArgs Empty = new GatewayApiMetadataPropertiesArgs();

    /**
     * Detailed description of the APIs available on the Gateway instance (default: `Generated OpenAPI 3 document that describes the API routes configured.`)
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Location of additional documentation for the APIs available on the Gateway instance
     * 
     */
    @Import(name="documentation")
      private final @Nullable Output<String> documentation;

    public Output<String> getDocumentation() {
        return this.documentation == null ? Output.empty() : this.documentation;
    }

    /**
     * Base URL that API consumers will use to access APIs on the Gateway instance.
     * 
     */
    @Import(name="serverUrl")
      private final @Nullable Output<String> serverUrl;

    public Output<String> getServerUrl() {
        return this.serverUrl == null ? Output.empty() : this.serverUrl;
    }

    /**
     * Title describing the context of the APIs available on the Gateway instance (default: `Spring Cloud Gateway for K8S`)
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    /**
     * Version of APIs available on this Gateway instance (default: `unspecified`).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public GatewayApiMetadataPropertiesArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> documentation,
        @Nullable Output<String> serverUrl,
        @Nullable Output<String> title,
        @Nullable Output<String> version) {
        this.description = description;
        this.documentation = documentation;
        this.serverUrl = serverUrl;
        this.title = title;
        this.version = version;
    }

    private GatewayApiMetadataPropertiesArgs() {
        this.description = Output.empty();
        this.documentation = Output.empty();
        this.serverUrl = Output.empty();
        this.title = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayApiMetadataPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> documentation;
        private @Nullable Output<String> serverUrl;
        private @Nullable Output<String> title;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayApiMetadataPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.documentation = defaults.documentation;
    	      this.serverUrl = defaults.serverUrl;
    	      this.title = defaults.title;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder documentation(@Nullable Output<String> documentation) {
            this.documentation = documentation;
            return this;
        }
        public Builder documentation(@Nullable String documentation) {
            this.documentation = Output.ofNullable(documentation);
            return this;
        }
        public Builder serverUrl(@Nullable Output<String> serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public Builder serverUrl(@Nullable String serverUrl) {
            this.serverUrl = Output.ofNullable(serverUrl);
            return this;
        }
        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }
        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public GatewayApiMetadataPropertiesArgs build() {
            return new GatewayApiMetadataPropertiesArgs(description, documentation, serverUrl, title, version);
        }
    }
}
