// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIntegrationRuntimeObjectMetadatumArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIntegrationRuntimeObjectMetadatumArgs Empty = new GetIntegrationRuntimeObjectMetadatumArgs();

    @InputImport(name="integrationRuntimeName", required=true)
    private final String integrationRuntimeName;

    public String getIntegrationRuntimeName() {
        return this.integrationRuntimeName;
    }

    @InputImport(name="metadataPath")
    private final @Nullable String metadataPath;

    public Optional<String> getMetadataPath() {
        return this.metadataPath == null ? Optional.empty() : Optional.ofNullable(this.metadataPath);
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="workspaceName", required=true)
    private final String workspaceName;

    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public GetIntegrationRuntimeObjectMetadatumArgs(
        String integrationRuntimeName,
        @Nullable String metadataPath,
        String resourceGroupName,
        String workspaceName) {
        this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName, "expected parameter 'integrationRuntimeName' to be non-null");
        this.metadataPath = metadataPath;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private GetIntegrationRuntimeObjectMetadatumArgs() {
        this.integrationRuntimeName = null;
        this.metadataPath = null;
        this.resourceGroupName = null;
        this.workspaceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String integrationRuntimeName;
        private @Nullable String metadataPath;
        private String resourceGroupName;
        private String workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeObjectMetadatumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.metadataPath = defaults.metadataPath;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setIntegrationRuntimeName(String integrationRuntimeName) {
            this.integrationRuntimeName = Objects.requireNonNull(integrationRuntimeName);
            return this;
        }

        public Builder setMetadataPath(@Nullable String metadataPath) {
            this.metadataPath = metadataPath;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public GetIntegrationRuntimeObjectMetadatumArgs build() {
            return new GetIntegrationRuntimeObjectMetadatumArgs(integrationRuntimeName, metadataPath, resourceGroupName, workspaceName);
        }
    }
}
