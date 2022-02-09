// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.EntityReferenceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IntegrationRuntimeDataProxyPropertiesResponse {
    private final @Nullable EntityReferenceResponse connectVia;
    private final @Nullable String path;
    private final @Nullable EntityReferenceResponse stagingLinkedService;

    @OutputCustomType.Constructor({"connectVia","path","stagingLinkedService"})
    private IntegrationRuntimeDataProxyPropertiesResponse(
        @Nullable EntityReferenceResponse connectVia,
        @Nullable String path,
        @Nullable EntityReferenceResponse stagingLinkedService) {
        this.connectVia = connectVia;
        this.path = path;
        this.stagingLinkedService = stagingLinkedService;
    }

    public Optional<EntityReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<EntityReferenceResponse> getStagingLinkedService() {
        return Optional.ofNullable(this.stagingLinkedService);
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
