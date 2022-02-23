// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.EntityReferenceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Data proxy properties for a managed dedicated integration runtime.
 * 
 */
public final class IntegrationRuntimeDataProxyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeDataProxyPropertiesResponse Empty = new IntegrationRuntimeDataProxyPropertiesResponse();

    /**
     * The self-hosted integration runtime reference.
     * 
     */
    @InputImport(name="connectVia")
      private final @Nullable EntityReferenceResponse connectVia;

    public Optional<EntityReferenceResponse> getConnectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * The path to contain the staged data in the Blob storage.
     * 
     */
    @InputImport(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The staging linked service reference.
     * 
     */
    @InputImport(name="stagingLinkedService")
      private final @Nullable EntityReferenceResponse stagingLinkedService;

    public Optional<EntityReferenceResponse> getStagingLinkedService() {
        return this.stagingLinkedService == null ? Optional.empty() : Optional.ofNullable(this.stagingLinkedService);
    }

    public IntegrationRuntimeDataProxyPropertiesResponse(
        @Nullable EntityReferenceResponse connectVia,
        @Nullable String path,
        @Nullable EntityReferenceResponse stagingLinkedService) {
        this.connectVia = connectVia;
        this.path = path;
        this.stagingLinkedService = stagingLinkedService;
    }

    private IntegrationRuntimeDataProxyPropertiesResponse() {
        this.connectVia = null;
        this.path = null;
        this.stagingLinkedService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EntityReferenceResponse connectVia;
        private @Nullable String path;
        private @Nullable EntityReferenceResponse stagingLinkedService;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeDataProxyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.path = defaults.path;
    	      this.stagingLinkedService = defaults.stagingLinkedService;
        }

        public Builder setConnectVia(@Nullable EntityReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setStagingLinkedService(@Nullable EntityReferenceResponse stagingLinkedService) {
            this.stagingLinkedService = stagingLinkedService;
            return this;
        }
        public IntegrationRuntimeDataProxyPropertiesResponse build() {
            return new IntegrationRuntimeDataProxyPropertiesResponse(connectVia, path, stagingLinkedService);
        }
    }
}
